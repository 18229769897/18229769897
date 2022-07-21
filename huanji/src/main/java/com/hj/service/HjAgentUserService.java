package com.hj.service;

import com.hj.entity.HjAgentUser;

import java.util.List;

public interface HjAgentUserService {
    public Integer add(HjAgentUser hjAgentUser);
    public Integer update(HjAgentUser hjAgentUser);
    public HjAgentUser findByUid(Integer uid);
    public List<HjAgentUser> findAll();
    public HjAgentUser findByAreaAndLevel(String province, String city, String district, String street,Integer level);

    public HjAgentUser findByAreaAndTime(String province, String city, String district, String street,Integer level,String time);
}
