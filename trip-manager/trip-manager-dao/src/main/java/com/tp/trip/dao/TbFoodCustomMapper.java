package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbFood;
import com.tp.trip.pojo.vo.TbFoodCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbFoodCustomMapper {

    int countNum(@Param("tbFoodCustom") TbFoodCustom tbFoodCustom);

    List<TbFoodCustom> listFood(Map<String, Object> map);

    TbFood selectFoodAndScenic(Long id);

    int updateFoods(TbFoodCustom tbFoodCustom);
}
