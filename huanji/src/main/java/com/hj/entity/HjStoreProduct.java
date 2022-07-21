package com.hj.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HjStoreProduct implements Serializable {
    private Integer productId;

    private Integer merId;

    private String storeName;

    private String storeInfo;

    private String keyword;

    private String barCode;

    private Integer brandId;

    private Byte isShow;

    private Boolean status;

    private Byte isDel;

    private Boolean merStatus;

    private Integer cateId;

    private String unitName;

    private Short sort;

    private Short rank;

    private Integer sales;

    private BigDecimal price;

    private BigDecimal cost;

    private BigDecimal otPrice;

    private Integer stock;

    private Byte isHot;

    private Byte isBenefit;

    private Byte isBest;

    private Byte isNew;

    private Boolean isGood;

    private Byte productType;

    private Integer ficti;

    private Integer browse;

    private String codePath;

    private String videoLink;

    private Integer tempId;

    private Boolean specType;

    private Boolean extensionType;

    private String refusal;

    private BigDecimal rate;

    private Integer replyCount;

    private String giveCouponIds;

    private Boolean isGiftBag;

    private Date createTime;

    private Integer careCount;

    private Integer isUsed;

    private Integer oldProductId;

    private String image;

    private String sliderImage;

    private Integer guaranteeTemplateId;

    private Integer onceCount;

    private Integer integralRate;

    private Integer integralTotal;

    private BigDecimal integralPriceTotal;

    private String labels;

    private String deliveryWay;

    private Integer deliveryFree;

    private Byte type;

    private String extend;

    private Integer blockId;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreInfo() {
        return storeInfo;
    }

    public void setStoreInfo(String storeInfo) {
        this.storeInfo = storeInfo == null ? null : storeInfo.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public Boolean getMerStatus() {
        return merStatus;
    }

    public void setMerStatus(Boolean merStatus) {
        this.merStatus = merStatus;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Short getRank() {
        return rank;
    }

    public void setRank(Short rank) {
        this.rank = rank;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getOtPrice() {
        return otPrice;
    }

    public void setOtPrice(BigDecimal otPrice) {
        this.otPrice = otPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Byte getIsBenefit() {
        return isBenefit;
    }

    public void setIsBenefit(Byte isBenefit) {
        this.isBenefit = isBenefit;
    }

    public Byte getIsBest() {
        return isBest;
    }

    public void setIsBest(Byte isBest) {
        this.isBest = isBest;
    }

    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsGood() {
        return isGood;
    }

    public void setIsGood(Boolean isGood) {
        this.isGood = isGood;
    }

    public Byte getProductType() {
        return productType;
    }

    public void setProductType(Byte productType) {
        this.productType = productType;
    }

    public Integer getFicti() {
        return ficti;
    }

    public void setFicti(Integer ficti) {
        this.ficti = ficti;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public String getCodePath() {
        return codePath;
    }

    public void setCodePath(String codePath) {
        this.codePath = codePath == null ? null : codePath.trim();
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink == null ? null : videoLink.trim();
    }

    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public Boolean getSpecType() {
        return specType;
    }

    public void setSpecType(Boolean specType) {
        this.specType = specType;
    }

    public Boolean getExtensionType() {
        return extensionType;
    }

    public void setExtensionType(Boolean extensionType) {
        this.extensionType = extensionType;
    }

    public String getRefusal() {
        return refusal;
    }

    public void setRefusal(String refusal) {
        this.refusal = refusal == null ? null : refusal.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public String getGiveCouponIds() {
        return giveCouponIds;
    }

    public void setGiveCouponIds(String giveCouponIds) {
        this.giveCouponIds = giveCouponIds == null ? null : giveCouponIds.trim();
    }

    public Boolean getIsGiftBag() {
        return isGiftBag;
    }

    public void setIsGiftBag(Boolean isGiftBag) {
        this.isGiftBag = isGiftBag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCareCount() {
        return careCount;
    }

    public void setCareCount(Integer careCount) {
        this.careCount = careCount;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    public Integer getOldProductId() {
        return oldProductId;
    }

    public void setOldProductId(Integer oldProductId) {
        this.oldProductId = oldProductId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getSliderImage() {
        return sliderImage;
    }

    public void setSliderImage(String sliderImage) {
        this.sliderImage = sliderImage == null ? null : sliderImage.trim();
    }

    public Integer getGuaranteeTemplateId() {
        return guaranteeTemplateId;
    }

    public void setGuaranteeTemplateId(Integer guaranteeTemplateId) {
        this.guaranteeTemplateId = guaranteeTemplateId;
    }

    public Integer getOnceCount() {
        return onceCount;
    }

    public void setOnceCount(Integer onceCount) {
        this.onceCount = onceCount;
    }

    public Integer getIntegralRate() {
        return integralRate;
    }

    public void setIntegralRate(Integer integralRate) {
        this.integralRate = integralRate;
    }

    public Integer getIntegralTotal() {
        return integralTotal;
    }

    public void setIntegralTotal(Integer integralTotal) {
        this.integralTotal = integralTotal;
    }

    public BigDecimal getIntegralPriceTotal() {
        return integralPriceTotal;
    }

    public void setIntegralPriceTotal(BigDecimal integralPriceTotal) {
        this.integralPriceTotal = integralPriceTotal;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    public String getDeliveryWay() {
        return deliveryWay;
    }

    public void setDeliveryWay(String deliveryWay) {
        this.deliveryWay = deliveryWay == null ? null : deliveryWay.trim();
    }

    public Integer getDeliveryFree() {
        return deliveryFree;
    }

    public void setDeliveryFree(Integer deliveryFree) {
        this.deliveryFree = deliveryFree;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }
}