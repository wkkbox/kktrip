package com.tp.trip.dao;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.pojo.vo.TbHotelCustom;
import com.tp.trip.pojo.vo.TbQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 14:05
 * Version:V1.0
 */
public interface TbHotelCustomMapper {

    //分页查询
    List<TbHotelCustom> listItemByPage(@Param("page") Page page, @Param("order") Order order, @Param("query")TbQuery query);
    //查看酒店总数
    int countItems();

}
