package com.tp.trip.service.impl;

import com.tp.trip.dao.TbScenicCustomMapper;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.service.ScenicIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicIndexServiceImpl implements ScenicIndexService {

    @Autowired
    private TbScenicCustomMapper scenicCustomMapper;

    @Override
    public List<TbScenicWithBLOBs> listInners() {

        return scenicCustomMapper.listInners();
    }

    @Override
    public List<TbScenicWithBLOBs> listOutters() {
        return scenicCustomMapper.listOutters();
    }

    @Override
    public List<TbScenicWithBLOBs> listArounds() {
        return scenicCustomMapper.listArounds();
    }
}
