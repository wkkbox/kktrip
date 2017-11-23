package com.tp.trip.web;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.po.TbFood;
import com.tp.trip.pojo.vo.TbFoodCustom;
import com.tp.trip.service.FoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 20:11
 * Version:V1.0
 */
@Controller
public class FoodAction {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private FoodService foodService;

    //分页查询
    @ResponseBody
    @RequestMapping("/itemFoods")
    public Result<TbFoodCustom> listFoods(Page page, Order order,TbFoodCustom tbFoodCustom){
        Result<TbFoodCustom> result=null;
        try {
            result=foodService.listFoods(page,order,tbFoodCustom);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
    //删除（改变状态）
    @ResponseBody
    @RequestMapping("/itemFoods/batchRemove")
    public int rmUpdateFoodByIds(@RequestParam("ids[]") List<Long> ids){

        int i=0;
        try {
            i= foodService.rmUpdateFoodByIds(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
    //上架（改变状态）
    @ResponseBody
    @RequestMapping("/itemFoods/batchDown")
    public int downUpdateFoodByIds(@RequestParam("ids[]") List<Long> ids){

        int i=0;
        try {
            i= foodService.downUpdateFoodByIds(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
    //下架（改变状态）
    @ResponseBody
    @RequestMapping("/itemFoods/batchUp")
    public int upUpdateFoodByIds(@RequestParam("ids[]") List<Long> ids){

        int i=0;
        try {
            i= foodService.upUpdateFoodByIds(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
    //增加
    @ResponseBody
    @RequestMapping("/itemFoodsAdd")
    public int saveItemFoods(TbFood tbFood,String id){
        int i=0;
        try {
            i= foodService.saveItemFoods(tbFood,id);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    //在修改前查询点中的数据
    @ResponseBody
    @RequestMapping(value = "/getFoodsById/{id}")
    public void getFoodsById(@PathVariable("id") Long id, HttpSession session){
        session.removeAttribute("food");
        TbFood tbFood= foodService.getFood(id);
        session.setAttribute("food",tbFood);
    }
    //修改数据
    @ResponseBody
    @RequestMapping("/foodUpdate")
    public int updateFoods(TbFoodCustom tbFoodCustom,Long scenicId){

        int i=0;
        try {
            i= foodService.updateFoods(tbFoodCustom,scenicId);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
