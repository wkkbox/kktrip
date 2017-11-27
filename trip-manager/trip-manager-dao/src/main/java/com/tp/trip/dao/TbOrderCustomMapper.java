package com.tp.trip.dao;

import com.tp.trip.pojo.vo.TbOrderCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map; /**
 * User: Administrator
 * Date: 2017/11/25
 * Time: 14:17
 * Version:V1.0
 */
public interface TbOrderCustomMapper {
    int countOrder(@Param("tbOrderCustom") TbOrderCustom tbOrderCustom);

    List<TbOrderCustom> listOrdersByPage(Map<String, Object> map);

    TbOrderCustom getOrder(Long id);

    int updateOrders(TbOrderCustom tbOrderCustom);
}
