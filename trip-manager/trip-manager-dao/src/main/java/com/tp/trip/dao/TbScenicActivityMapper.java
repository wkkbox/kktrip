package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbScenicActivity;
import com.tp.trip.pojo.po.TbScenicActivityExample;
import com.tp.trip.pojo.po.TbScenicActivityWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbScenicActivityMapper {
    int countByExample(TbScenicActivityExample example);

    int deleteByExample(TbScenicActivityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbScenicActivityWithBLOBs record);

    int insertSelective(TbScenicActivityWithBLOBs record);

    List<TbScenicActivityWithBLOBs> selectByExampleWithBLOBs(TbScenicActivityExample example);

    List<TbScenicActivity> selectByExample(TbScenicActivityExample example);

    TbScenicActivityWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbScenicActivityWithBLOBs record, @Param("example") TbScenicActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") TbScenicActivityWithBLOBs record, @Param("example") TbScenicActivityExample example);

    int updateByExample(@Param("record") TbScenicActivity record, @Param("example") TbScenicActivityExample example);

    int updateByPrimaryKeySelective(TbScenicActivityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbScenicActivityWithBLOBs record);

    int updateByPrimaryKey(TbScenicActivity record);
}