package com.tp.trip.service.impl;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.common.util.IDUtils;
import com.tp.trip.common.util.JsonUtils;
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

    /**
     * 增加酒店
     * @param tbHotel
     * @return
     */
    @Override
    public int savehotel(TbHotel tbHotel) {
        Byte i=(byte)2;
        tbHotel.setState(i);
        String hotelImage = tbHotel.getHotelImage();
        if (hotelImage!=null){
            String image=hotelImage.substring(hotelImage.indexOf("http://"), hotelImage.indexOf(".jpg")+4);
            tbHotel.setHotelImage(image);
        }
        long itemId = IDUtils.getItemId();
        tbHotel.setId(itemId);
        int insert = tbHotelDao.insert(tbHotel);
        return insert;
    }
    /**
     * 查询出单个酒店
     */
    @Override
    public TbHotel selecthotel(Long hotelid) {
        long id=hotelid;
        TbHotel tbHotel = tbHotelDao.selectByPrimaryKey(id);
        return tbHotel;
    }

    @Override
    public int hotelUpdate(TbHotel tbHotel) {
        /*TbHotelExample example=new TbHotelExample();
        TbHotelExample.Criteria criteria = example.createCriteria();*/

        System.out.println(tbHotel.getId());
        String hotelImage = tbHotel.getHotelImage();
        if (hotelImage!=null){
            String image=hotelImage.substring(hotelImage.indexOf("http://"), hotelImage.indexOf(".jpg")+4);
            tbHotel.setHotelImage(image);
        }
        int i = tbHotelDao.updateByPrimaryKey(tbHotel);
        return i;
    }
}
