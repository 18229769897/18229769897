package com.hj.dao;

import com.hj.entity.HjAgentUser;
import org.apache.ibatis.jdbc.SQL;

public class HjAgentUserSqlProvider {

    public String insertSelective(HjAgentUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hj_agent_user");
        
        if (record.getAgentId() != null) {
            sql.VALUES("agent_id", "#{agentId,jdbcType=INTEGER}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getAgentLevel() != null) {
            sql.VALUES("agent_level", "#{agentLevel,jdbcType=INTEGER}");
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
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMoneyDl() != null) {
            sql.VALUES("money_dl", "#{moneyDl,jdbcType=DECIMAL}");
        }
        
        if (record.getStreet() != null) {
            sql.VALUES("street", "#{street,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HjAgentUser record) {
        SQL sql = new SQL();
        sql.UPDATE("hj_agent_user");
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getAgentLevel() != null) {
            sql.SET("agent_level = #{agentLevel,jdbcType=INTEGER}");
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
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMoneyDl() != null) {
            sql.SET("money_dl = #{moneyDl,jdbcType=DECIMAL}");
        }
        
        if (record.getStreet() != null) {
            sql.SET("street = #{street,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("agent_id = #{agentId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}