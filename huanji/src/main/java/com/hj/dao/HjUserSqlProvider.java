package com.hj.dao;

import com.hj.entity.HjUser;
import org.apache.ibatis.jdbc.SQL;

public class HjUserSqlProvider {

    public String insertSelective(HjUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hj_user");
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getWechatUserId() != null) {
            sql.VALUES("wechat_user_id", "#{wechatUserId,jdbcType=INTEGER}");
        }
        
        if (record.getAccount() != null) {
            sql.VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getPwd() != null) {
            sql.VALUES("pwd", "#{pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getPayPwd() != null) {
            sql.VALUES("pay_pwd", "#{payPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getRealName() != null) {
            sql.VALUES("real_name", "#{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getCardId() != null) {
            sql.VALUES("card_id", "#{cardId,jdbcType=VARCHAR}");
        }
        
        if (record.getIsReals() != null) {
            sql.VALUES("is_reals", "#{isReals,jdbcType=TINYINT}");
        }
        
        if (record.getLevel() != null) {
            sql.VALUES("level", "#{level,jdbcType=TINYINT}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=TINYINT}");
        }
        
        if (record.getBirthday() != null) {
            sql.VALUES("birthday", "#{birthday,jdbcType=DATE}");
        }
        
        if (record.getMark() != null) {
            sql.VALUES("mark", "#{mark,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelId() != null) {
            sql.VALUES("label_id", "#{labelId,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupId() != null) {
            sql.VALUES("group_id", "#{groupId,jdbcType=INTEGER}");
        }
        
        if (record.getNickname() != null) {
            sql.VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            sql.VALUES("avatar", "#{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=CHAR}");
        }
        
        if (record.getAddres() != null) {
            sql.VALUES("addres", "#{addres,jdbcType=VARCHAR}");
        }
        
        if (record.getCancelTime() != null) {
            sql.VALUES("cancel_time", "#{cancelTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastTime() != null) {
            sql.VALUES("last_time", "#{lastTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastIp() != null) {
            sql.VALUES("last_ip", "#{lastIp,jdbcType=VARCHAR}");
        }
        
        if (record.getNowMoney() != null) {
            sql.VALUES("now_money", "#{nowMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getBrokeragePrice() != null) {
            sql.VALUES("brokerage_price", "#{brokeragePrice,jdbcType=DECIMAL}");
        }
        
        if (record.getWaitReleased() != null) {
            sql.VALUES("wait_released", "#{waitReleased,jdbcType=DECIMAL}");
        }
        
        if (record.getCoupons() != null) {
            sql.VALUES("coupons", "#{coupons,jdbcType=INTEGER}");
        }
        
        if (record.getLovePoints() != null) {
            sql.VALUES("love_points", "#{lovePoints,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegral() != null) {
            sql.VALUES("integral", "#{integral,jdbcType=INTEGER}");
        }
        
        if (record.getMoneyDl() != null) {
            sql.VALUES("money_dl", "#{moneyDl,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getSpreadUid() != null) {
            sql.VALUES("spread_uid", "#{spreadUid,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadTime() != null) {
            sql.VALUES("spread_time", "#{spreadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSpreadLimit() != null) {
            sql.VALUES("spread_limit", "#{spreadLimit,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBrokerageLevel() != null) {
            sql.VALUES("brokerage_level", "#{brokerageLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUserType() != null) {
            sql.VALUES("user_type", "#{userType,jdbcType=VARCHAR}");
        }
        
        if (record.getPromoterTime() != null) {
            sql.VALUES("promoter_time", "#{promoterTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsPromoter() != null) {
            sql.VALUES("is_promoter", "#{isPromoter,jdbcType=TINYINT}");
        }
        
        if (record.getMainUid() != null) {
            sql.VALUES("main_uid", "#{mainUid,jdbcType=INTEGER}");
        }
        
        if (record.getPayCount() != null) {
            sql.VALUES("pay_count", "#{payCount,jdbcType=INTEGER}");
        }
        
        if (record.getPayPrice() != null) {
            sql.VALUES("pay_price", "#{payPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getSpreadCount() != null) {
            sql.VALUES("spread_count", "#{spreadCount,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadPayCount() != null) {
            sql.VALUES("spread_pay_count", "#{spreadPayCount,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadPayPrice() != null) {
            sql.VALUES("spread_pay_price", "#{spreadPayPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getCountFans() != null) {
            sql.VALUES("count_fans", "#{countFans,jdbcType=INTEGER}");
        }
        
        if (record.getMemberValue() != null) {
            sql.VALUES("member_value", "#{memberValue,jdbcType=INTEGER}");
        }
        
        if (record.getCountStart() != null) {
            sql.VALUES("count_start", "#{countStart,jdbcType=INTEGER}");
        }
        
        if (record.getLockBrokerageAmount() != null) {
            sql.VALUES("lock_brokerage_amount", "#{lockBrokerageAmount,jdbcType=INTEGER}");
        }
        
        if (record.getProvince() != null) {
            sql.VALUES("province", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getDistrict() != null) {
            sql.VALUES("district", "#{district,jdbcType=VARCHAR}");
        }
        
        if (record.getStreet() != null) {
            sql.VALUES("street", "#{street,jdbcType=VARCHAR}");
        }
        
        if (record.getDlLevel() != null) {
            sql.VALUES("dl_level", "#{dlLevel,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadPath() != null) {
            sql.VALUES("spread_path", "#{spreadPath,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HjUser record) {
        SQL sql = new SQL();
        sql.UPDATE("hj_user");
        
        if (record.getWechatUserId() != null) {
            sql.SET("wechat_user_id = #{wechatUserId,jdbcType=INTEGER}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getPwd() != null) {
            sql.SET("pwd = #{pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getPayPwd() != null) {
            sql.SET("pay_pwd = #{payPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getRealName() != null) {
            sql.SET("real_name = #{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getCardId() != null) {
            sql.SET("card_id = #{cardId,jdbcType=VARCHAR}");
        }
        
        if (record.getIsReals() != null) {
            sql.SET("is_reals = #{isReals,jdbcType=TINYINT}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("level = #{level,jdbcType=TINYINT}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=TINYINT}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("birthday = #{birthday,jdbcType=DATE}");
        }
        
        if (record.getMark() != null) {
            sql.SET("mark = #{mark,jdbcType=VARCHAR}");
        }
        
        if (record.getLabelId() != null) {
            sql.SET("label_id = #{labelId,jdbcType=VARCHAR}");
        }
        
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{groupId,jdbcType=INTEGER}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getAvatar() != null) {
            sql.SET("avatar = #{avatar,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=CHAR}");
        }
        
        if (record.getAddres() != null) {
            sql.SET("addres = #{addres,jdbcType=VARCHAR}");
        }
        
        if (record.getCancelTime() != null) {
            sql.SET("cancel_time = #{cancelTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastTime() != null) {
            sql.SET("last_time = #{lastTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastIp() != null) {
            sql.SET("last_ip = #{lastIp,jdbcType=VARCHAR}");
        }
        
        if (record.getNowMoney() != null) {
            sql.SET("now_money = #{nowMoney,jdbcType=DECIMAL}");
        }
        
        if (record.getBrokeragePrice() != null) {
            sql.SET("brokerage_price = #{brokeragePrice,jdbcType=DECIMAL}");
        }
        
        if (record.getWaitReleased() != null) {
            sql.SET("wait_released = #{waitReleased,jdbcType=DECIMAL}");
        }
        
        if (record.getCoupons() != null) {
            sql.SET("coupons = #{coupons,jdbcType=INTEGER}");
        }
        
        if (record.getLovePoints() != null) {
            sql.SET("love_points = #{lovePoints,jdbcType=DECIMAL}");
        }
        
        if (record.getIntegral() != null) {
            sql.SET("integral = #{integral,jdbcType=INTEGER}");
        }
        
        if (record.getMoneyDl() != null) {
            sql.SET("money_dl = #{moneyDl,jdbcType=DECIMAL}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getSpreadUid() != null) {
            sql.SET("spread_uid = #{spreadUid,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadTime() != null) {
            sql.SET("spread_time = #{spreadTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSpreadLimit() != null) {
            sql.SET("spread_limit = #{spreadLimit,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBrokerageLevel() != null) {
            sql.SET("brokerage_level = #{brokerageLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("user_type = #{userType,jdbcType=VARCHAR}");
        }
        
        if (record.getPromoterTime() != null) {
            sql.SET("promoter_time = #{promoterTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsPromoter() != null) {
            sql.SET("is_promoter = #{isPromoter,jdbcType=TINYINT}");
        }
        
        if (record.getMainUid() != null) {
            sql.SET("main_uid = #{mainUid,jdbcType=INTEGER}");
        }
        
        if (record.getPayCount() != null) {
            sql.SET("pay_count = #{payCount,jdbcType=INTEGER}");
        }
        
        if (record.getPayPrice() != null) {
            sql.SET("pay_price = #{payPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getSpreadCount() != null) {
            sql.SET("spread_count = #{spreadCount,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadPayCount() != null) {
            sql.SET("spread_pay_count = #{spreadPayCount,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadPayPrice() != null) {
            sql.SET("spread_pay_price = #{spreadPayPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getCountFans() != null) {
            sql.SET("count_fans = #{countFans,jdbcType=INTEGER}");
        }
        
        if (record.getMemberValue() != null) {
            sql.SET("member_value = #{memberValue,jdbcType=INTEGER}");
        }
        
        if (record.getCountStart() != null) {
            sql.SET("count_start = #{countStart,jdbcType=INTEGER}");
        }
        
        if (record.getLockBrokerageAmount() != null) {
            sql.SET("lock_brokerage_amount = #{lockBrokerageAmount,jdbcType=INTEGER}");
        }
        
        if (record.getProvince() != null) {
            sql.SET("province = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getDistrict() != null) {
            sql.SET("district = #{district,jdbcType=VARCHAR}");
        }
        
        if (record.getStreet() != null) {
            sql.SET("street = #{street,jdbcType=VARCHAR}");
        }
        
        if (record.getDlLevel() != null) {
            sql.SET("dl_level = #{dlLevel,jdbcType=INTEGER}");
        }
        
        if (record.getSpreadPath() != null) {
            sql.SET("spread_path = #{spreadPath,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("uid = #{uid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}