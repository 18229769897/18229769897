package com.hj.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HjUser implements Serializable {
    private Integer uid;

    private Integer wechatUserId;

    private String account;

    private String pwd;

    private String payPwd;

    private String realName;

    private String cardId;

    private Byte isReals;

    private Byte level;

    private Byte sex;

    private Date birthday;

    private String mark;

    private String labelId;

    private Integer groupId;

    private String nickname;

    private String avatar;

    private String phone;

    private String addres;

    private Date cancelTime;

    private Date createTime;

    private Date lastTime;

    private String lastIp;

    private BigDecimal nowMoney;

    private BigDecimal brokeragePrice;

    private BigDecimal waitReleased;

    private Integer coupons;

    private BigDecimal lovePoints;

    private Integer integral;

    private BigDecimal moneyDl;

    private Byte status;

    private Integer spreadUid;

    private Date spreadTime;

    private Date spreadLimit;

    private Integer brokerageLevel;

    private String userType;

    private Date promoterTime;

    private Byte isPromoter;

    private Integer mainUid;

    private Integer payCount;

    private BigDecimal payPrice;

    private Integer spreadCount;

    private Integer spreadPayCount;

    private BigDecimal spreadPayPrice;

    private Integer countFans;

    private Integer memberValue;

    private Integer countStart;

    private Integer lockBrokerageAmount;

    private String province;

    private String city;

    private String district;

    private String street;

    private Integer dlLevel;

    private String spreadPath;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getWechatUserId() {
        return wechatUserId;
    }

    public void setWechatUserId(Integer wechatUserId) {
        this.wechatUserId = wechatUserId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd == null ? null : payPwd.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public Byte getIsReals() {
        return isReals;
    }

    public void setIsReals(Byte isReals) {
        this.isReals = isReals;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId == null ? null : labelId.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres == null ? null : addres.trim();
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public BigDecimal getNowMoney() {
        return nowMoney;
    }

    public void setNowMoney(BigDecimal nowMoney) {
        this.nowMoney = nowMoney;
    }

    public BigDecimal getBrokeragePrice() {
        return brokeragePrice;
    }

    public void setBrokeragePrice(BigDecimal brokeragePrice) {
        this.brokeragePrice = brokeragePrice;
    }

    public BigDecimal getWaitReleased() {
        return waitReleased;
    }

    public void setWaitReleased(BigDecimal waitReleased) {
        this.waitReleased = waitReleased;
    }

    public Integer getCoupons() {
        return coupons;
    }

    public void setCoupons(Integer coupons) {
        this.coupons = coupons;
    }

    public BigDecimal getLovePoints() {
        return lovePoints;
    }

    public void setLovePoints(BigDecimal lovePoints) {
        this.lovePoints = lovePoints;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getMoneyDl() {
        return moneyDl;
    }

    public void setMoneyDl(BigDecimal moneyDl) {
        this.moneyDl = moneyDl;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getSpreadUid() {
        return spreadUid;
    }

    public void setSpreadUid(Integer spreadUid) {
        this.spreadUid = spreadUid;
    }

    public Date getSpreadTime() {
        return spreadTime;
    }

    public void setSpreadTime(Date spreadTime) {
        this.spreadTime = spreadTime;
    }

    public Date getSpreadLimit() {
        return spreadLimit;
    }

    public void setSpreadLimit(Date spreadLimit) {
        this.spreadLimit = spreadLimit;
    }

    public Integer getBrokerageLevel() {
        return brokerageLevel;
    }

    public void setBrokerageLevel(Integer brokerageLevel) {
        this.brokerageLevel = brokerageLevel;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Date getPromoterTime() {
        return promoterTime;
    }

    public void setPromoterTime(Date promoterTime) {
        this.promoterTime = promoterTime;
    }

    public Byte getIsPromoter() {
        return isPromoter;
    }

    public void setIsPromoter(Byte isPromoter) {
        this.isPromoter = isPromoter;
    }

    public Integer getMainUid() {
        return mainUid;
    }

    public void setMainUid(Integer mainUid) {
        this.mainUid = mainUid;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getSpreadCount() {
        return spreadCount;
    }

    public void setSpreadCount(Integer spreadCount) {
        this.spreadCount = spreadCount;
    }

    public Integer getSpreadPayCount() {
        return spreadPayCount;
    }

    public void setSpreadPayCount(Integer spreadPayCount) {
        this.spreadPayCount = spreadPayCount;
    }

    public BigDecimal getSpreadPayPrice() {
        return spreadPayPrice;
    }

    public void setSpreadPayPrice(BigDecimal spreadPayPrice) {
        this.spreadPayPrice = spreadPayPrice;
    }

    public Integer getCountFans() {
        return countFans;
    }

    public void setCountFans(Integer countFans) {
        this.countFans = countFans;
    }

    public Integer getMemberValue() {
        return memberValue;
    }

    public void setMemberValue(Integer memberValue) {
        this.memberValue = memberValue;
    }

    public Integer getCountStart() {
        return countStart;
    }

    public void setCountStart(Integer countStart) {
        this.countStart = countStart;
    }

    public Integer getLockBrokerageAmount() {
        return lockBrokerageAmount;
    }

    public void setLockBrokerageAmount(Integer lockBrokerageAmount) {
        this.lockBrokerageAmount = lockBrokerageAmount;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public Integer getDlLevel() {
        return dlLevel;
    }

    public void setDlLevel(Integer dlLevel) {
        this.dlLevel = dlLevel;
    }

    public String getSpreadPath() {
        return spreadPath;
    }

    public void setSpreadPath(String spreadPath) {
        this.spreadPath = spreadPath == null ? null : spreadPath.trim();
    }
}