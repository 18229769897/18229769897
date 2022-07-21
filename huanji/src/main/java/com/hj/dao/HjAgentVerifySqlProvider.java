package com.hj.dao;

import com.hj.entity.HjAgentVerify;
import org.apache.ibatis.jdbc.SQL;

public class HjAgentVerifySqlProvider {

    public String insertSelective(HjAgentVerify record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("hj_agent_verify");
        
        if (record.getVerifyId() != null) {
            sql.VALUES("verify_id", "#{verifyId,jdbcType=INTEGER}");
        }
        
        if (record.getAgentName() != null) {
            sql.VALUES("agent_name", "#{agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentLevel() != null) {
            sql.VALUES("agent_level", "#{agentLevel,jdbcType=INTEGER}");
        }
        
        if (record.getProofUrl() != null) {
            sql.VALUES("proof_url", "#{proofUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getHandleTime() != null) {
            sql.VALUES("handle_time", "#{handleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getReason() != null) {
            sql.VALUES("reason", "#{reason,jdbcType=VARCHAR}");
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
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HjAgentVerify record) {
        SQL sql = new SQL();
        sql.UPDATE("hj_agent_verify");
        
        if (record.getAgentName() != null) {
            sql.SET("agent_name = #{agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentLevel() != null) {
            sql.SET("agent_level = #{agentLevel,jdbcType=INTEGER}");
        }
        
        if (record.getProofUrl() != null) {
            sql.SET("proof_url = #{proofUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getHandleTime() != null) {
            sql.SET("handle_time = #{handleTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getReason() != null) {
            sql.SET("reason = #{reason,jdbcType=VARCHAR}");
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
        
        sql.WHERE("verify_id = #{verifyId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}