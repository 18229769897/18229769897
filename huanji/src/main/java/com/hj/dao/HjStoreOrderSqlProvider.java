package com.hj.dao;

import com.hj.entity.HjStoreOrder;
import org.apache.ibatis.jdbc.SQL;

public class HjStoreOrderSqlProvider {

    public String insertSelective(HjStoreOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hj_store_order");
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=INTEGER}");
        }
        
        if (record.getMainId() != null) {
            sql.VALUES("main_id", "#{mainId,jdbcType=INTEGER}");
        }
        
        if (record.getGroupOrderId() != null) {
            sql.VALUES("group_order_id", "#{groupOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderSn() != null) {
            sql.VALUES("order_sn", "#{orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadUid() != null) {
            sql.VALUES("spread_uid", "#{spreadUid,jdbcType=INTEGER}");
        }
        
        if (record.getTopUid() != null) {
            sql.VALUES("top_uid", "#{topUid,jdbcType=INTEGER}");
        }
        
        if (record.getRealName() != null) {
            sql.VALUES("real_name", "#{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            sql.VALUES("user_phone", "#{userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.VALUES("user_address", "#{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getCartId() != null) {
            sql.VALUES("cart_id", "#{cartId,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalNum() != null) {
            sql.VALUES("total_num", "#{totalNum,jdbcType=INTEGER}");
        }
        
        if (record.getTotalPrice() != null) {
            sql.VALUES("total_price", "#{totalPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalPostage() != null) {
            sql.VALUES("total_postage", "#{totalPostage,jdbcType=DECIMAL}");
        }
        
        if (record.getPayPrice() != null) {
            sql.VALUES("pay_price", "#{payPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getPayPostage() != null) {
            sql.VALUES("pay_postage", "#{payPostage,jdbcType=DECIMAL}");
        }
        
        if (record.getIsSelfbuy() != null) {
            sql.VALUES("is_selfbuy", "#{isSelfbuy,jdbcType=TINYINT}");
        }
        
        if (record.getExtensionOne() != null) {
            sql.VALUES("extension_one", "#{extensionOne,jdbcType=DECIMAL}");
        }
        
        if (record.getExtensionTwo() != null) {
            sql.VALUES("extension_two", "#{extensionTwo,jdbcType=DECIMAL}");
        }
        
        if (record.getCommissionRate() != null) {
            sql.VALUES("commission_rate", "#{commissionRate,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegral() != null) {
            sql.VALUES("integral", "#{integral,jdbcType=INTEGER}");
        }
        
        if (record.getIntegralPrice() != null) {
            sql.VALUES("integral_price", "#{integralPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGiveIntegral() != null) {
            sql.VALUES("give_integral", "#{giveIntegral,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.VALUES("coupon_id", "#{couponId,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponPrice() != null) {
            sql.VALUES("coupon_price", "#{couponPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getPlatformCouponPrice() != null) {
            sql.VALUES("platform_coupon_price", "#{platformCouponPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderType() != null) {
            sql.VALUES("order_type", "#{orderType,jdbcType=TINYINT}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=BIT}");
        }
        
        if (record.getPaid() != null) {
            sql.VALUES("paid", "#{paid,jdbcType=TINYINT}");
        }
        
        if (record.getPayTime() != null) {
            sql.VALUES("pay_time", "#{payTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayType() != null) {
            sql.VALUES("pay_type", "#{payType,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=BIT}");
        }
        
        if (record.getDeliveryType() != null) {
            sql.VALUES("delivery_type", "#{deliveryType,jdbcType=VARCHAR}");
        }
        
        if (record.getIsVirtual() != null) {
            sql.VALUES("is_virtual", "#{isVirtual,jdbcType=TINYINT}");
        }
        
        if (record.getDeliveryName() != null) {
            sql.VALUES("delivery_name", "#{deliveryName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryId() != null) {
            sql.VALUES("delivery_id", "#{deliveryId,jdbcType=VARCHAR}");
        }
        
        if (record.getMark() != null) {
            sql.VALUES("mark", "#{mark,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminMark() != null) {
            sql.VALUES("admin_mark", "#{adminMark,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyCode() != null) {
            sql.VALUES("verify_code", "#{verifyCode,jdbcType=CHAR}");
        }
        
        if (record.getVerifyTime() != null) {
            sql.VALUES("verify_time", "#{verifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVerifyServiceId() != null) {
            sql.VALUES("verify_service_id", "#{verifyServiceId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionId() != null) {
            sql.VALUES("transaction_id", "#{transactionId,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityType() != null) {
            sql.VALUES("activity_type", "#{activityType,jdbcType=TINYINT}");
        }
        
        if (record.getOrderExtend() != null) {
            sql.VALUES("order_extend", "#{orderExtend,jdbcType=VARCHAR}");
        }
        
        if (record.getMerId() != null) {
            sql.VALUES("mer_id", "#{merId,jdbcType=INTEGER}");
        }
        
        if (record.getReconciliationId() != null) {
            sql.VALUES("reconciliation_id", "#{reconciliationId,jdbcType=TINYINT}");
        }
        
        if (record.getCost() != null) {
            sql.VALUES("cost", "#{cost,jdbcType=DECIMAL}");
        }
        
        if (record.getIsDel() != null) {
            sql.VALUES("is_del", "#{isDel,jdbcType=TINYINT}");
        }
        
        if (record.getIsSystemDel() != null) {
            sql.VALUES("is_system_del", "#{isSystemDel,jdbcType=BIT}");
        }
        
        if (record.getStageId() != null) {
            sql.VALUES("stage_id", "#{stageId,jdbcType=INTEGER}");
        }
        
        if (record.getStageStauts() != null) {
            sql.VALUES("stage_stauts", "#{stageStauts,jdbcType=TINYINT}");
        }
        
        if (record.getStageName() != null) {
            sql.VALUES("stage_name", "#{stageName,jdbcType=VARCHAR}");
        }
        
        if (record.getBlockName() != null) {
            sql.VALUES("block_name", "#{blockName,jdbcType=VARCHAR}");
        }

        if (record.getIsFa() != null) {
            sql.VALUES("is_fa", "#{isFa,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HjStoreOrder record) {
        SQL sql = new SQL();
        sql.UPDATE("hj_store_order");
        
        if (record.getMainId() != null) {
            sql.SET("main_id = #{mainId,jdbcType=INTEGER}");
        }
        
        if (record.getGroupOrderId() != null) {
            sql.SET("group_order_id = #{groupOrderId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderSn() != null) {
            sql.SET("order_sn = #{orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadUid() != null) {
            sql.SET("spread_uid = #{spreadUid,jdbcType=INTEGER}");
        }
        
        if (record.getTopUid() != null) {
            sql.SET("top_uid = #{topUid,jdbcType=INTEGER}");
        }
        
        if (record.getRealName() != null) {
            sql.SET("real_name = #{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            sql.SET("user_phone = #{userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserAddress() != null) {
            sql.SET("user_address = #{userAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getCartId() != null) {
            sql.SET("cart_id = #{cartId,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalNum() != null) {
            sql.SET("total_num = #{totalNum,jdbcType=INTEGER}");
        }
        
        if (record.getTotalPrice() != null) {
            sql.SET("total_price = #{totalPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getTotalPostage() != null) {
            sql.SET("total_postage = #{totalPostage,jdbcType=DECIMAL}");
        }
        
        if (record.getPayPrice() != null) {
            sql.SET("pay_price = #{payPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getPayPostage() != null) {
            sql.SET("pay_postage = #{payPostage,jdbcType=DECIMAL}");
        }
        
        if (record.getIsSelfbuy() != null) {
            sql.SET("is_selfbuy = #{isSelfbuy,jdbcType=TINYINT}");
        }
        
        if (record.getExtensionOne() != null) {
            sql.SET("extension_one = #{extensionOne,jdbcType=DECIMAL}");
        }
        
        if (record.getExtensionTwo() != null) {
            sql.SET("extension_two = #{extensionTwo,jdbcType=DECIMAL}");
        }
        
        if (record.getCommissionRate() != null) {
            sql.SET("commission_rate = #{commissionRate,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegral() != null) {
            sql.SET("integral = #{integral,jdbcType=INTEGER}");
        }
        
        if (record.getIntegralPrice() != null) {
            sql.SET("integral_price = #{integralPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getGiveIntegral() != null) {
            sql.SET("give_integral = #{giveIntegral,jdbcType=INTEGER}");
        }
        
        if (record.getCouponId() != null) {
            sql.SET("coupon_id = #{couponId,jdbcType=VARCHAR}");
        }
        
        if (record.getCouponPrice() != null) {
            sql.SET("coupon_price = #{couponPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getPlatformCouponPrice() != null) {
            sql.SET("platform_coupon_price = #{platformCouponPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getOrderType() != null) {
            sql.SET("order_type = #{orderType,jdbcType=TINYINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=BIT}");
        }
        
        if (record.getPaid() != null) {
            sql.SET("paid = #{paid,jdbcType=TINYINT}");
        }
        
        if (record.getPayTime() != null) {
            sql.SET("pay_time = #{payTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayType() != null) {
            sql.SET("pay_type = #{payType,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=BIT}");
        }
        
        if (record.getDeliveryType() != null) {
            sql.SET("delivery_type = #{deliveryType,jdbcType=VARCHAR}");
        }
        
        if (record.getIsVirtual() != null) {
            sql.SET("is_virtual = #{isVirtual,jdbcType=TINYINT}");
        }
        
        if (record.getDeliveryName() != null) {
            sql.SET("delivery_name = #{deliveryName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeliveryId() != null) {
            sql.SET("delivery_id = #{deliveryId,jdbcType=VARCHAR}");
        }
        
        if (record.getMark() != null) {
            sql.SET("mark = #{mark,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminMark() != null) {
            sql.SET("admin_mark = #{adminMark,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifyCode() != null) {
            sql.SET("verify_code = #{verifyCode,jdbcType=CHAR}");
        }
        
        if (record.getVerifyTime() != null) {
            sql.SET("verify_time = #{verifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVerifyServiceId() != null) {
            sql.SET("verify_service_id = #{verifyServiceId,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionId() != null) {
            sql.SET("transaction_id = #{transactionId,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityType() != null) {
            sql.SET("activity_type = #{activityType,jdbcType=TINYINT}");
        }
        
        if (record.getOrderExtend() != null) {
            sql.SET("order_extend = #{orderExtend,jdbcType=VARCHAR}");
        }
        
        if (record.getMerId() != null) {
            sql.SET("mer_id = #{merId,jdbcType=INTEGER}");
        }
        
        if (record.getReconciliationId() != null) {
            sql.SET("reconciliation_id = #{reconciliationId,jdbcType=TINYINT}");
        }
        
        if (record.getCost() != null) {
            sql.SET("cost = #{cost,jdbcType=DECIMAL}");
        }
        
        if (record.getIsDel() != null) {
            sql.SET("is_del = #{isDel,jdbcType=TINYINT}");
        }
        
        if (record.getIsSystemDel() != null) {
            sql.SET("is_system_del = #{isSystemDel,jdbcType=BIT}");
        }
        
        if (record.getStageId() != null) {
            sql.SET("stage_id = #{stageId,jdbcType=INTEGER}");
        }

        if (record.getIsFa() != null) {
            sql.SET("is_fa = #{isFa,jdbcType=INTEGER}");
        }
        
        if (record.getStageStauts() != null) {
            sql.SET("stage_stauts = #{stageStauts,jdbcType=TINYINT}");
        }
        
        if (record.getStageName() != null) {
            sql.SET("stage_name = #{stageName,jdbcType=VARCHAR}");
        }
        
        if (record.getBlockName() != null) {
            sql.SET("block_name = #{blockName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("order_id = #{orderId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}