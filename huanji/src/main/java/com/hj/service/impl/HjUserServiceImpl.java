package com.hj.service.impl;

import com.hj.dao.HjUserMapper;
import com.hj.entity.HjUser;
import com.hj.service.HjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HjUserServiceImpl implements HjUserService {

    @Autowired
    HjUserMapper hjUserMapper;

    @Override
    public Integer add(HjUser hjUser) {
        return hjUserMapper.insertSelective(hjUser);
    }

    @Override
    public Integer update(HjUser hjUser) {
        return hjUserMapper.updateByPrimaryKeySelective(hjUser);
    }

    @Override
    public HjUser findByUid(Integer uid){
        return hjUserMapper.selectByPrimaryKey(uid);
    }

    @Override
    public Integer findByArea(String province, String city, String district, String street, Integer level) {
        return hjUserMapper.selectNumberByArea(province, city, district, street, level);
    }
}
