package com.tp.trip.service;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.pojo.vo.TbScenicCustom;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 20:25
 * Version:V1.0
 */
public interface ScenicService {
    Result<TbScenicCustom> listItems(Page page, Order order, TbScenicWithBLOBs tbScenic,int isSuperUser);

    int updateBatch(List<Byte> ids, String batch);
}
