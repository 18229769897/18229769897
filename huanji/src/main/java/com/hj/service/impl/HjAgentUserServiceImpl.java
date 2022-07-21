package com.hj.service.impl;

import com.hj.dao.HjAgentUserMapper;
import com.hj.entity.HjAgentUser;
import com.hj.service.HjAgentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HjAgentUserServiceImpl implements HjAgentUserService {

    @Autowired
    HjAgentUserMapper hjAgentUserMapper;

    @Override
    public Integer add(HjAgentUser hjAgentUser) {
        return hjAgentUserMapper.insertSelective(hjAgentUser);
    }

    @Override
    public Integer update(HjAgentUser hjAgentUser) {
        return hjAgentUserMapper.updateByPrimaryKeySelective(hjAgentUser);
    }

    @Override
    public HjAgentUser findByUid(Integer uid) {
        return hjAgentUserMapper.selectByUid(uid);
    }

    @Override
    public List<HjAgentUser> findAll() {
        return hjAgentUserMapper.selectAll();
    }

    @Override
    public HjAgentUser findByAreaAndLevel(String province, String city, String district, String street, Integer level) {
        return hjAgentUserMapper.selectByArealAndLevel(province, city, district, street, level);
    }

    @Override
    public HjAgentUser findByAreaAndTime(String province, String city, String district, String street, Integer level, String time) {
        return hjAgentUserMapper.selectByArealAndTime(province, city, district, street, level, time);
    }


}
