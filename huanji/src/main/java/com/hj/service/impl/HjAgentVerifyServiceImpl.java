package com.hj.service.impl;

import com.hj.dao.HjAgentUserMapper;
import com.hj.dao.HjAgentVerifyMapper;
import com.hj.entity.HjAgentVerify;
import com.hj.service.HjAgentVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HjAgentVerifyServiceImpl implements HjAgentVerifyService {

    @Autowired
    HjAgentVerifyMapper hjAgentVerifyMapper;

    @Override
    public Integer add(HjAgentVerify hjAgentVerify) {
        return hjAgentVerifyMapper.insertSelective(hjAgentVerify);
    }

    @Override
    public Integer update(HjAgentVerify hjAgentVerify) {
        return hjAgentVerifyMapper.updateByPrimaryKeySelective(hjAgentVerify);
    }



    @Override
    public List<HjAgentVerify> findByUid(Integer uid) {
        return hjAgentVerifyMapper.selectByUid(uid);
    }

    @Override
    public List<HjAgentVerify> findByUidAndStatus(Integer uid, Integer status) {
        System.out.println(hjAgentVerifyMapper.selectByUidAndStatus(uid,status));
        return hjAgentVerifyMapper.selectByUidAndStatus(uid,status);
    }
}
