package com.tp.trip.web;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.vo.TbOrderCustom;
import com.tp.trip.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/25
 * Time: 11:27
 * Version:V1.0
 */
@Controller
public class OrderAction {

    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private OrderService orderService;
    //1.分页查询订单详情
    @ResponseBody
    @RequestMapping("/itemOrders")
    public Result<TbOrderCustom> listOrdersByPage(Page page, Order order,TbOrderCustom tbOrderCustom){
        Result<TbOrderCustom> result=null;
        try {
            result=orderService.listOrdersByPage(page,order,tbOrderCustom);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
    //2.删除（改变订单状态是未受理）
    @ResponseBody
    @RequestMapping("/itemOrders/batchRemove")
    public int RemoveOrdersByIds(@RequestParam("ids[]") List<Long> ids){
        int i=0;
        try {
            i=orderService.removeOrdersByIds(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
    //3.在修改前查询点中的数据
    @ResponseBody
    @RequestMapping(value = "/getOrdersById/{id}")
    public void getOrdersById(@PathVariable("id") Long id, HttpSession session){
        session.removeAttribute("order");
        TbOrderCustom tbOrderCustom= orderService.getOrder(id);
        session.setAttribute("order",tbOrderCustom);
    }
    //4.修改
    @ResponseBody
    @RequestMapping(value = "/orders/update")
    public int updateOrders(TbOrderCustom tbOrderCustom, Long id){
        int i=0;
        try {
            i= orderService.updateOrders(tbOrderCustom,id);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
