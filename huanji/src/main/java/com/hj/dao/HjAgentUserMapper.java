package com.hj.dao;

import com.hj.entity.HjAgentUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface HjAgentUserMapper {
    @Delete({
        "delete from hj_agent_user",
        "where agent_id = #{agentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer agentId);

    @Insert({
        "insert into hj_agent_user (agent_id, uid, ",
        "agent_level, province, ",
        "city, district, ",
        "create_time, money_dl, ",
        "street)",
        "values (#{agentId,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, ",
        "#{agentLevel,jdbcType=INTEGER}, #{province,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{district,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{moneyDl,jdbcType=DECIMAL}, ",
        "#{street,jdbcType=VARCHAR})"
    })
    int insert(HjAgentUser record);

    @InsertProvider(type=HjAgentUserSqlProvider.class, method="insertSelective")
    int insertSelective(HjAgentUser record);

    @Select({
        "select",
        "agent_id, uid, agent_level, province, city, district, create_time, money_dl, ",
        "street",
        "from hj_agent_user",
        "where agent_id = #{agentId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="agent_level", property="agentLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="money_dl", property="moneyDl", jdbcType=JdbcType.DECIMAL),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR)
    })
    HjAgentUser selectByPrimaryKey(Integer agentId);

    @Select({
            "select",
            "agent_id, uid, agent_level, province, city, district, create_time, money_dl, ",
            "street",
            "from hj_agent_user"
    })
    @Results({
            @Result(column="agent_id", property="agentId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
            @Result(column="agent_level", property="agentLevel", jdbcType=JdbcType.INTEGER),
            @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
            @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="money_dl", property="moneyDl", jdbcType=JdbcType.DECIMAL),
            @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR)
    })
    List<HjAgentUser> selectAll();


    @Select({
            "select",
            "agent_id, uid, agent_level, province, city, district, create_time, money_dl, ",
            "street",
            "from hj_agent_user",
            "where uid = #{uid,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="agent_id", property="agentId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
            @Result(column="agent_level", property="agentLevel", jdbcType=JdbcType.INTEGER),
            @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
            @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="money_dl", property="moneyDl", jdbcType=JdbcType.DECIMAL),
            @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR)
    })
    HjAgentUser selectByUid(Integer uid);

    @Select({
            "select",
            "*",
            "from hj_agent_user",
            "where province=#{province} and if(#{level}>1,city=#{city},1=1) and if(#{level}>2,district=#{district},1=1) and if(#{level}>3,street=#{street},1=1) and agent_level = #{level}"
    })
    @Results({
            @Result(column="agent_id", property="agentId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
            @Result(column="agent_level", property="agentLevel", jdbcType=JdbcType.INTEGER),
            @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
            @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="money_dl", property="moneyDl", jdbcType=JdbcType.DECIMAL),
            @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR)
    })
    HjAgentUser selectByArealAndLevel(String province, String city, String district, String street, Integer level);

    @Select({
            "select",
            "*",
            "from hj_agent_user",
            "where province=#{province} and if(#{level}>1,city=#{city},1=1) and if(#{level}>2,district=#{district},1=1) and if(#{level}>3,street=#{street},1=1) and agent_level = #{level} and create_time < #{time}"
    })
    @Results({
            @Result(column="agent_id", property="agentId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
            @Result(column="agent_level", property="agentLevel", jdbcType=JdbcType.INTEGER),
            @Result(column="province", property="province", jdbcType=JdbcType.VARCHAR),
            @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
            @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="money_dl", property="moneyDl", jdbcType=JdbcType.DECIMAL),
            @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
            @Result(column="uid", property="hjUser", one=@One(select = "com.hj.dao.HjUserMapper.selectByPrimaryKey", fetchType = FetchType.EAGER))
    })
    HjAgentUser selectByArealAndTime(String province, String city, String district, String street, Integer level,String time);

    @UpdateProvider(type=HjAgentUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HjAgentUser record);

    @Update({
        "update hj_agent_user",
        "set uid = #{uid,jdbcType=INTEGER},",
          "agent_level = #{agentLevel,jdbcType=INTEGER},",
          "province = #{province,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "district = #{district,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "money_dl = #{moneyDl,jdbcType=DECIMAL},",
          "street = #{street,jdbcType=VARCHAR}",
        "where agent_id = #{agentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HjAgentUser record);
}