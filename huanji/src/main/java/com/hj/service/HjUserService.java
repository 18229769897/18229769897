package com.hj.service;

import com.hj.entity.HjUser;

public interface HjUserService {
    public Integer add(HjUser hjUser);
    public Integer update(HjUser hjUser);
    public HjUser findByUid(Integer uid);
    public Integer findByArea(String province, String city, String district, String street,Integer level);
}
