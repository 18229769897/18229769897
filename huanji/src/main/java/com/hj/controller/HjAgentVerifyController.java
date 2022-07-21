package com.hj.controller;

import com.hj.entity.HjAgentUser;
import com.hj.entity.HjAgentVerify;
import com.hj.entity.HjUser;
import com.hj.service.HjAgentUserService;
import com.hj.service.HjAgentVerifyService;
import com.hj.service.HjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("hjAgentVerify")
public class HjAgentVerifyController {


    @Autowired
    HjAgentVerifyService hjAgentVerifyService;
    @Autowired
    HjAgentUserService hjAgentUserService;
    @Autowired
    HjUserService hjUserService;


    @RequestMapping("put")
    public Map<String,Object> HjAgentVerifyPut(@RequestBody HjAgentVerify hjAgentVerify){
        System.out.println(hjAgentVerify);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String handleTime =  simpleDateFormat.format(date);
        Map<String,Object> map = new HashMap<>();
        if(hjAgentVerify.getVerifyId()!=null){
            hjAgentVerify.setHandleTime(new Date());
            hjAgentVerifyService.update(hjAgentVerify);
            if(hjAgentVerify.getStatus()==1){
                HjAgentUser hjAgentUser = new HjAgentUser();
                hjAgentUser.setCity(hjAgentVerify.getCity());
                hjAgentUser.setDistrict(hjAgentVerify.getDistrict());
                hjAgentUser.setProvince(hjAgentVerify.getProvince());
                hjAgentUser.setStreet(hjAgentVerify.getStreet());
                hjAgentUser.setUid(hjAgentVerify.getUid());
                hjAgentUser.setAgentLevel(hjAgentVerify.getAgentLevel());
                hjAgentUserService.add(hjAgentUser);
            }
        }else{
            HjUser hjUser = hjUserService.findByUid(hjAgentVerify.getUid());
            if(hjAgentUserService.findByAreaAndLevel(hjUser.getProvince(),hjUser.getCity(),hjUser.getDistrict(),hjUser.getStreet(),hjAgentVerify.getAgentLevel())!=null){
                map.put("status",400);
                map.put("message","此代理已存在");
            }else{
                map.put("status",200);
                map.put("message","申请已提交");
            }
            hjAgentVerify.setProvince(hjUser.getProvince());
            hjAgentVerify.setCity(hjUser.getCity());
            hjAgentVerify.setDistrict(hjUser.getDistrict());
            hjAgentVerify.setStreet(hjUser.getStreet());
            hjAgentVerifyService.add(hjAgentVerify);
        }
        map.put("data",null);

        return map;
    }

    @RequestMapping("findByUid")
    public Map<String,Object> findByUid(Integer uid){
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> data = new HashMap<>();
        List<HjAgentVerify> hjAgentVerifyList = hjAgentVerifyService.findByUid(uid);
        map.put("data",hjAgentVerifyList);
        map.put("message",null);
        map.put("status",200);
        return map;
    }




}
