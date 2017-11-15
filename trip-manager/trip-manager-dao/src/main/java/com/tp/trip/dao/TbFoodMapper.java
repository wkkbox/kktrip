package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbFood;
import com.tp.trip.pojo.po.TbFoodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbFoodMapper {
    int countByExample(TbFoodExample example);

    int deleteByExample(TbFoodExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbFood record);

    int insertSelective(TbFood record);

    List<TbFood> selectByExampleWithBLOBs(TbFoodExample example);

    List<TbFood> selectByExample(TbFoodExample example);

    TbFood selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbFood record, @Param("example") TbFoodExample example);

    int updateByExampleWithBLOBs(@Param("record") TbFood record, @Param("example") TbFoodExample example);

    int updateByExample(@Param("record") TbFood record, @Param("example") TbFoodExample example);

    int updateByPrimaryKeySelective(TbFood record);

    int updateByPrimaryKeyWithBLOBs(TbFood record);

    int updateByPrimaryKey(TbFood record);
}