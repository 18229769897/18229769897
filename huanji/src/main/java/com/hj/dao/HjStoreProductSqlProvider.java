package com.hj.dao;

import com.hj.entity.HjStoreProduct;
import org.apache.ibatis.jdbc.SQL;

public class HjStoreProductSqlProvider {

    public String insertSelective(HjStoreProduct record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hj_store_product");
        
        if (record.getProductId() != null) {
            sql.VALUES("product_id", "#{productId,jdbcType=INTEGER}");
        }
        
        if (record.getMerId() != null) {
            sql.VALUES("mer_id", "#{merId,jdbcType=INTEGER}");
        }
        
        if (record.getStoreName() != null) {
            sql.VALUES("store_name", "#{storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreInfo() != null) {
            sql.VALUES("store_info", "#{storeInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getKeyword() != null) {
            sql.VALUES("keyword", "#{keyword,jdbcType=VARCHAR}");
        }
        
        if (record.getBarCode() != null) {
            sql.VALUES("bar_code", "#{barCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandId() != null) {
            sql.VALUES("brand_id", "#{brandId,jdbcType=INTEGER}");
        }
        
        if (record.getIsShow() != null) {
            sql.VALUES("is_show", "#{isShow,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=BIT}");
        }
        
        if (record.getIsDel() != null) {
            sql.VALUES("is_del", "#{isDel,jdbcType=TINYINT}");
        }
        
        if (record.getMerStatus() != null) {
            sql.VALUES("mer_status", "#{merStatus,jdbcType=BIT}");
        }
        
        if (record.getCateId() != null) {
            sql.VALUES("cate_id", "#{cateId,jdbcType=INTEGER}");
        }
        
        if (record.getUnitName() != null) {
            sql.VALUES("unit_name", "#{unitName,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            sql.VALUES("sort", "#{sort,jdbcType=SMALLINT}");
        }
        
        if (record.getRank() != null) {
            sql.VALUES("rank", "#{rank,jdbcType=SMALLINT}");
        }
        
        if (record.getSales() != null) {
            sql.VALUES("sales", "#{sales,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=DECIMAL}");
        }
        
        if (record.getCost() != null) {
            sql.VALUES("cost", "#{cost,jdbcType=DECIMAL}");
        }
        
        if (record.getOtPrice() != null) {
            sql.VALUES("ot_price", "#{otPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getStock() != null) {
            sql.VALUES("stock", "#{stock,jdbcType=INTEGER}");
        }
        
        if (record.getIsHot() != null) {
            sql.VALUES("is_hot", "#{isHot,jdbcType=TINYINT}");
        }
        
        if (record.getIsBenefit() != null) {
            sql.VALUES("is_benefit", "#{isBenefit,jdbcType=TINYINT}");
        }
        
        if (record.getIsBest() != null) {
            sql.VALUES("is_best", "#{isBest,jdbcType=TINYINT}");
        }
        
        if (record.getIsNew() != null) {
            sql.VALUES("is_new", "#{isNew,jdbcType=TINYINT}");
        }
        
        if (record.getIsGood() != null) {
            sql.VALUES("is_good", "#{isGood,jdbcType=BIT}");
        }
        
        if (record.getProductType() != null) {
            sql.VALUES("product_type", "#{productType,jdbcType=TINYINT}");
        }
        
        if (record.getFicti() != null) {
            sql.VALUES("ficti", "#{ficti,jdbcType=INTEGER}");
        }
        
        if (record.getBrowse() != null) {
            sql.VALUES("browse", "#{browse,jdbcType=INTEGER}");
        }
        
        if (record.getCodePath() != null) {
            sql.VALUES("code_path", "#{codePath,jdbcType=VARCHAR}");
        }
        
        if (record.getVideoLink() != null) {
            sql.VALUES("video_link", "#{videoLink,jdbcType=VARCHAR}");
        }
        
        if (record.getTempId() != null) {
            sql.VALUES("temp_id", "#{tempId,jdbcType=INTEGER}");
        }
        
        if (record.getSpecType() != null) {
            sql.VALUES("spec_type", "#{specType,jdbcType=BIT}");
        }
        
        if (record.getExtensionType() != null) {
            sql.VALUES("extension_type", "#{extensionType,jdbcType=BIT}");
        }
        
        if (record.getRefusal() != null) {
            sql.VALUES("refusal", "#{refusal,jdbcType=VARCHAR}");
        }
        
        if (record.getRate() != null) {
            sql.VALUES("rate", "#{rate,jdbcType=DECIMAL}");
        }
        
        if (record.getReplyCount() != null) {
            sql.VALUES("reply_count", "#{replyCount,jdbcType=INTEGER}");
        }
        
        if (record.getGiveCouponIds() != null) {
            sql.VALUES("give_coupon_ids", "#{giveCouponIds,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGiftBag() != null) {
            sql.VALUES("is_gift_bag", "#{isGiftBag,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCareCount() != null) {
            sql.VALUES("care_count", "#{careCount,jdbcType=INTEGER}");
        }
        
        if (record.getIsUsed() != null) {
            sql.VALUES("is_used", "#{isUsed,jdbcType=INTEGER}");
        }
        
        if (record.getOldProductId() != null) {
            sql.VALUES("old_product_id", "#{oldProductId,jdbcType=INTEGER}");
        }
        
        if (record.getImage() != null) {
            sql.VALUES("image", "#{image,jdbcType=VARCHAR}");
        }
        
        if (record.getSliderImage() != null) {
            sql.VALUES("slider_image", "#{sliderImage,jdbcType=VARCHAR}");
        }
        
        if (record.getGuaranteeTemplateId() != null) {
            sql.VALUES("guarantee_template_id", "#{guaranteeTemplateId,jdbcType=INTEGER}");
        }
        
        if (record.getOnceCount() != null) {
            sql.VALUES("once_count", "#{onceCount,jdbcType=INTEGER}");
        }
        
        if (record.getIntegralRate() != null) {
            sql.VALUES("integral_rate", "#{integralRate,jdbcType=INTEGER}");
        }
        
        if (record.getIntegralTotal() != null) {
            sql.VALUES("integral_total", "#{integralTotal,jdbcType=INTEGER}");
        }
        
        if (record.getIntegralPriceTotal() != null) {
            sql.VALUES("integral_price_total", "#{integralPriceTotal,jdbcType=DECIMAL}");
        }
        
        if (record.getLabels() != null) {
            sql.VALUES("labels", "#{labels,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryWay() != null) {
            sql.VALUES("delivery_way", "#{deliveryWay,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryFree() != null) {
            sql.VALUES("delivery_free", "#{deliveryFree,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=TINYINT}");
        }
        
        if (record.getExtend() != null) {
            sql.VALUES("extend", "#{extend,jdbcType=VARCHAR}");
        }
        
        if (record.getBlockId() != null) {
            sql.VALUES("block_id", "#{blockId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HjStoreProduct record) {
        SQL sql = new SQL();
        sql.UPDATE("hj_store_product");
        
        if (record.getMerId() != null) {
            sql.SET("mer_id = #{merId,jdbcType=INTEGER}");
        }
        
        if (record.getStoreName() != null) {
            sql.SET("store_name = #{storeName,jdbcType=VARCHAR}");
        }
        
        if (record.getStoreInfo() != null) {
            sql.SET("store_info = #{storeInfo,jdbcType=VARCHAR}");
        }
        
        if (record.getKeyword() != null) {
            sql.SET("keyword = #{keyword,jdbcType=VARCHAR}");
        }
        
        if (record.getBarCode() != null) {
            sql.SET("bar_code = #{barCode,jdbcType=VARCHAR}");
        }
        
        if (record.getBrandId() != null) {
            sql.SET("brand_id = #{brandId,jdbcType=INTEGER}");
        }
        
        if (record.getIsShow() != null) {
            sql.SET("is_show = #{isShow,jdbcType=TINYINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=BIT}");
        }
        
        if (record.getIsDel() != null) {
            sql.SET("is_del = #{isDel,jdbcType=TINYINT}");
        }
        
        if (record.getMerStatus() != null) {
            sql.SET("mer_status = #{merStatus,jdbcType=BIT}");
        }
        
        if (record.getCateId() != null) {
            sql.SET("cate_id = #{cateId,jdbcType=INTEGER}");
        }
        
        if (record.getUnitName() != null) {
            sql.SET("unit_name = #{unitName,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            sql.SET("sort = #{sort,jdbcType=SMALLINT}");
        }
        
        if (record.getRank() != null) {
            sql.SET("rank = #{rank,jdbcType=SMALLINT}");
        }
        
        if (record.getSales() != null) {
            sql.SET("sales = #{sales,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=DECIMAL}");
        }
        
        if (record.getCost() != null) {
            sql.SET("cost = #{cost,jdbcType=DECIMAL}");
        }
        
        if (record.getOtPrice() != null) {
            sql.SET("ot_price = #{otPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getStock() != null) {
            sql.SET("stock = #{stock,jdbcType=INTEGER}");
        }
        
        if (record.getIsHot() != null) {
            sql.SET("is_hot = #{isHot,jdbcType=TINYINT}");
        }
        
        if (record.getIsBenefit() != null) {
            sql.SET("is_benefit = #{isBenefit,jdbcType=TINYINT}");
        }
        
        if (record.getIsBest() != null) {
            sql.SET("is_best = #{isBest,jdbcType=TINYINT}");
        }
        
        if (record.getIsNew() != null) {
            sql.SET("is_new = #{isNew,jdbcType=TINYINT}");
        }
        
        if (record.getIsGood() != null) {
            sql.SET("is_good = #{isGood,jdbcType=BIT}");
        }
        
        if (record.getProductType() != null) {
            sql.SET("product_type = #{productType,jdbcType=TINYINT}");
        }
        
        if (record.getFicti() != null) {
            sql.SET("ficti = #{ficti,jdbcType=INTEGER}");
        }
        
        if (record.getBrowse() != null) {
            sql.SET("browse = #{browse,jdbcType=INTEGER}");
        }
        
        if (record.getCodePath() != null) {
            sql.SET("code_path = #{codePath,jdbcType=VARCHAR}");
        }
        
        if (record.getVideoLink() != null) {
            sql.SET("video_link = #{videoLink,jdbcType=VARCHAR}");
        }
        
        if (record.getTempId() != null) {
            sql.SET("temp_id = #{tempId,jdbcType=INTEGER}");
        }
        
        if (record.getSpecType() != null) {
            sql.SET("spec_type = #{specType,jdbcType=BIT}");
        }
        
        if (record.getExtensionType() != null) {
            sql.SET("extension_type = #{extensionType,jdbcType=BIT}");
        }
        
        if (record.getRefusal() != null) {
            sql.SET("refusal = #{refusal,jdbcType=VARCHAR}");
        }
        
        if (record.getRate() != null) {
            sql.SET("rate = #{rate,jdbcType=DECIMAL}");
        }
        
        if (record.getReplyCount() != null) {
            sql.SET("reply_count = #{replyCount,jdbcType=INTEGER}");
        }
        
        if (record.getGiveCouponIds() != null) {
            sql.SET("give_coupon_ids = #{giveCouponIds,jdbcType=VARCHAR}");
        }
        
        if (record.getIsGiftBag() != null) {
            sql.SET("is_gift_bag = #{isGiftBag,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCareCount() != null) {
            sql.SET("care_count = #{careCount,jdbcType=INTEGER}");
        }
        
        if (record.getIsUsed() != null) {
            sql.SET("is_used = #{isUsed,jdbcType=INTEGER}");
        }
        
        if (record.getOldProductId() != null) {
            sql.SET("old_product_id = #{oldProductId,jdbcType=INTEGER}");
        }
        
        if (record.getImage() != null) {
            sql.SET("image = #{image,jdbcType=VARCHAR}");
        }
        
        if (record.getSliderImage() != null) {
            sql.SET("slider_image = #{sliderImage,jdbcType=VARCHAR}");
        }
        
        if (record.getGuaranteeTemplateId() != null) {
            sql.SET("guarantee_template_id = #{guaranteeTemplateId,jdbcType=INTEGER}");
        }
        
        if (record.getOnceCount() != null) {
            sql.SET("once_count = #{onceCount,jdbcType=INTEGER}");
        }
        
        if (record.getIntegralRate() != null) {
            sql.SET("integral_rate = #{integralRate,jdbcType=INTEGER}");
        }
        
        if (record.getIntegralTotal() != null) {
            sql.SET("integral_total = #{integralTotal,jdbcType=INTEGER}");
        }
        
        if (record.getIntegralPriceTotal() != null) {
            sql.SET("integral_price_total = #{integralPriceTotal,jdbcType=DECIMAL}");
        }
        
        if (record.getLabels() != null) {
            sql.SET("labels = #{labels,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryWay() != null) {
            sql.SET("delivery_way = #{deliveryWay,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryFree() != null) {
            sql.SET("delivery_free = #{deliveryFree,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=TINYINT}");
        }
        
        if (record.getExtend() != null) {
            sql.SET("extend = #{extend,jdbcType=VARCHAR}");
        }
        
        if (record.getBlockId() != null) {
            sql.SET("block_id = #{blockId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("product_id = #{productId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}