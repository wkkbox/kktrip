package com.tp.trip.service.impl;

import com.tp.trip.common.dto.PageBean;
import com.tp.trip.dao.TbFoodCustomMapper;
import com.tp.trip.dao.TbFoodPortalMapper;
import com.tp.trip.pojo.po.TbFood;
import com.tp.trip.service.ProtalFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProtalFoodServiceImpl implements ProtalFoodService {
    @Autowired
    private TbFoodPortalMapper tbFoodPortalDao;
    @Override
    public PageBean<TbFood> foodByPage(TbFood food, Integer currentPage, Integer pageSize) {
        System.out.println("food"+food.getFoodName());
        System.out.println("currentPage"+currentPage);
        System.out.println("pageSize"+pageSize);
        Map<String,Object> map=new HashMap<>();
        Integer count=tbFoodPortalDao.foodCount(food);
        System.out.println("总记录数"+count);
        PageBean<TbFood> pageBean=new PageBean<>();
       pageBean.setCurrentPage(currentPage);
       pageBean.setPageSize(pageSize);
       pageBean.setTotalCount(count);
       map.put("currentPage",(currentPage-1)*pageSize);
       map.put("pageSize",pageSize);
       map.put("food",food);
       pageBean.setpList(tbFoodPortalDao.listFood(map));
       pageBean.setTotalCount(count%pageSize==0?(count/pageSize):(count/pageSize+1));

        return pageBean;
    }


}
