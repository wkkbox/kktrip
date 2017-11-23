package com.tp.trip.service.impl;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.dao.TbUserCustomMapper;
import com.tp.trip.dao.TbUserMapper;
import com.tp.trip.pojo.po.TbUser;
import com.tp.trip.service.VistitorinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/23
 * Time: 19:24
 * Version:V1.0
 */
@Service
public class VistitorinfoServiceImpl implements VistitorinfoService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbUserCustomMapper tbUserCustomMapper;
    @Autowired
    private TbUserMapper tbUserMapper;
    @Override
    public Result<TbUser> listVistitorinfoByPage(Page page, Order order, TbUser tbUser) {
        Result<TbUser> result=null;
        try {
            result=new Result<>();
            Map<String,Object> map =new HashMap<>();
            map.put("page",page);
            map.put("order",order);
            map.put("tbUser",tbUser);
            int i=tbUserCustomMapper.countVistitorinfo(tbUser);
            List<TbUser> list=tbUserCustomMapper.listVistitorinfoByPage(map);
            result.setTotal(i);
            result.setRows(list);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public TbUser getUser(Long id) {
        return tbUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateUsers(TbUser tbUser,Long id) {
        int i=0;
        try {
            i= tbUserMapper.updateByPrimaryKeySelective(tbUser);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
