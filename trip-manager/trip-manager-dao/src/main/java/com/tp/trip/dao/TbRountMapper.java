package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbRount;
import com.tp.trip.pojo.po.TbRountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRountMapper {
    int countByExample(TbRountExample example);

    int deleteByExample(TbRountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRount record);

    int insertSelective(TbRount record);

    List<TbRount> selectByExample(TbRountExample example);

    TbRount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRount record, @Param("example") TbRountExample example);

    int updateByExample(@Param("record") TbRount record, @Param("example") TbRountExample example);

    int updateByPrimaryKeySelective(TbRount record);

    int updateByPrimaryKey(TbRount record);
}