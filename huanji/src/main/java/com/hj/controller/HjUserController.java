package com.hj.controller;


import com.hj.entity.HjAgentUser;
import com.hj.entity.HjUser;
import com.hj.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("hjAgentUser")
public class HjUserController {

    @Autowired
    HjUserService hjUserService;
    @Autowired
    HjStoreOrderService hjStoreOrderService;
    @Autowired
    HjUserBillService hjUserBillService;
    @Autowired
    HjAgentUserService hjAgentUserService;
    @Autowired
    HjAgentVerifyService hjAgentVerifyService;

    @RequestMapping("findByUid")
    public Map<String, Object> findByUid(Integer uid){

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String time = simpleDateFormat.format(date);
        HjAgentUser hjAgentUser = hjAgentUserService.findByUid(uid);
        Integer code = 0;
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        if(hjAgentUserService.findByUid(uid)!=null){
            String province = hjAgentUser.getProvince();
            String city = hjAgentUser.getCity();
            String district = hjAgentUser.getDistrict();
            String street = hjAgentUser.getStreet();
            Integer level = hjAgentUser.getAgentLevel();
            Integer num = hjUserService.findByArea(province, city, district, street, level);
            BigDecimal achievement = hjStoreOrderService.findByArea(province, city, district, street, level);
            BigDecimal achievementDay = hjStoreOrderService.findByAreaTime(province, city, district, street, level, time);
            BigDecimal income = hjUserBillService.findByUidAndCategory(uid);
            data.put("income", income);
            data.put("areaNumber", num);
            data.put("achievement", achievement);
            data.put("achievementDay", achievementDay);
            data.put("hjAgentUser", hjAgentUser);
            code = 200;
        }else if(hjAgentVerifyService.findByUidAndStatus(uid,0).size()>0){
            code = 3;
        }else{
            code = 2;
        }
        data.put("code",code);
        map.put("status", 200);
        map.put("data", data);
        map.put("message",null);
        return map;
    }


    @RequestMapping({"findAgentIncome"})
    public Map<String, Object> findAgentIncome(Integer uid, Integer page, Integer limit) {
        Map<String, Object> map = new HashMap();
        Map<String, Object> data = new HashMap();
        page = (page - 1) * limit;
        if (hjAgentUserService.findByUid(uid) == null) {
            map.put("status", 0);
            map.put("message", "您还不是代理商");
            map.put("data", data);
        } else {
            map.put("status", 200);
            map.put("message", "获取成功");
            data.put("ebUserBill", this.hjUserBillService.findByUidAndPage(uid, page, limit));
            map.put("data", data);
        }

        return map;
    }

    @RequestMapping("ceshi")
    public void ceshi(){
        HjUser hjUser = hjUserService.findByUid(17);
        Date date = hjUser.getCreateTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));
    }



}
