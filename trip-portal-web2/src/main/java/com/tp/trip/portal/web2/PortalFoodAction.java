package com.tp.trip.portal.web2;

import com.tp.trip.common.dto.PageBean;
import com.tp.trip.pojo.po.TbFood;
import com.tp.trip.service.ProtalFoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PortalFoodAction {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ProtalFoodService protalFoodService;
    @ResponseBody
    @RequestMapping("/tour/foodList")
    public PageBean<TbFood> foodByPage(TbFood food, Integer currentPage, Integer pageSize){
        PageBean<TbFood> pb=null;
        System.out.println(food.getFoodName());
        System.out.println(currentPage+"当前页");
        System.out.println("每页的大小"+pageSize);
        try {
            pb=protalFoodService.foodByPage(food,currentPage,pageSize);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return  pb;
    }
   /* @RequestMapping("/tour/{id}")
    public String detail(@PathVariable("id") Long scenicId, Model model){
        System.out.println(scenicId);
        List<TbFood> food = protalFoodService.getFoodById(scenicId);
        model.addAttribute("list",food);
        return "food_details";
    }*/

}
