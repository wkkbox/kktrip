package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbFood;


import java.util.List;
import java.util.Map;

public interface TbFoodPortalMapper {

    /***
     * 查询总记录数
     * @param food
     * @return
     */
    Integer foodCount(TbFood food);

    /***
     * 分页查询
     */
    List<TbFood> listFood(Map<String, Object> map);

}
