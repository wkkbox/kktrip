package com.tp.trip.service.impl;

import com.tp.trip.common.dto.PageBean;
import com.tp.trip.dao.TbScenicCustomMapper;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TbScenicCustomMapper scenicCustomMapper;

    @Override
    public PageBean<TbScenicWithBLOBs> listScenic(TbScenicWithBLOBs scenic, Integer currentPage, Integer pageSize) throws Exception {
        Map<String, Object> map = new HashMap<>();
        Integer count = scenicCustomMapper.countScenic(scenic);
        PageBean<TbScenicWithBLOBs> pBean = new PageBean<>();
        pBean.setCurrentPage(currentPage);
        pBean.setPageSize(pageSize);
        map.put("currentPage", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        map.put("scenic", scenic);
        pBean.setpList(scenicCustomMapper.listScenic(map));
        pBean.setTotalCount(count);
        pBean.setTotalPage(count % pageSize == 0 ? (count / pageSize) : (count / pageSize + 1));
        return pBean;
    }
}
