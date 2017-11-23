package com.tp.trip.service;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.po.TbHotel;
import com.tp.trip.pojo.vo.TbHotelCustom;
import com.tp.trip.pojo.vo.TbQuery;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 13:52
 * Version:V1.0
 */
public interface HotelService {
    Result<TbHotelCustom> listByPage(Page page, Order order, TbQuery query);

    int deletestate(List<Long> ids);
    int upstate(List<Long> ids);
    int downstate(List<Long> ids);

    int savehotel(TbHotel tbHotel);
    TbHotel selecthotel(Long hotelid);

    int hotelUpdate(TbHotel tbHotel);
}
