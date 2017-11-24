package com.tp.trip.service;

import com.tp.trip.common.dto.PageBean;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;

public interface TourService {

    PageBean<TbScenicWithBLOBs> listScenic(TbScenicWithBLOBs scenic, Integer currentPage, Integer pageSize) throws Exception;
}
