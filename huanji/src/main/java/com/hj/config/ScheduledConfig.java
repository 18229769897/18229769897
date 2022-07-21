package com.hj.config;

import com.hj.entity.HjAgentUser;
import com.hj.entity.HjStoreOrder;
import com.hj.entity.HjUser;
import com.hj.entity.HjUserBill;
import com.hj.service.HjAgentUserService;
import com.hj.service.HjStoreOrderService;
import com.hj.service.HjUserBillService;
import com.hj.service.HjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Configuration
@EnableScheduling
public class ScheduledConfig {

    @Autowired
    HjAgentUserService hjAgentUserService;
    @Autowired
    HjUserService hjUserService;
    @Autowired
    HjStoreOrderService hjStoreOrderService;
    @Autowired
    HjUserBillService hjUserBillService;

//    @Scheduled(cron = "00 50 23 * * ?")
//    public void autoCloseOrder(){
//
//        List<HjAgentUser> hjAgentUserList = hjAgentUserService.findAll();
//        for(int i = 0; i < hjAgentUserList.size(); i++){
//            HjAgentUser hjAgentUser = hjAgentUserList.get(i);
//            Date date = hjAgentUser.getCreateTime();
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String time = simpleDateFormat.format(date);
//            BigDecimal price = hjStoreOrderService.findByIsFa(hjAgentUser.getProvince(),hjAgentUser.getCity(),hjAgentUser.getDistrict(),hjAgentUser.getStreet(),hjAgentUser.getAgentLevel(),time);
//            System.out.println(price);
//            if(price.compareTo(BigDecimal.valueOf(0))>0) {
//                hjStoreOrderService.updateByArea(hjAgentUser.getProvince(), hjAgentUser.getCity(), hjAgentUser.getDistrict(), hjAgentUser.getStreet(), hjAgentUser.getAgentLevel());
//                HjUser hjUser = hjUserService  .findByUid(hjAgentUser.getUid());
//                Double scale = 0.0;
//                switch (hjAgentUser.getAgentLevel()) {
//                    case 1:
//                        scale = 0.1;
//                        break;
//                    case 2:
//                        scale = 0.2;
//                        break;
//                    case 3:
//                        scale = 0.3;
//                        break;
//                    default:
//                        scale = 0.4;
//                        break;
//                }
//                BigDecimal award = price.multiply(BigDecimal.valueOf(scale)).divide(BigDecimal.valueOf(100), 2, BigDecimal.ROUND_HALF_UP);
//                HjUserBill hjUserBill = new HjUserBill();
//                hjUserBill.setCategory("money_dl");
//                hjUserBill.setPm((byte) 1);
//                hjUserBill.setUid(hjUser.getUid());
//                hjUserBill.setNumber(award);
//                hjUserBill.setBalance((hjUser.getMoneyDl().add(award)).setScale(2, BigDecimal.ROUND_UP));
//                hjUserBill.setTitle("代理商收入");
//                hjUserBill.setLinkId(String.valueOf(hjUser.getUid()));
//                hjUserBill.setType("money_dl");
//                hjUserBill.setStatus(true);
//                hjUserBill.setMark("代理商收入");
//                hjUserBillService.add(hjUserBill);
//                hjUser.setMoneyDl( hjUser.getMoneyDl().add(award));
//                System.out.println(hjUser.getBrokeragePrice()+"aaa");
//                System.out.println(hjUser.getMoneyDl()+"aaa");
//                hjUserService.update(hjUser);
//            }
//        }
//
//    }

    @Scheduled(cron = "00 50 23 * * ?")
    public void autoCloseOrder(){
       List<HjStoreOrder> hjStoreOrderList = hjStoreOrderService.findByIsFa();
       for(int i = 0; i < hjStoreOrderList.size(); i++){
            HjStoreOrder hjStoreOrder = hjStoreOrderList.get(i);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = hjStoreOrder.getCreateTime();
            String time = simpleDateFormat.format(date);
            HjUser hjUser = hjStoreOrder.getHjUser();
            HjAgentUser hjAgentUserProvince = hjAgentUserService.findByAreaAndTime(hjUser.getProvince(),hjUser.getCity(),hjUser.getDistrict(),hjUser.getStreet(),1,time);
            if(hjAgentUserProvince!=null){
                addMoneyDl(hjStoreOrder.getOrderId(),hjStoreOrder.getPayPrice(),hjAgentUserProvince,1);
            }
            HjAgentUser hjAgentUserCity = hjAgentUserService.findByAreaAndTime(hjUser.getProvince(),hjUser.getCity(),hjUser.getDistrict(),hjUser.getStreet(),2,time);
            if(hjAgentUserCity!=null){
                addMoneyDl(hjStoreOrder.getOrderId(),hjStoreOrder.getPayPrice(),hjAgentUserCity,2);
            }
           HjAgentUser hjAgentUserDistrict = hjAgentUserService.findByAreaAndTime(hjUser.getProvince(),hjUser.getCity(),hjUser.getDistrict(),hjUser.getStreet(),3,time);
           if(hjAgentUserDistrict!=null){
               addMoneyDl(hjStoreOrder.getOrderId(),hjStoreOrder.getPayPrice(),hjAgentUserDistrict,3);
           }
           HjAgentUser hjAgentUserStreet = hjAgentUserService.findByAreaAndTime(hjUser.getProvince(),hjUser.getCity(),hjUser.getDistrict(),hjUser.getStreet(),4,time);
           if(hjAgentUserStreet!=null){
               addMoneyDl(hjStoreOrder.getOrderId(),hjStoreOrder.getPayPrice(),hjAgentUserStreet,4);
           }
           hjStoreOrder.setIsFa(1);
           hjStoreOrderService.update(hjStoreOrder);
       }


    }

    public void addMoneyDl(Integer uid,BigDecimal price,HjAgentUser hjAgentUser,Integer level){
        HjUser hjUser = hjAgentUser.getHjUser();
        System.out.println(uid+","+hjUser.getUid());
        Double scale = 0.0;
                switch (level) {
                    case 1:
                        scale = 0.1;
                        break;
                    case 2:
                        scale = 0.2;
                        break;
                    case 3:
                        scale = 0.3;
                        break;
                    default:
                        scale = 0.4;
                        break;
                }
                if(hjAgentUser.getDistrict().equals("锡山区")){
                    scale = 0.1;
                }
                BigDecimal award = price.multiply(BigDecimal.valueOf(scale)).divide(BigDecimal.valueOf(100), 2, BigDecimal.ROUND_HALF_UP);
                HjUserBill hjUserBill = new HjUserBill();
                hjUserBill.setCategory("money_dl");
                hjUserBill.setPm((byte) 1);
                hjUserBill.setUid(hjUser.getUid());
                hjUserBill.setNumber(award);
                hjUserBill.setBalance((hjUser.getMoneyDl().add(award)).setScale(2, BigDecimal.ROUND_UP));
                hjUserBill.setTitle("代理商收入");
                hjUserBill.setLinkId(String.valueOf(hjUser.getUid()));
                hjUserBill.setType("money_dl");
                hjUserBill.setStatus(true);
                hjUserBill.setMark("代理商收入");
                hjUserBillService.add(hjUserBill);
                hjUser.setMoneyDl( hjUser.getMoneyDl().add(award));
                hjUserService.update(hjUser);
    }

}
