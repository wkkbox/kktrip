package com.tp.trip.service;

import com.tp.trip.common.dto.PageBean;
import com.tp.trip.pojo.po.TbFood;



public interface ProtalFoodService {
    PageBean<TbFood> foodByPage(TbFood food, Integer currentPage, Integer pageSize);

}
