package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbReply;
import com.tp.trip.pojo.po.TbReplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbReplyMapper {
    int countByExample(TbReplyExample example);

    int deleteByExample(TbReplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbReply record);

    int insertSelective(TbReply record);

    List<TbReply> selectByExample(TbReplyExample example);

    TbReply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    int updateByExample(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    int updateByPrimaryKeySelective(TbReply record);

    int updateByPrimaryKey(TbReply record);
}