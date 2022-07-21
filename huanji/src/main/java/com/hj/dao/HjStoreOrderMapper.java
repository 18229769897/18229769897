package com.hj.dao;

import com.hj.entity.HjStoreOrder;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface HjStoreOrderMapper {
    @Delete({
        "delete from hj_store_order",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer orderId);

    @Insert({
        "insert into hj_store_order (order_id, main_id, ",
        "group_order_id, order_sn, ",
        "uid, spread_uid, ",
        "top_uid, real_name, ",
        "user_phone, user_address, ",
        "cart_id, total_num, ",
        "total_price, total_postage, ",
        "pay_price, pay_postage, ",
        "is_selfbuy, extension_one, ",
        "extension_two, commission_rate, ",
        "integral, integral_price, ",
        "give_integral, coupon_id, ",
        "coupon_price, platform_coupon_price, ",
        "order_type, type, paid, ",
        "pay_time, pay_type, ",
        "create_time, status, ",
        "delivery_type, is_virtual, ",
        "delivery_name, delivery_id, ",
        "mark, remark, admin_mark, ",
        "verify_code, verify_time, ",
        "verify_service_id, transaction_id, ",
        "activity_type, order_extend, ",
        "mer_id, reconciliation_id, ",
        "cost, is_fa,is_del, is_system_del, ",
        "stage_id, stage_stauts, ",
        "stage_name, block_name)",
        "values (#{orderId,jdbcType=INTEGER}, #{mainId,jdbcType=INTEGER}, ",
        "#{groupOrderId,jdbcType=INTEGER}, #{orderSn,jdbcType=VARCHAR}, ",
        "#{uid,jdbcType=INTEGER}, #{spreadUid,jdbcType=INTEGER}, ",
        "#{topUid,jdbcType=INTEGER}, #{realName,jdbcType=VARCHAR}, ",
        "#{userPhone,jdbcType=VARCHAR}, #{userAddress,jdbcType=VARCHAR}, ",
        "#{cartId,jdbcType=VARCHAR}, #{totalNum,jdbcType=INTEGER}, ",
        "#{totalPrice,jdbcType=DECIMAL}, #{totalPostage,jdbcType=DECIMAL}, ",
        "#{payPrice,jdbcType=DECIMAL}, #{payPostage,jdbcType=DECIMAL}, ",
        "#{isSelfbuy,jdbcType=TINYINT}, #{extensionOne,jdbcType=DECIMAL}, ",
        "#{extensionTwo,jdbcType=DECIMAL}, #{commissionRate,jdbcType=DECIMAL}, ",
        "#{integral,jdbcType=INTEGER}, #{integralPrice,jdbcType=DECIMAL}, ",
        "#{giveIntegral,jdbcType=INTEGER}, #{couponId,jdbcType=VARCHAR}, ",
        "#{couponPrice,jdbcType=DECIMAL}, #{platformCouponPrice,jdbcType=DECIMAL}, ",
        "#{orderType,jdbcType=TINYINT}, #{type,jdbcType=BIT}, #{paid,jdbcType=TINYINT}, ",
        "#{payTime,jdbcType=TIMESTAMP}, #{payType,jdbcType=BIT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{status,jdbcType=BIT}, ",
        "#{deliveryType,jdbcType=VARCHAR}, #{isVirtual,jdbcType=TINYINT}, ",
        "#{deliveryName,jdbcType=VARCHAR}, #{deliveryId,jdbcType=VARCHAR}, ",
        "#{mark,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, #{adminMark,jdbcType=VARCHAR}, ",
        "#{verifyCode,jdbcType=CHAR}, #{verifyTime,jdbcType=TIMESTAMP}, ",
        "#{verifyServiceId,jdbcType=INTEGER}, #{transactionId,jdbcType=VARCHAR}, ",
        "#{activityType,jdbcType=TINYINT}, #{orderExtend,jdbcType=VARCHAR}, ",
        "#{merId,jdbcType=INTEGER}, #{reconciliationId,jdbcType=TINYINT}, ",
        "#{cost,jdbcType=DECIMAL}, #{isDel,jdbcType=TINYINT}, #{isSystemDel,jdbcType=BIT}, ",
        "#{stageId,jdbcType=INTEGER}, #{stageStauts,jdbcType=TINYINT}, ",
        "#{stageName,jdbcType=VARCHAR}, #{blockName,jdbcType=VARCHAR})"
    })
    int insert(HjStoreOrder record);

    @InsertProvider(type=HjStoreOrderSqlProvider.class, method="insertSelective")
    int insertSelective(HjStoreOrder record);

    @Select({
        "select",
        "order_id, main_id, group_order_id, order_sn, uid, spread_uid, top_uid, real_name, ",
        "user_phone, user_address, cart_id, total_num, total_price, total_postage, pay_price, ",
        "pay_postage, is_selfbuy, extension_one, extension_two, commission_rate, integral, ",
        "integral_price, give_integral, coupon_id, coupon_price, platform_coupon_price, ",
        "order_type, type, paid, pay_time, pay_type, create_time, status, delivery_type, ",
        "is_virtual, delivery_name, delivery_id, mark, remark, admin_mark, verify_code, ",
        "verify_time, verify_service_id, transaction_id, activity_type, order_extend, ",
        "mer_id, reconciliation_id, cost, is_fa,is_del, is_system_del, stage_id, stage_stauts, ",
        "stage_name, block_name",
        "from hj_store_order",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="main_id", property="mainId", jdbcType=JdbcType.INTEGER),
        @Result(column="group_order_id", property="groupOrderId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="spread_uid", property="spreadUid", jdbcType=JdbcType.INTEGER),
        @Result(column="top_uid", property="topUid", jdbcType=JdbcType.INTEGER),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="cart_id", property="cartId", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_num", property="totalNum", jdbcType=JdbcType.INTEGER),
        @Result(column="total_price", property="totalPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_postage", property="totalPostage", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_price", property="payPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="pay_postage", property="payPostage", jdbcType=JdbcType.DECIMAL),
        @Result(column="is_selfbuy", property="isSelfbuy", jdbcType=JdbcType.TINYINT),
        @Result(column="extension_one", property="extensionOne", jdbcType=JdbcType.DECIMAL),
        @Result(column="extension_two", property="extensionTwo", jdbcType=JdbcType.DECIMAL),
        @Result(column="commission_rate", property="commissionRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="integral", property="integral", jdbcType=JdbcType.INTEGER),
        @Result(column="integral_price", property="integralPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="give_integral", property="giveIntegral", jdbcType=JdbcType.INTEGER),
        @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.VARCHAR),
        @Result(column="coupon_price", property="couponPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="platform_coupon_price", property="platformCouponPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_type", property="orderType", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.BIT),
        @Result(column="paid", property="paid", jdbcType=JdbcType.TINYINT),
        @Result(column="pay_time", property="payTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.BIT),
        @Result(column="delivery_type", property="deliveryType", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_virtual", property="isVirtual", jdbcType=JdbcType.TINYINT),
        @Result(column="delivery_name", property="deliveryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="delivery_id", property="deliveryId", jdbcType=JdbcType.VARCHAR),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_mark", property="adminMark", jdbcType=JdbcType.VARCHAR),
        @Result(column="verify_code", property="verifyCode", jdbcType=JdbcType.CHAR),
        @Result(column="verify_time", property="verifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="verify_service_id", property="verifyServiceId", jdbcType=JdbcType.INTEGER),
        @Result(column="transaction_id", property="transactionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="activity_type", property="activityType", jdbcType=JdbcType.TINYINT),
        @Result(column="order_extend", property="orderExtend", jdbcType=JdbcType.VARCHAR),
        @Result(column="mer_id", property="merId", jdbcType=JdbcType.INTEGER),
        @Result(column="reconciliation_id", property="reconciliationId", jdbcType=JdbcType.TINYINT),
        @Result(column="cost", property="cost", jdbcType=JdbcType.DECIMAL),
        @Result(column="is_del", property="isDel", jdbcType=JdbcType.TINYINT),
        @Result(column="is_system_del", property="isSystemDel", jdbcType=JdbcType.BIT),
         @Result(column="stage_id", property="stageId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_fa", property="isFa", jdbcType=JdbcType.INTEGER),
        @Result(column="stage_stauts", property="stageStauts", jdbcType=JdbcType.TINYINT),
        @Result(column="stage_name", property="stageName", jdbcType=JdbcType.VARCHAR),
        @Result(column="block_name", property="blockName", jdbcType=JdbcType.VARCHAR)
    })
    HjStoreOrder selectByPrimaryKey(Integer orderId);

    @Select({
            "select",
            "order_id, main_id, group_order_id, order_sn, uid, spread_uid, top_uid, real_name, ",
            "user_phone, user_address, cart_id, total_num, total_price, total_postage, pay_price, ",
            "pay_postage, is_selfbuy, extension_one, extension_two, commission_rate, integral, ",
            "integral_price, give_integral, coupon_id, coupon_price, platform_coupon_price, ",
            "order_type, type, paid, pay_time, pay_type, create_time, status, delivery_type, ",
            "is_virtual, delivery_name, delivery_id, mark, remark, admin_mark, verify_code, ",
            "verify_time, verify_service_id, transaction_id, activity_type, order_extend, ",
            "mer_id, reconciliation_id, cost, is_fa,is_del, is_system_del, stage_id, stage_stauts, ",
            "stage_name, block_name",
            "from hj_store_order",
            "where is_fa = 0 and stage_stauts = 2 and type = 0"
    })
    @Results({
            @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="main_id", property="mainId", jdbcType=JdbcType.INTEGER),
            @Result(column="group_order_id", property="groupOrderId", jdbcType=JdbcType.INTEGER),
            @Result(column="order_sn", property="orderSn", jdbcType=JdbcType.VARCHAR),
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
            @Result(column="spread_uid", property="spreadUid", jdbcType=JdbcType.INTEGER),
            @Result(column="top_uid", property="topUid", jdbcType=JdbcType.INTEGER),
            @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
            @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
            @Result(column="user_address", property="userAddress", jdbcType=JdbcType.VARCHAR),
            @Result(column="cart_id", property="cartId", jdbcType=JdbcType.VARCHAR),
            @Result(column="total_num", property="totalNum", jdbcType=JdbcType.INTEGER),
            @Result(column="total_price", property="totalPrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="total_postage", property="totalPostage", jdbcType=JdbcType.DECIMAL),
            @Result(column="pay_price", property="payPrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="pay_postage", property="payPostage", jdbcType=JdbcType.DECIMAL),
            @Result(column="is_selfbuy", property="isSelfbuy", jdbcType=JdbcType.TINYINT),
            @Result(column="extension_one", property="extensionOne", jdbcType=JdbcType.DECIMAL),
            @Result(column="extension_two", property="extensionTwo", jdbcType=JdbcType.DECIMAL),
            @Result(column="commission_rate", property="commissionRate", jdbcType=JdbcType.DECIMAL),
            @Result(column="integral", property="integral", jdbcType=JdbcType.INTEGER),
            @Result(column="integral_price", property="integralPrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="give_integral", property="giveIntegral", jdbcType=JdbcType.INTEGER),
            @Result(column="coupon_id", property="couponId", jdbcType=JdbcType.VARCHAR),
            @Result(column="coupon_price", property="couponPrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="platform_coupon_price", property="platformCouponPrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="order_type", property="orderType", jdbcType=JdbcType.TINYINT),
            @Result(column="type", property="type", jdbcType=JdbcType.BIT),
            @Result(column="paid", property="paid", jdbcType=JdbcType.TINYINT),
            @Result(column="pay_time", property="payTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="pay_type", property="payType", jdbcType=JdbcType.BIT),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType=JdbcType.BIT),
            @Result(column="delivery_type", property="deliveryType", jdbcType=JdbcType.VARCHAR),
            @Result(column="is_virtual", property="isVirtual", jdbcType=JdbcType.TINYINT),
            @Result(column="delivery_name", property="deliveryName", jdbcType=JdbcType.VARCHAR),
            @Result(column="delivery_id", property="deliveryId", jdbcType=JdbcType.VARCHAR),
            @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
            @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
            @Result(column="admin_mark", property="adminMark", jdbcType=JdbcType.VARCHAR),
            @Result(column="verify_code", property="verifyCode", jdbcType=JdbcType.CHAR),
            @Result(column="verify_time", property="verifyTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="verify_service_id", property="verifyServiceId", jdbcType=JdbcType.INTEGER),
            @Result(column="transaction_id", property="transactionId", jdbcType=JdbcType.VARCHAR),
            @Result(column="activity_type", property="activityType", jdbcType=JdbcType.TINYINT),
            @Result(column="order_extend", property="orderExtend", jdbcType=JdbcType.VARCHAR),
            @Result(column="mer_id", property="merId", jdbcType=JdbcType.INTEGER),
            @Result(column="reconciliation_id", property="reconciliationId", jdbcType=JdbcType.TINYINT),
            @Result(column="cost", property="cost", jdbcType=JdbcType.DECIMAL),
            @Result(column="is_del", property="isDel", jdbcType=JdbcType.TINYINT),
            @Result(column="is_system_del", property="isSystemDel", jdbcType=JdbcType.BIT),
            @Result(column="stage_id", property="stageId", jdbcType=JdbcType.INTEGER),
            @Result(column="is_fa", property="isFa", jdbcType=JdbcType.INTEGER),
            @Result(column="stage_stauts", property="stageStauts", jdbcType=JdbcType.TINYINT),
            @Result(column="stage_name", property="stageName", jdbcType=JdbcType.VARCHAR),
            @Result(column="block_name", property="blockName", jdbcType=JdbcType.VARCHAR),
            @Result(column="uid", property="hjUser", one=@One(select = "com.hj.dao.HjUserMapper.selectByPrimaryKey", fetchType = FetchType.EAGER))
    })
    List<HjStoreOrder> selectByIsFa();


    @Select({
            "select if(isNull(sum(o.pay_price)),0,sum(o.pay_price)) from hj_store_order o join hj_user u on u.uid = o.uid where u.province=#{province} " +
            "and if(#{level}>1,u.city=#{city},1=1) and if(#{level}>2,u.district=#{district},1=1) and if(#{level}>3,u.street=#{street},1=1)" +
            "and o.stage_stauts = 2 and o.type = 0"
    })
    @Results({

    })
    BigDecimal selectByArea(String province, String city, String district, String street, Integer level);

    @Select({
            "select if(isNull(sum(o.pay_price)),0,sum(o.pay_price)) from hj_store_order o join hj_user u on u.uid = o.uid where u.province=#{province} " +
                    "and if(#{level}>1,u.city=#{city},1=1) and if(#{level}>2,u.district=#{district},1=1) and if(#{level}>3,u.street=#{street},1=1)" +
                    "and o.stage_stauts = 2 and o.type = 0 and o.create_time > #{time}"
    })
    @Results({

    })
    BigDecimal selectByAreaByTime(String province,String city,String district,String street,Integer level,String time);

//    @Select({
//            "select if(isNull(sum(o.pay_price)),0,sum(o.pay_price)) from hj_store_order o join hj_user u on u.uid = o.uid where u.province=#{province} " +
//                    "and if(#{level}>1,u.city=#{city},1=1) and if(#{level}>2,u.district=#{district},1=1) and if(#{level}>3,u.street=#{street},1=1)" +
//                    "and o.stage_stauts = 2 and o.type = 0 and o.is_fa = 0 and o.create_time > #{time}"
//    })
//    @Results({
//
//    })
//    BigDecimal selectByIsfa(String province,String city,String district,String street,Integer level,String time);

    @UpdateProvider(type=HjStoreOrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HjStoreOrder record);

    @Update({
        "update hj_store_order",
        "set main_id = #{mainId,jdbcType=INTEGER},",
          "group_order_id = #{groupOrderId,jdbcType=INTEGER},",
          "order_sn = #{orderSn,jdbcType=VARCHAR},",
          "uid = #{uid,jdbcType=INTEGER},",
          "spread_uid = #{spreadUid,jdbcType=INTEGER},",
          "top_uid = #{topUid,jdbcType=INTEGER},",
          "real_name = #{realName,jdbcType=VARCHAR},",
          "user_phone = #{userPhone,jdbcType=VARCHAR},",
          "user_address = #{userAddress,jdbcType=VARCHAR},",
          "cart_id = #{cartId,jdbcType=VARCHAR},",
          "total_num = #{totalNum,jdbcType=INTEGER},",
          "total_price = #{totalPrice,jdbcType=DECIMAL},",
          "total_postage = #{totalPostage,jdbcType=DECIMAL},",
          "pay_price = #{payPrice,jdbcType=DECIMAL},",
          "pay_postage = #{payPostage,jdbcType=DECIMAL},",
          "is_selfbuy = #{isSelfbuy,jdbcType=TINYINT},",
          "extension_one = #{extensionOne,jdbcType=DECIMAL},",
          "extension_two = #{extensionTwo,jdbcType=DECIMAL},",
          "commission_rate = #{commissionRate,jdbcType=DECIMAL},",
          "integral = #{integral,jdbcType=INTEGER},",
          "integral_price = #{integralPrice,jdbcType=DECIMAL},",
          "give_integral = #{giveIntegral,jdbcType=INTEGER},",
          "coupon_id = #{couponId,jdbcType=VARCHAR},",
          "coupon_price = #{couponPrice,jdbcType=DECIMAL},",
          "platform_coupon_price = #{platformCouponPrice,jdbcType=DECIMAL},",
          "order_type = #{orderType,jdbcType=TINYINT},",
          "type = #{type,jdbcType=BIT},",
          "paid = #{paid,jdbcType=TINYINT},",
          "pay_time = #{payTime,jdbcType=TIMESTAMP},",
          "pay_type = #{payType,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=BIT},",
          "delivery_type = #{deliveryType,jdbcType=VARCHAR},",
          "is_virtual = #{isVirtual,jdbcType=TINYINT},",
          "delivery_name = #{deliveryName,jdbcType=VARCHAR},",
          "delivery_id = #{deliveryId,jdbcType=VARCHAR},",
          "mark = #{mark,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "admin_mark = #{adminMark,jdbcType=VARCHAR},",
          "verify_code = #{verifyCode,jdbcType=CHAR},",
          "verify_time = #{verifyTime,jdbcType=TIMESTAMP},",
          "verify_service_id = #{verifyServiceId,jdbcType=INTEGER},",
          "transaction_id = #{transactionId,jdbcType=VARCHAR},",
          "activity_type = #{activityType,jdbcType=TINYINT},",
          "order_extend = #{orderExtend,jdbcType=VARCHAR},",
          "mer_id = #{merId,jdbcType=INTEGER},",
          "reconciliation_id = #{reconciliationId,jdbcType=TINYINT},",
          "cost = #{cost,jdbcType=DECIMAL},",
          "is_del = #{isDel,jdbcType=TINYINT},",
          "is_system_del = #{isSystemDel,jdbcType=BIT},",
          "stage_id = #{stageId,jdbcType=INTEGER},",
          "stage_stauts = #{stageStauts,jdbcType=TINYINT},",
          "stage_name = #{stageName,jdbcType=VARCHAR},",
          "block_name = #{blockName,jdbcType=VARCHAR}",
        "where order_id = #{orderId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HjStoreOrder record);


    @Update({
            "update hj_store_order o join hj_user u on u.uid = o.uid set is_fa = 1 where u.province=#{province} " +
                    "and if(#{level}>1,u.city=#{city},1=1) and if(#{level}>2,u.district=#{district},1=1) and if(#{level}>3,u.street=#{street},1=1)" +
                    "and o.stage_stauts = 2 and o.type = 0 and o.is_fa = 0"
    })
    int updateByArea(String province,String city,String district,String street,Integer level);
}