package com.hj.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HjStoreOrder implements Serializable {
    private Integer orderId;

    private Integer mainId;

    private HjUser hjUser;

    private Integer groupOrderId;

    private String orderSn;

    private Integer uid;

    private Integer spreadUid;

    private Integer topUid;

    private String realName;

    private String userPhone;

    private String userAddress;

    private String cartId;

    private Integer totalNum;

    private BigDecimal totalPrice;

    private BigDecimal totalPostage;

    private BigDecimal payPrice;

    private BigDecimal payPostage;

    private Byte isSelfbuy;

    private BigDecimal extensionOne;

    private BigDecimal extensionTwo;

    private BigDecimal commissionRate;

    private Integer integral;

    private BigDecimal integralPrice;

    private Integer giveIntegral;

    private String couponId;

    private BigDecimal couponPrice;

    private BigDecimal platformCouponPrice;

    private Byte orderType;

    private Boolean type;

    private Byte paid;

    private Date payTime;

    private Boolean payType;

    private Date createTime;

    private Boolean status;

    private String deliveryType;

    private Byte isVirtual;

    private String deliveryName;

    private String deliveryId;

    private String mark;

    private String remark;

    private String adminMark;

    private String verifyCode;

    private Date verifyTime;

    private Integer verifyServiceId;

    private String transactionId;

    private Byte activityType;

    private String orderExtend;

    private Integer merId;

    private Byte reconciliationId;

    private BigDecimal cost;

    private Byte isDel;

    private Boolean isSystemDel;

    private Integer stageId;

    private Byte stageStauts;

    private String stageName;

    private String blockName;

    private Integer isFa;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMainId() {
        return mainId;
    }

    public void setMainId(Integer mainId) {
        this.mainId = mainId;
    }

    public Integer getGroupOrderId() {
        return groupOrderId;
    }

    public void setGroupOrderId(Integer groupOrderId) {
        this.groupOrderId = groupOrderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSpreadUid() {
        return spreadUid;
    }

    public void setSpreadUid(Integer spreadUid) {
        this.spreadUid = spreadUid;
    }

    public Integer getTopUid() {
        return topUid;
    }

    public void setTopUid(Integer topUid) {
        this.topUid = topUid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId == null ? null : cartId.trim();
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPostage() {
        return totalPostage;
    }

    public void setTotalPostage(BigDecimal totalPostage) {
        this.totalPostage = totalPostage;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public BigDecimal getPayPostage() {
        return payPostage;
    }

    public void setPayPostage(BigDecimal payPostage) {
        this.payPostage = payPostage;
    }

    public Byte getIsSelfbuy() {
        return isSelfbuy;
    }

    public void setIsSelfbuy(Byte isSelfbuy) {
        this.isSelfbuy = isSelfbuy;
    }

    public BigDecimal getExtensionOne() {
        return extensionOne;
    }

    public void setExtensionOne(BigDecimal extensionOne) {
        this.extensionOne = extensionOne;
    }

    public BigDecimal getExtensionTwo() {
        return extensionTwo;
    }

    public void setExtensionTwo(BigDecimal extensionTwo) {
        this.extensionTwo = extensionTwo;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getIntegralPrice() {
        return integralPrice;
    }

    public void setIntegralPrice(BigDecimal integralPrice) {
        this.integralPrice = integralPrice;
    }

    public Integer getGiveIntegral() {
        return giveIntegral;
    }

    public void setGiveIntegral(Integer giveIntegral) {
        this.giveIntegral = giveIntegral;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public BigDecimal getPlatformCouponPrice() {
        return platformCouponPrice;
    }

    public void setPlatformCouponPrice(BigDecimal platformCouponPrice) {
        this.platformCouponPrice = platformCouponPrice;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Byte getPaid() {
        return paid;
    }

    public void setPaid(Byte paid) {
        this.paid = paid;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType == null ? null : deliveryType.trim();
    }

    public Byte getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Byte isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName == null ? null : deliveryName.trim();
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId == null ? null : deliveryId.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAdminMark() {
        return adminMark;
    }

    public void setAdminMark(String adminMark) {
        this.adminMark = adminMark == null ? null : adminMark.trim();
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public Integer getVerifyServiceId() {
        return verifyServiceId;
    }

    public void setVerifyServiceId(Integer verifyServiceId) {
        this.verifyServiceId = verifyServiceId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Byte getActivityType() {
        return activityType;
    }

    public void setActivityType(Byte activityType) {
        this.activityType = activityType;
    }

    public String getOrderExtend() {
        return orderExtend;
    }

    public void setOrderExtend(String orderExtend) {
        this.orderExtend = orderExtend == null ? null : orderExtend.trim();
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Byte getReconciliationId() {
        return reconciliationId;
    }

    public void setReconciliationId(Byte reconciliationId) {
        this.reconciliationId = reconciliationId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public Boolean getIsSystemDel() {
        return isSystemDel;
    }

    public void setIsSystemDel(Boolean isSystemDel) {
        this.isSystemDel = isSystemDel;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public Byte getStageStauts() {
        return stageStauts;
    }

    public void setStageStauts(Byte stageStauts) {
        this.stageStauts = stageStauts;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName == null ? null : blockName.trim();
    }

    public Integer getIsFa() {
        return isFa;
    }

    public void setIsFa(Integer isFa) {
        this.isFa = isFa;
    }

    public HjUser getHjUser() {
        return hjUser;
    }

    public void setHjUser(HjUser hjUser) {
        this.hjUser = hjUser;
    }
}