package com.hj.service;

import com.hj.entity.HjAgentVerify;

import java.util.List;

public interface HjAgentVerifyService {
    public Integer add(HjAgentVerify hjAgentVerify);
    public Integer update(HjAgentVerify hjAgentVerify);
    public List<HjAgentVerify> findByUid(Integer uid);
    public List<HjAgentVerify> findByUidAndStatus(Integer uid,Integer status);
}
