package com.hj.service.impl;

import com.hj.dao.HjStoreOrderMapper;
import com.hj.entity.HjStoreOrder;
import com.hj.service.HjStoreOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class HjStoreOrderServiceImpl implements HjStoreOrderService {

    @Autowired
    HjStoreOrderMapper hjStoreOrderMapper;

    @Override
    public BigDecimal findByArea(String province, String city, String district, String street, Integer level) {
        return hjStoreOrderMapper.selectByArea(province, city, district, street, level);
    }

    @Override
    public Integer updateByArea(String province, String city, String district, String street, Integer level) {
        return hjStoreOrderMapper.updateByArea(province, city, district, street, level);
    }

//    @Override
//    public BigDecimal findByIsFa(String province, String city, String district, String street, Integer level,String time) {
//        return hjStoreOrderMapper.selectByIsfa(province, city, district, street, level,time);
//    }

    @Override
    public BigDecimal findByAreaTime(String province, String city, String district, String street, Integer level, String time) {
        return hjStoreOrderMapper.selectByAreaByTime(province, city, district, street, level, time);
    }

    @Override
    public List<HjStoreOrder> findByIsFa() {
        return hjStoreOrderMapper.selectByIsFa();
    }

    @Override
    public Integer update(HjStoreOrder hjStoreOrder) {
        return hjStoreOrderMapper.updateByPrimaryKeySelective(hjStoreOrder);
    }
}
