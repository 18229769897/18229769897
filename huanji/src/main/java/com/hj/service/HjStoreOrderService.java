package com.hj.service;

import com.hj.entity.HjStoreOrder;

import java.math.BigDecimal;
import java.util.List;

public interface HjStoreOrderService {
    public BigDecimal findByArea(String province, String city, String district, String street,Integer level);
    public Integer updateByArea(String province, String city, String district, String street,Integer level);
//    public BigDecimal findByIsFa(String province, String city, String district, String street,Integer level,String time);
    public BigDecimal findByAreaTime(String province, String city, String district, String street,Integer level,String time);

    public List<HjStoreOrder> findByIsFa();

    public Integer update(HjStoreOrder hjStoreOrder);

}
