package com.hj.service.impl;

import com.hj.dao.HjUserBillMapper;
import com.hj.entity.HjUser;
import com.hj.entity.HjUserBill;
import com.hj.service.HjUserBillService;
import com.hj.service.HjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class HjUserBillServiceImpl implements HjUserBillService {

    @Autowired
    HjUserBillMapper hjUserBillMapper;

    @Override
    public Integer add(HjUserBill hjUserBill) {
        return hjUserBillMapper.insertSelective(hjUserBill);
    }

    @Override
    public Integer update(HjUserBill hjUserBill) {
        return hjUserBillMapper.updateByPrimaryKeySelective(hjUserBill);
    }

    @Override
    public BigDecimal findByUidAndCategory(Integer uid) {
        return hjUserBillMapper.selectByUid(uid);
    }

    @Override
    public List<HjUserBill> findByUidAndPage(Integer uid,Integer page,Integer limit) {
        return hjUserBillMapper.selectByUidAndPage(uid, page, limit);
    }
}
