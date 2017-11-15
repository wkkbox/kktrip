package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbRountDesc;
import com.tp.trip.pojo.po.TbRountDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRountDescMapper {
    int countByExample(TbRountDescExample example);

    int deleteByExample(TbRountDescExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRountDesc record);

    int insertSelective(TbRountDesc record);

    List<TbRountDesc> selectByExampleWithBLOBs(TbRountDescExample example);

    List<TbRountDesc> selectByExample(TbRountDescExample example);

    TbRountDesc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRountDesc record, @Param("example") TbRountDescExample example);

    int updateByExampleWithBLOBs(@Param("record") TbRountDesc record, @Param("example") TbRountDescExample example);

    int updateByExample(@Param("record") TbRountDesc record, @Param("example") TbRountDescExample example);

    int updateByPrimaryKeySelective(TbRountDesc record);

    int updateByPrimaryKeyWithBLOBs(TbRountDesc record);

    int updateByPrimaryKey(TbRountDesc record);
}