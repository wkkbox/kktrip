package com.tp.trip.service.impl;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.common.util.IDUtils;
import com.tp.trip.dao.TbScenicCustomMapper;
import com.tp.trip.dao.TbScenicMapper;
import com.tp.trip.pojo.po.TbScenicExample;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.pojo.vo.TbScenicCustom;
import com.tp.trip.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 20:27
 * Version:V1.0
 */
@Service
public class ScenicServiceImpl implements ScenicService{

    @Autowired
    private TbScenicCustomMapper scenicCustomMapper;

    @Autowired
    private TbScenicMapper tbScenicMapper;

   /*查找景点  分页  以及搜索*/
    @Override
    public Result<TbScenicCustom> listItems(Page page, Order order, TbScenicWithBLOBs tbScenic,int isSuperUser){
        int i = scenicCustomMapper.countItems(tbScenic,isSuperUser);

        List<TbScenicCustom> tbScenics = scenicCustomMapper.listItemsByPage(page, order, tbScenic,isSuperUser);


        Result<TbScenicCustom> result=new Result<>();
        result.setTotal(i);

        result.setRows(tbScenics);

        return result;
    }

    @Override
    public int saveItem(TbScenicWithBLOBs tbScenicWithBLOBs) {
        long itemId = IDUtils.getItemId();
        tbScenicWithBLOBs.setId(itemId);
        String scenicIntro = tbScenicWithBLOBs.getScenicIntro();
        if (scenicIntro!=null){
            String image = scenicIntro.substring(scenicIntro.indexOf("http://"), scenicIntro.indexOf(".jpg") + 5);
            tbScenicWithBLOBs.setScenicImage(image);
        }
        tbScenicWithBLOBs.setCreatedTime(new Date());
        tbScenicWithBLOBs.setUpdateTime(new Date());
        int i = tbScenicMapper.insertSelective(tbScenicWithBLOBs);
        return i;
    }

    /*控制景点的上架和下架以及删除*/
    @Override
    public int updateBatch(List ids, String batch) {
        TbScenicExample example=new TbScenicExample();
        TbScenicExample.Criteria criteria = example.createCriteria();
        criteria.andStateIn(ids);
        TbScenicWithBLOBs record =new TbScenicWithBLOBs();
        if ("batchRemove".equals(batch)){
            record.setState((byte)3);
        } else if ("batchUp".equals(batch)){
            record.setState((byte)1);
        }else if("batchDown".equals(batch)){
            record.setState((byte)2);
        }
        int i = tbScenicMapper.updateByExampleSelective(record, example);

        return i;
    }
}
