package com.tp.trip.web;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.pojo.vo.TbScenicCustom;
import com.tp.trip.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 19:38
 * Version:V1.0
 */
@Controller
public class ScenicAction {
    @Autowired
    private ScenicService scenicService;

    @ResponseBody
    @RequestMapping("/scenics")
    public Result<TbScenicCustom> scenicListByPage(Page page, Order order, TbScenicWithBLOBs tbScenic, HttpSession session){
        /*此处session 获取登录用户  判断是否是管理员*/
       /* TbUser user = (TbUser) session.getAttribute("user");
        Integer usertype = user.getUsertype();
        /*这里测试 以超级管理员*/
        Result<TbScenicCustom> result = scenicService.listItems(page,order,tbScenic,1);
        return result;
    }

    @ResponseBody
    @RequestMapping("scenic/{batch}")
    public int updateBatch(@RequestParam("ids[]") List<Byte> ids, @PathVariable("batch") String batch) {
        System.out.println(ids+"   "+batch);
        int i= scenicService.updateBatch(ids,batch);
        return i;
    }
}
