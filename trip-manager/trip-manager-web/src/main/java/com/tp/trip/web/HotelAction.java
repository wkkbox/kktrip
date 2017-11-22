package com.tp.trip.web;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.po.TbHotel;
import com.tp.trip.pojo.vo.TbHotelCustom;
import com.tp.trip.pojo.vo.TbQuery;
import com.tp.trip.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 13:23
 * Version:V1.0
 */
@Controller
public class HotelAction {

    @Autowired
    private HotelService hotelService;

    /**
     * 分页查询
     * @param page
     * @param order
     * @return
     */
    @ResponseBody
    @RequestMapping("/hotellist")
    public Result<TbHotelCustom> HotelByPage(Page page, Order order, TbQuery query){
        Result<TbHotelCustom> tbHotelResult = hotelService.listByPage(page, order,query);
        return tbHotelResult;
    }

    /**
     * 删除酒店（修改状态）
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("hotelitems/batch")
    public int deletestate(@RequestParam("ids[]") List<Long> ids){
        int deletestate = hotelService.deletestate(ids);
        return deletestate;
    }
    /**
     * 下架酒店（修改状态）
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("hotelitems/uprows")
    public int upstate(@RequestParam("ids[]") List<Long> ids){
        int upstate = hotelService.upstate(ids);
        return upstate;
    }
    /**
     * 上架酒店（修改状态）
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("hotelitems/downrows")
    public int downstate(@RequestParam("ids[]") List<Long> ids){
        int downstate = hotelService.downstate(ids);
        return downstate;
    }

    @ResponseBody
    @RequestMapping("hotelitem")
    public int savehotel(TbHotel tbHotel){
        int i = hotelService.savehotel(tbHotel);
        return i;
    }
}
