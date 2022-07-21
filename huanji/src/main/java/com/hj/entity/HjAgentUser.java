package com.hj.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HjAgentUser implements Serializable {
    private Integer agentId;

    private Integer uid;

    private Integer agentLevel;

    private String province;

    private String city;

    private String district;

    private Date createTime;

    private BigDecimal moneyDl;

    private String street;

    private HjUser hjUser;

    private static final long serialVersionUID = 1L;

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Integer agentLevel) {
        this.agentLevel = agentLevel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getMoneyDl() {
        return moneyDl;
    }

    public void setMoneyDl(BigDecimal moneyDl) {
        this.moneyDl = moneyDl;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public HjUser getHjUser() {
        return hjUser;
    }

    public void setHjUser(HjUser hjUser) {
        this.hjUser = hjUser;
    }
}