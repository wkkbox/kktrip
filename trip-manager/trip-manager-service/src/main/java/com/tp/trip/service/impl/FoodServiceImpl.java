package com.tp.trip.service.impl;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.common.util.IDUtils;
import com.tp.trip.dao.TbFoodCustomMapper;
import com.tp.trip.dao.TbFoodMapper;
import com.tp.trip.pojo.po.TbFood;
import com.tp.trip.pojo.po.TbFoodExample;
import com.tp.trip.pojo.vo.TbFoodCustom;
import com.tp.trip.service.FoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 20:38
 * Version:V1.0
 */
@Service
public class FoodServiceImpl implements FoodService{
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbFoodCustomMapper tbFoodCustomMapper;
    @Autowired
    private TbFoodMapper tbFoodMapper;
    @Override
    public Result<TbFoodCustom> listFoods(Page page, Order order,TbFoodCustom tbFoodCustom) {
        Result<TbFoodCustom> result=null;
        try {
            result=new Result<>();
            Map<String,Object> map=new HashMap<>();
            map.put("page",page);
            map.put("order",order);
            map.put("tbFoodCustom",tbFoodCustom);
            int i=tbFoodCustomMapper.countNum(tbFoodCustom);
            List<TbFoodCustom> list=tbFoodCustomMapper.listFood(map);
            result.setRows(list);
            result.setTotal(i);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int rmUpdateFoodByIds(List<Long> ids) {
        int i=0;
        try {
            TbFood record = new TbFood();
            record.setTemp1("3");
            TbFoodExample example = new TbFoodExample();
            TbFoodExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i=tbFoodMapper.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int downUpdateFoodByIds(List<Long> ids) {
        int i=0;
        try {
            TbFood record = new TbFood();
            record.setTemp1("2");
            TbFoodExample example = new TbFoodExample();
            TbFoodExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i=tbFoodMapper.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int upUpdateFoodByIds(List<Long> ids) {
        int i=0;
        try {
            TbFood record = new TbFood();
            record.setTemp1("1");
            TbFoodExample example = new TbFoodExample();
            TbFoodExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i=tbFoodMapper.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Transactional
    @Override
    public int saveItemFoods(TbFood tbFood,String id) {
        int i=0;
        try {
            long itemId= IDUtils.getItemId();
            String foodImage = tbFood.getFoodImage();
            if (foodImage!=null){
                String image = foodImage.substring(foodImage.indexOf("http://"), foodImage.indexOf(".jpg") + 4);
                tbFood.setFoodImage(image);
            }
            tbFood.setId(itemId);
            tbFood.setScenicId(Long.valueOf(id));
            tbFood.setTemp1("2");
            i=tbFoodMapper.insertSelective(tbFood);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public TbFood getFood(Long id) {

        return tbFoodCustomMapper.selectFoodAndScenic(id);
    }

    @Override
    public int updateFoods(TbFoodCustom tbFoodCustom, Long scenicId) {
        int i=0;
        try {
            String foodImage = tbFoodCustom.getFoodImage();
            if (foodImage!=null){
                String image = foodImage.substring(foodImage.indexOf("http://"), foodImage.indexOf(".jpg") + 4);
                tbFoodCustom.setFoodImage(image);
            }
            tbFoodCustom.setTemp1("2");
            i=tbFoodCustomMapper.updateFoods(tbFoodCustom);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
