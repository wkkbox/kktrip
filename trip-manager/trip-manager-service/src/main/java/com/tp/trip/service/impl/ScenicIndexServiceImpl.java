package com.tp.trip.service.impl;

import com.tp.trip.common.redis.JedisClient;
import com.tp.trip.common.util.JsonUtils;
import com.tp.trip.dao.TbScenicCustomMapper;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.service.ScenicIndexService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicIndexServiceImpl implements ScenicIndexService {

    @Autowired
    private TbScenicCustomMapper scenicCustomMapper;

    @Autowired
    private JedisClient jedisClient;

    @Override
    public List<TbScenicWithBLOBs> listInners() {
        //从缓存中取
        try {
            System.out.println("从缓存中取");
            String json = jedisClient.get("INNERS");
            if (json != null && !("".equals(json))){//StringUtils.isNotBlank(json)
                List<TbScenicWithBLOBs> list = JsonUtils.jsonToList(json, TbScenicWithBLOBs.class);
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //缓存中没有
        List<TbScenicWithBLOBs> list = scenicCustomMapper.listInners();
        try {
            //存入缓存
            System.out.println("存入缓存");
            jedisClient.set("INNERS", JsonUtils.objectToJson(list));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public List<TbScenicWithBLOBs> listOutters() {
        //从缓存中取
        try {
            System.out.println("从缓存中取");
            String jsonDate = jedisClient.get("OUTTERS");
            if(StringUtils.isNotBlank(jsonDate)){
                return JsonUtils.jsonToList(jsonDate,TbScenicWithBLOBs.class);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        List<TbScenicWithBLOBs> list = scenicCustomMapper.listOutters();
        //存入缓存
        try {
            System.out.println("存入缓存");
            jedisClient.set("OUTTERS",JsonUtils.objectToJson(list));
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<TbScenicWithBLOBs> listArounds() {

        //从缓存中取
        try {
            System.out.println("从缓存中取");
            String jsonDate = jedisClient.get("AROUNDS");
            if(StringUtils.isNotBlank(jsonDate)){
                return JsonUtils.jsonToList(jsonDate,TbScenicWithBLOBs.class);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        List<TbScenicWithBLOBs> list = scenicCustomMapper.listArounds();
        //存入缓存
        try {
            System.out.println("存入缓存");
            jedisClient.set("AROUNDS",JsonUtils.objectToJson(list));
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;

    }
}
