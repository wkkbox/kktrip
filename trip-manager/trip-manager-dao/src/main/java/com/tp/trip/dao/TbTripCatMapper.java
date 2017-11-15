package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbTripCat;
import com.tp.trip.pojo.po.TbTripCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTripCatMapper {
    int countByExample(TbTripCatExample example);

    int deleteByExample(TbTripCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTripCat record);

    int insertSelective(TbTripCat record);

    List<TbTripCat> selectByExample(TbTripCatExample example);

    TbTripCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTripCat record, @Param("example") TbTripCatExample example);

    int updateByExample(@Param("record") TbTripCat record, @Param("example") TbTripCatExample example);

    int updateByPrimaryKeySelective(TbTripCat record);

    int updateByPrimaryKey(TbTripCat record);
}