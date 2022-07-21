package com.hj.service;

import com.hj.entity.HjUserBill;

import java.math.BigDecimal;
import java.util.List;

public interface HjUserBillService {
    public Integer add(HjUserBill hjUserBill);
    public Integer update(HjUserBill hjUserBill);
    public BigDecimal findByUidAndCategory(Integer uid);
    public List<HjUserBill> findByUidAndPage(Integer uid,Integer page,Integer limit);
}
