package com.tp.trip.dao;

import com.tp.trip.pojo.po.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/23
 * Time: 19:34
 * Version:V1.0
 */
public interface TbUserCustomMapper {
    int countVistitorinfo(@Param("tbUser") TbUser tbUser);

    List<TbUser> listVistitorinfoByPage(Map<String, Object> map);
}
