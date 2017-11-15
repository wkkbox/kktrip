package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbScenicDesc;
import com.tp.trip.pojo.po.TbScenicDescExample;
import com.tp.trip.pojo.po.TbScenicDescWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbScenicDescMapper {
    int countByExample(TbScenicDescExample example);

    int deleteByExample(TbScenicDescExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbScenicDescWithBLOBs record);

    int insertSelective(TbScenicDescWithBLOBs record);

    List<TbScenicDescWithBLOBs> selectByExampleWithBLOBs(TbScenicDescExample example);

    List<TbScenicDesc> selectByExample(TbScenicDescExample example);

    TbScenicDescWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbScenicDescWithBLOBs record, @Param("example") TbScenicDescExample example);

    int updateByExampleWithBLOBs(@Param("record") TbScenicDescWithBLOBs record, @Param("example") TbScenicDescExample example);

    int updateByExample(@Param("record") TbScenicDesc record, @Param("example") TbScenicDescExample example);

    int updateByPrimaryKeySelective(TbScenicDescWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbScenicDescWithBLOBs record);

    int updateByPrimaryKey(TbScenicDesc record);
}