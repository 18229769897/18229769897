package com.hj.dao;

import com.hj.entity.HjAgentVerify;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HjAgentVerifyMapper {
    @Delete({
        "delete from hj_agent_verify",
        "where verify_id = #{verifyId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer verifyId);

    @Insert({
        "insert into hj_agent_verify (verify_id, agent_name, ",
        "phone, agent_level, ",
        "proof_url, uid, create_time, ",
        "handle_time, status, ",
        "reason, province, ",
        "city, district, ",
        "street)",
        "values (#{verifyId,jdbcType=INTEGER}, #{agentName,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{agentLevel,jdbcType=INTEGER}, ",
        "#{proofUrl,jdbcType=VARCHAR}, #{uid,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{handleTime,jdbcType=TIMESTAMP}, #{status,jdbcType=TINYINT}, ",
        "#{reason,jdbcType=VARCHAR}, #{province,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{district,jdbcType=VARCHAR}, ",
        "#{street,jdbcType=VARCHAR})"
    })
    int insert(HjAgentVerify record);

    @InsertProvider(type=HjAgentVerifySqlProvider.class, method="insertSelective")
    int insertSelective(HjAgentVerify record);

    @Select({
        "select",
        "verify_id, agent_name, phone, agent_level, proof_url, uid, create_time, handle_time, ",
        "status, reason, province, city, district, street",
        "from hj_agent_verify",
        "where verify_id = #{verifyId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="verify_id", property="verifyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="agent_name", property="agentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_level", property="agentLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="proof_url", property="proofUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="handle_time", property="handleTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR)
    })
    HjAgentVerify selectByPrimaryKey(Integer verifyId);


    @Select({
            "select",
            "verify_id, agent_name, phone, agent_level, proof_url, uid, create_time, handle_time, ",
            "status, reason, province, city, district, street",
            "from hj_agent_verify",
            "where uid = #{uid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="verify_id", property="verifyId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="agent_name", property="agentName", jdbcType=JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
            @Result(column="agent_level", property="agentLevel", jdbcType=JdbcType.INTEGER),
            @Result(column="proof_url", property="proofUrl", jdbcType=JdbcType.VARCHAR),
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="handle_time", property="handleTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
            @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
            @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
            @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
            @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR)
    })
    List<HjAgentVerify> selectByUid(Integer uid);

    @Select({
            "select",
            "verify_id, agent_name, phone, agent_level, proof_url, uid, create_time, handle_time, ",
            "status, reason, province, city, district, street",
            "from hj_agent_verify",
            "where uid = #{uid,jdbcType=INTEGER} and status = #{status,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="verify_id", property="verifyId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="agent_name", property="agentName", jdbcType=JdbcType.VARCHAR),
            @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
            @Result(column="agent_level", property="agentLevel", jdbcType=JdbcType.INTEGER),
            @Result(column="proof_url", property="proofUrl", jdbcType=JdbcType.VARCHAR),
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="handle_time", property="handleTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
            @Result(column="reason", property="reason", jdbcType=JdbcType.VARCHAR),
            @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
            @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
            @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR)
    })
    List<HjAgentVerify> selectByUidAndStatus(Integer uid,Integer status);

    @UpdateProvider(type=HjAgentVerifySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HjAgentVerify record);

    @Update({
        "update hj_agent_verify",
        "set agent_name = #{agentName,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "agent_level = #{agentLevel,jdbcType=INTEGER},",
          "proof_url = #{proofUrl,jdbcType=VARCHAR},",
          "uid = #{uid,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "handle_time = #{handleTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=TINYINT},",
          "reason = #{reason,jdbcType=VARCHAR},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "district = #{district,jdbcType=VARCHAR},",
          "street = #{street,jdbcType=VARCHAR}",
        "where verify_id = #{verifyId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HjAgentVerify record);
}