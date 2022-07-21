package com.hj.dao;

import com.hj.entity.HjUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HjUserMapper {
    @Delete({
        "delete from hj_user",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer uid);

    @Insert({
        "insert into hj_user (uid, wechat_user_id, ",
        "account, pwd, pay_pwd, ",
        "real_name, card_id, ",
        "is_reals, level, ",
        "sex, birthday, mark, ",
        "label_id, group_id, ",
        "nickname, avatar, ",
        "phone, addres, cancel_time, ",
        "create_time, last_time, ",
        "last_ip, now_money, ",
        "brokerage_price, wait_released, ",
        "coupons, love_points, ",
        "integral, money_dl, ",
        "status, spread_uid, ",
        "spread_time, spread_limit, ",
        "brokerage_level, user_type, ",
        "promoter_time, is_promoter, ",
        "main_uid, pay_count, ",
        "pay_price, spread_count, ",
        "spread_pay_count, spread_pay_price, ",
        "count_fans, member_value, ",
        "count_start, lock_brokerage_amount, ",
        "province, city, ",
        "district, street, ",
        "dl_level, spread_path)",
        "values (#{uid,jdbcType=INTEGER}, #{wechatUserId,jdbcType=INTEGER}, ",
        "#{account,jdbcType=VARCHAR}, #{pwd,jdbcType=VARCHAR}, #{payPwd,jdbcType=VARCHAR}, ",
        "#{realName,jdbcType=VARCHAR}, #{cardId,jdbcType=VARCHAR}, ",
        "#{isReals,jdbcType=TINYINT}, #{level,jdbcType=TINYINT}, ",
        "#{sex,jdbcType=TINYINT}, #{birthday,jdbcType=DATE}, #{mark,jdbcType=VARCHAR}, ",
        "#{labelId,jdbcType=VARCHAR}, #{groupId,jdbcType=INTEGER}, ",
        "#{nickname,jdbcType=VARCHAR}, #{avatar,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=CHAR}, #{addres,jdbcType=VARCHAR}, #{cancelTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{lastTime,jdbcType=TIMESTAMP}, ",
        "#{lastIp,jdbcType=VARCHAR}, #{nowMoney,jdbcType=DECIMAL}, ",
        "#{brokeragePrice,jdbcType=DECIMAL}, #{waitReleased,jdbcType=DECIMAL}, ",
        "#{coupons,jdbcType=INTEGER}, #{lovePoints,jdbcType=DECIMAL}, ",
        "#{integral,jdbcType=INTEGER}, #{moneyDl,jdbcType=DECIMAL}, ",
        "#{status,jdbcType=TINYINT}, #{spreadUid,jdbcType=INTEGER}, ",
        "#{spreadTime,jdbcType=TIMESTAMP}, #{spreadLimit,jdbcType=TIMESTAMP}, ",
        "#{brokerageLevel,jdbcType=INTEGER}, #{userType,jdbcType=VARCHAR}, ",
        "#{promoterTime,jdbcType=TIMESTAMP}, #{isPromoter,jdbcType=TINYINT}, ",
        "#{mainUid,jdbcType=INTEGER}, #{payCount,jdbcType=INTEGER}, ",
        "#{payPrice,jdbcType=DECIMAL}, #{spreadCount,jdbcType=INTEGER}, ",
        "#{spreadPayCount,jdbcType=INTEGER}, #{spreadPayPrice,jdbcType=DECIMAL}, ",
        "#{countFans,jdbcType=INTEGER}, #{memberValue,jdbcType=INTEGER}, ",
        "#{countStart,jdbcType=INTEGER}, #{lockBrokerageAmount,jdbcType=INTEGER}, ",
        "#{province,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{district,jdbcType=VARCHAR}, #{street,jdbcType=VARCHAR}, ",
        "#{dlLevel,jdbcType=INTEGER}, #{spreadPath,jdbcType=LONGVARCHAR})"
    })
    int insert(HjUser record);

    @InsertProvider(type=HjUserSqlProvider.class, method="insertSelective")
    int insertSelective(HjUser record);

    @Select({
        "select",
        "uid, wechat_user_id, account, pwd, pay_pwd, real_name, card_id, is_reals, level, ",
        "sex, birthday, mark, label_id, group_id, nickname, avatar, phone, addres, cancel_time, ",
        "create_time, last_time, last_ip, now_money, brokerage_price, wait_released, ",
        "coupons, love_points, integral, money_dl, status, spread_uid, spread_time, spread_limit, ",
        "brokerage_level, user_type, promoter_time, is_promoter, main_uid, pay_count, ",
        "pay_price, spread_count, spread_pay_count, spread_pay_price, count_fans, member_value, ",
        "count_start, lock_brokerage_amount, province, city, district, street, dl_level, ",
        "spread_path",
        "from hj_user",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wechat_user_id", property="wechatUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_pwd", property="payPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="real_name", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="card_id", property="cardId", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_reals", property="isReals", jdbcType=JdbcType.TINYINT),
        @Result(column="level", property="level", jdbcType=JdbcType.TINYINT),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="label_id", property="labelId", jdbcType=JdbcType.VARCHAR),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.INTEGER),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.CHAR),
        @Result(column="addres", property="addres", jdbcType=JdbcType.VARCHAR),
        @Result(column="cancel_time", property="cancelTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_time", property="lastTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_ip", property="lastIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="now_money", property="nowMoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="brokerage_price", property="brokeragePrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="wait_released", property="waitReleased", jdbcType=JdbcType.DECIMAL),
        @Result(column="coupons", property="coupons", jdbcType=JdbcType.INTEGER),
        @Result(column="love_points", property="lovePoints", jdbcType=JdbcType.DECIMAL),
        @Result(column="integral", property="integral", jdbcType=JdbcType.INTEGER),
        @Result(column="money_dl", property="moneyDl", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="spread_uid", property="spreadUid", jdbcType=JdbcType.INTEGER),
        @Result(column="spread_time", property="spreadTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="spread_limit", property="spreadLimit", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="brokerage_level", property="brokerageLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.VARCHAR),
        @Result(column="promoter_time", property="promoterTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_promoter", property="isPromoter", jdbcType=JdbcType.TINYINT),
        @Result(column="main_uid", property="mainUid", jdbcType=JdbcType.INTEGER),
        @Result(column="pay_count", property="payCount", jdbcType=JdbcType.INTEGER),
        @Result(column="pay_price", property="payPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="spread_count", property="spreadCount", jdbcType=JdbcType.INTEGER),
        @Result(column="spread_pay_count", property="spreadPayCount", jdbcType=JdbcType.INTEGER),
        @Result(column="spread_pay_price", property="spreadPayPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="count_fans", property="countFans", jdbcType=JdbcType.INTEGER),
        @Result(column="member_value", property="memberValue", jdbcType=JdbcType.INTEGER),
        @Result(column="count_start", property="countStart", jdbcType=JdbcType.INTEGER),
        @Result(column="lock_brokerage_amount", property="lockBrokerageAmount", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="dl_level", property="dlLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="spread_path", property="spreadPath", jdbcType=JdbcType.LONGVARCHAR)
    })
    HjUser selectByPrimaryKey(Integer uid);


    @Select({
            "select count(*) from hj_user  where province=#{province} " +
                    "and if(#{level}>1,city=#{city},1=1) and if(#{level}>2,district=#{district},1=1) and if(#{level}>3,street=#{street},1=1)"
    })
    @Results({

    })
    Integer selectNumberByArea(String province, String city, String district, String street,Integer level);

    @UpdateProvider(type=HjUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HjUser record);

    @Update({
        "update hj_user",
        "set wechat_user_id = #{wechatUserId,jdbcType=INTEGER},",
          "account = #{account,jdbcType=VARCHAR},",
          "pwd = #{pwd,jdbcType=VARCHAR},",
          "pay_pwd = #{payPwd,jdbcType=VARCHAR},",
          "real_name = #{realName,jdbcType=VARCHAR},",
          "card_id = #{cardId,jdbcType=VARCHAR},",
          "is_reals = #{isReals,jdbcType=TINYINT},",
          "level = #{level,jdbcType=TINYINT},",
          "sex = #{sex,jdbcType=TINYINT},",
          "birthday = #{birthday,jdbcType=DATE},",
          "mark = #{mark,jdbcType=VARCHAR},",
          "label_id = #{labelId,jdbcType=VARCHAR},",
          "group_id = #{groupId,jdbcType=INTEGER},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=CHAR},",
          "addres = #{addres,jdbcType=VARCHAR},",
          "cancel_time = #{cancelTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_time = #{lastTime,jdbcType=TIMESTAMP},",
          "last_ip = #{lastIp,jdbcType=VARCHAR},",
          "now_money = #{nowMoney,jdbcType=DECIMAL},",
          "brokerage_price = #{brokeragePrice,jdbcType=DECIMAL},",
          "wait_released = #{waitReleased,jdbcType=DECIMAL},",
          "coupons = #{coupons,jdbcType=INTEGER},",
          "love_points = #{lovePoints,jdbcType=DECIMAL},",
          "integral = #{integral,jdbcType=INTEGER},",
          "money_dl = #{moneyDl,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=TINYINT},",
          "spread_uid = #{spreadUid,jdbcType=INTEGER},",
          "spread_time = #{spreadTime,jdbcType=TIMESTAMP},",
          "spread_limit = #{spreadLimit,jdbcType=TIMESTAMP},",
          "brokerage_level = #{brokerageLevel,jdbcType=INTEGER},",
          "user_type = #{userType,jdbcType=VARCHAR},",
          "promoter_time = #{promoterTime,jdbcType=TIMESTAMP},",
          "is_promoter = #{isPromoter,jdbcType=TINYINT},",
          "main_uid = #{mainUid,jdbcType=INTEGER},",
          "pay_count = #{payCount,jdbcType=INTEGER},",
          "pay_price = #{payPrice,jdbcType=DECIMAL},",
          "spread_count = #{spreadCount,jdbcType=INTEGER},",
          "spread_pay_count = #{spreadPayCount,jdbcType=INTEGER},",
          "spread_pay_price = #{spreadPayPrice,jdbcType=DECIMAL},",
          "count_fans = #{countFans,jdbcType=INTEGER},",
          "member_value = #{memberValue,jdbcType=INTEGER},",
          "count_start = #{countStart,jdbcType=INTEGER},",
          "lock_brokerage_amount = #{lockBrokerageAmount,jdbcType=INTEGER},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "district = #{district,jdbcType=VARCHAR},",
          "street = #{street,jdbcType=VARCHAR},",
          "dl_level = #{dlLevel,jdbcType=INTEGER},",
          "spread_path = #{spreadPath,jdbcType=LONGVARCHAR}",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(HjUser record);

    @Update({
        "update hj_user",
        "set wechat_user_id = #{wechatUserId,jdbcType=INTEGER},",
          "account = #{account,jdbcType=VARCHAR},",
          "pwd = #{pwd,jdbcType=VARCHAR},",
          "pay_pwd = #{payPwd,jdbcType=VARCHAR},",
          "real_name = #{realName,jdbcType=VARCHAR},",
          "card_id = #{cardId,jdbcType=VARCHAR},",
          "is_reals = #{isReals,jdbcType=TINYINT},",
          "level = #{level,jdbcType=TINYINT},",
          "sex = #{sex,jdbcType=TINYINT},",
          "birthday = #{birthday,jdbcType=DATE},",
          "mark = #{mark,jdbcType=VARCHAR},",
          "label_id = #{labelId,jdbcType=VARCHAR},",
          "group_id = #{groupId,jdbcType=INTEGER},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=CHAR},",
          "addres = #{addres,jdbcType=VARCHAR},",
          "cancel_time = #{cancelTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "last_time = #{lastTime,jdbcType=TIMESTAMP},",
          "last_ip = #{lastIp,jdbcType=VARCHAR},",
          "now_money = #{nowMoney,jdbcType=DECIMAL},",
          "brokerage_price = #{brokeragePrice,jdbcType=DECIMAL},",
          "wait_released = #{waitReleased,jdbcType=DECIMAL},",
          "coupons = #{coupons,jdbcType=INTEGER},",
          "love_points = #{lovePoints,jdbcType=DECIMAL},",
          "integral = #{integral,jdbcType=INTEGER},",
          "money_dl = #{moneyDl,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=TINYINT},",
          "spread_uid = #{spreadUid,jdbcType=INTEGER},",
          "spread_time = #{spreadTime,jdbcType=TIMESTAMP},",
          "spread_limit = #{spreadLimit,jdbcType=TIMESTAMP},",
          "brokerage_level = #{brokerageLevel,jdbcType=INTEGER},",
          "user_type = #{userType,jdbcType=VARCHAR},",
          "promoter_time = #{promoterTime,jdbcType=TIMESTAMP},",
          "is_promoter = #{isPromoter,jdbcType=TINYINT},",
          "main_uid = #{mainUid,jdbcType=INTEGER},",
          "pay_count = #{payCount,jdbcType=INTEGER},",
          "pay_price = #{payPrice,jdbcType=DECIMAL},",
          "spread_count = #{spreadCount,jdbcType=INTEGER},",
          "spread_pay_count = #{spreadPayCount,jdbcType=INTEGER},",
          "spread_pay_price = #{spreadPayPrice,jdbcType=DECIMAL},",
          "count_fans = #{countFans,jdbcType=INTEGER},",
          "member_value = #{memberValue,jdbcType=INTEGER},",
          "count_start = #{countStart,jdbcType=INTEGER},",
          "lock_brokerage_amount = #{lockBrokerageAmount,jdbcType=INTEGER},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "district = #{district,jdbcType=VARCHAR},",
          "street = #{street,jdbcType=VARCHAR},",
          "dl_level = #{dlLevel,jdbcType=INTEGER}",
        "where uid = #{uid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HjUser record);
}