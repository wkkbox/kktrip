package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbScenic;
import com.tp.trip.pojo.po.TbScenicExample;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbScenicMapper {
    int countByExample(TbScenicExample example);

    int deleteByExample(TbScenicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbScenicWithBLOBs record);

    int insertSelective(TbScenicWithBLOBs record);

    List<TbScenicWithBLOBs> selectByExampleWithBLOBs(TbScenicExample example);

    List<TbScenic> selectByExample(TbScenicExample example);

    TbScenicWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbScenicWithBLOBs record, @Param("example") TbScenicExample example);

    int updateByExampleWithBLOBs(@Param("record") TbScenicWithBLOBs record, @Param("example") TbScenicExample example);

    int updateByExample(@Param("record") TbScenic record, @Param("example") TbScenicExample example);

    int updateByPrimaryKeySelective(TbScenicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbScenicWithBLOBs record);

    int updateByPrimaryKey(TbScenic record);
}