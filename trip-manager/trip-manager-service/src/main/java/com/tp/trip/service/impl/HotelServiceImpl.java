package com.tp.trip.service.impl;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.dao.TbHotelCustomMapper;
import com.tp.trip.dao.TbHotelMapper;
import com.tp.trip.pojo.po.TbHotel;
import com.tp.trip.pojo.po.TbHotelExample;
import com.tp.trip.pojo.vo.TbHotelCustom;
import com.tp.trip.pojo.vo.TbQuery;
import com.tp.trip.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 13:59
 * Version:V1.0
 */
@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private TbHotelMapper tbHotelDao;
    @Autowired
    private TbHotelCustomMapper tbHotelCustomDao;
    @Override
    public Result<TbHotelCustom> listByPage(Page page, Order order, TbQuery query) {
        
        Result<TbHotelCustom> result = new Result<TbHotelCustom>();
        int total= tbHotelCustomDao.countItems();
        result.setTotal(total);
        List<TbHotelCustom> tbItems = tbHotelCustomDao.listItemByPage(page,order,query);

        result.setRows(tbItems);
        return result;

    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @Override
    public int deletestate(List<Long> ids) {
        TbHotel record = new TbHotel();
        record.setState((byte)3);
        TbHotelExample example = new TbHotelExample();
        TbHotelExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return tbHotelDao.updateByExampleSelective(record,example);

    }
    /**
     * 上架
     * @param ids
     * @return
     */
    @Override
    public int upstate(List<Long> ids) {
        TbHotel record = new TbHotel();
        record.setState((byte)1);
        TbHotelExample example = new TbHotelExample();
        TbHotelExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return tbHotelDao.updateByExampleSelective(record,example);

    }
    /**
     * 下架
     * @param ids
     * @return
     */
    @Override
    public int downstate(List<Long> ids) {
        TbHotel record = new TbHotel();
        record.setState((byte)2);
        TbHotelExample example = new TbHotelExample();
        TbHotelExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return tbHotelDao.updateByExampleSelective(record,example);

    }

    @Override
    public int savehotel(TbHotel tbHotel) {
        Byte i=(byte)2;
        tbHotel.setState(i);
        int insert = tbHotelDao.insert(tbHotel);
        return insert;
    }
}
