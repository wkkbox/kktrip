package com.tp.trip.service;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.po.TbUser;

/**
 * User: Administrator
 * Date: 2017/11/23
 * Time: 19:24
 * Version:V1.0
 */
public interface VistitorinfoService {
    Result<TbUser> listVistitorinfoByPage(Page page, Order order, TbUser tbUser);

    TbUser getUser(Long id);

    int updateUsers(TbUser tbUser,Long id);
}
