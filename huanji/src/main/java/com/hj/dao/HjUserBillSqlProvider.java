package com.hj.dao;

import com.hj.entity.HjUserBill;
import org.apache.ibatis.jdbc.SQL;

public class HjUserBillSqlProvider {

    public String insertSelective(HjUserBill record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hj_user_bill");
        
        if (record.getBillId() != null) {
            sql.VALUES("bill_id", "#{billId,jdbcType=INTEGER}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getLinkId() != null) {
            sql.VALUES("link_id", "#{linkId,jdbcType=VARCHAR}");
        }
        
        if (record.getPm() != null) {
            sql.VALUES("pm", "#{pm,jdbcType=TINYINT}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.VALUES("category", "#{category,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.VALUES("number", "#{number,jdbcType=DECIMAL}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("balance", "#{balance,jdbcType=DECIMAL}");
        }
        
        if (record.getMark() != null) {
            sql.VALUES("mark", "#{mark,jdbcType=VARCHAR}");
        }
        
        if (record.getMerId() != null) {
            sql.VALUES("mer_id", "#{merId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HjUserBill record) {
        SQL sql = new SQL();
        sql.UPDATE("hj_user_bill");
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getLinkId() != null) {
            sql.SET("link_id = #{linkId,jdbcType=VARCHAR}");
        }
        
        if (record.getPm() != null) {
            sql.SET("pm = #{pm,jdbcType=TINYINT}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getCategory() != null) {
            sql.SET("category = #{category,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("number = #{number,jdbcType=DECIMAL}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{balance,jdbcType=DECIMAL}");
        }
        
        if (record.getMark() != null) {
            sql.SET("mark = #{mark,jdbcType=VARCHAR}");
        }
        
        if (record.getMerId() != null) {
            sql.SET("mer_id = #{merId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=BIT}");
        }
        
        sql.WHERE("bill_id = #{billId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}