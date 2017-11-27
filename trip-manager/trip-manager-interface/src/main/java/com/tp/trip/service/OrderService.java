package com.tp.trip.service;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.vo.TbOrderCustom;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/25
 * Time: 14:09
 * Version:V1.0
 */
public interface OrderService {
    Result<TbOrderCustom> listOrdersByPage(Page page, Order order, TbOrderCustom tbOrderCustom);

    int removeOrdersByIds(List<Long> ids);

    TbOrderCustom getOrder(Long id);

    int updateOrders(TbOrderCustom tbOrderCustom, Long id);
}
