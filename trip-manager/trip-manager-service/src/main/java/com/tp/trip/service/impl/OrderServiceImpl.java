package com.tp.trip.service.impl;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.dao.TbOrderCustomMapper;
import com.tp.trip.dao.TbOrderMapper;
import com.tp.trip.pojo.po.TbOrder;
import com.tp.trip.pojo.po.TbOrderExample;
import com.tp.trip.pojo.vo.TbOrderCustom;
import com.tp.trip.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/25
 * Time: 14:10
 * Version:V1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbOrderCustomMapper tbOrderCustomMapper;
    @Autowired
    private TbOrderMapper tbOrderMapper;
    @Override
    public Result<TbOrderCustom> listOrdersByPage(Page page, Order order, TbOrderCustom tbOrderCustom) {
        Result<TbOrderCustom> result=null;
        try {
            result=new Result<>();
            Map<String,Object> map=new HashMap<>();
            map.put("page",page);
            map.put("order",order);
            map.put("tbOrderCustom",tbOrderCustom);
            int i=tbOrderCustomMapper.countOrder(tbOrderCustom);
            List<TbOrderCustom> list=tbOrderCustomMapper.listOrdersByPage(map);
            result.setRows(list);
            result.setTotal(i);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int removeOrdersByIds(List<Long> ids) {
        int i=0;
        try {
            TbOrder tbOrder = new TbOrder();
            tbOrder.setState((byte)2);
            TbOrderExample example = new TbOrderExample();
            TbOrderExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            i=tbOrderMapper.updateByExampleSelective(tbOrder,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public TbOrderCustom getOrder(Long id) {
        return tbOrderCustomMapper.getOrder(id);
    }

    @Override
    public int updateOrders(TbOrderCustom tbOrderCustom, Long id) {
        int i=0;
        try {
            if(tbOrderCustom.getState()==1) {
                tbOrderCustom.setState((byte)2);
            }else if (tbOrderCustom.getState()==2){
                tbOrderCustom.setState((byte)1);
            }
            i=tbOrderCustomMapper.updateOrders(tbOrderCustom);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
