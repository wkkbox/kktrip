package com.tp.trip.service;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.po.TbFood;
import com.tp.trip.pojo.vo.TbFoodCustom;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 20:37
 * Version:V1.0
 */
public interface FoodService {
    Result<TbFoodCustom> listFoods(Page page, Order order,TbFoodCustom tbFoodCustom);

    int rmUpdateFoodByIds(List<Long> ids);

    int downUpdateFoodByIds(List<Long> ids);

    int upUpdateFoodByIds(List<Long> ids);

    int saveItemFoods(TbFood tbFood, String id);

    TbFood getFood(Long id);

    int updateFoods(TbFoodCustom tbFoodCustom, Long scenicId);
}
