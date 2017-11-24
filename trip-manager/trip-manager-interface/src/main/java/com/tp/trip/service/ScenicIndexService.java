package com.tp.trip.service;

import com.tp.trip.pojo.po.TbScenicWithBLOBs;

import java.util.List;

public interface ScenicIndexService {
    List<TbScenicWithBLOBs> listInners();

    List<TbScenicWithBLOBs> listOutters();

    List<TbScenicWithBLOBs> listArounds();
}
