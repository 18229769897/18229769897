package com.hj.dao;

import com.hj.entity.HjUserBill;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Mapper
@Repository
public interface HjUserBillMapper {
    @Delete({
        "delete from hj_user_bill",
        "where bill_id = #{billId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer billId);

    @Insert({
        "insert into hj_user_bill (bill_id, uid, ",
        "link_id, pm, title, ",
        "category, type, ",
        "number, balance, ",
        "mark, mer_id, create_time, ",
        "status)",
        "values (#{billId,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, ",
        "#{linkId,jdbcType=VARCHAR}, #{pm,jdbcType=TINYINT}, #{title,jdbcType=VARCHAR}, ",
        "#{category,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, ",
        "#{number,jdbcType=DECIMAL}, #{balance,jdbcType=DECIMAL}, ",
        "#{mark,jdbcType=VARCHAR}, #{merId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=BIT})"
    })
    int insert(HjUserBill record);

    @InsertProvider(type=HjUserBillSqlProvider.class, method="insertSelective")
    int insertSelective(HjUserBill record);

    @Select({
        "select",
        "bill_id, uid, link_id, pm, title, category, type, number, balance, mark, mer_id, ",
        "create_time, status",
        "from hj_user_bill",
        "where bill_id = #{billId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="bill_id", property="billId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
        @Result(column="link_id", property="linkId", jdbcType=JdbcType.VARCHAR),
        @Result(column="pm", property="pm", jdbcType=JdbcType.TINYINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.DECIMAL),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="mer_id", property="merId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.BIT)
    })
    HjUserBill selectByPrimaryKey(Integer billId);

    @Select({
            "select",
            "bill_id, uid, link_id, pm, title, category, type, number, balance, mark, mer_id, ",
            "create_time, status",
            "from hj_user_bill",
            "where uid = #{uid} and category = 'money_dl' limit #{page},#{limit}"
    })
    @Results({
            @Result(column="bill_id", property="billId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="uid", property="uid", jdbcType=JdbcType.INTEGER),
            @Result(column="link_id", property="linkId", jdbcType=JdbcType.VARCHAR),
            @Result(column="pm", property="pm", jdbcType=JdbcType.TINYINT),
            @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
            @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
            @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
            @Result(column="number", property="number", jdbcType=JdbcType.DECIMAL),
            @Result(column="balance", property="balance", jdbcType=JdbcType.DECIMAL),
            @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
            @Result(column="mer_id", property="merId", jdbcType=JdbcType.INTEGER),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="status", property="status", jdbcType=JdbcType.BIT)
    })
    List<HjUserBill> selectByUidAndPage(Integer uid, Integer page, Integer limit);

    @Select({
            "select",
            "sum(number)",
            "from hj_user_bill ",
            "where uid = #{uid} and category = 'money_dl' and pm = 1"
    })
    @Results({

    })
    BigDecimal selectByUid(Integer uid);

    @UpdateProvider(type=HjUserBillSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HjUserBill record);

    @Update({
        "update hj_user_bill",
        "set uid = #{uid,jdbcType=INTEGER},",
          "link_id = #{linkId,jdbcType=VARCHAR},",
          "pm = #{pm,jdbcType=TINYINT},",
          "title = #{title,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "number = #{number,jdbcType=DECIMAL},",
          "balance = #{balance,jdbcType=DECIMAL},",
          "mark = #{mark,jdbcType=VARCHAR},",
          "mer_id = #{merId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=BIT}",
        "where bill_id = #{billId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HjUserBill record);
}