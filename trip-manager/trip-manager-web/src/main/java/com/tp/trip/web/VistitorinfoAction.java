package com.tp.trip.web;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.pojo.po.TbUser;
import com.tp.trip.service.VistitorinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * User: Administrator
 * Date: 2017/11/23
 * Time: 19:16
 * Version:V1.0
 */
@Controller
public class VistitorinfoAction {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private VistitorinfoService vistitorinfoService;
    @ResponseBody
    @RequestMapping("/itemVistitorinfos")
    public Result<TbUser> listVistitorinfoByPage(Page page, Order order,TbUser tbUser){
        Result<TbUser> result=null;
        try {
            result=vistitorinfoService.listVistitorinfoByPage(page,order,tbUser);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
    @ResponseBody
    @RequestMapping("/getUserById/{id}")
    public void getUserById(@PathVariable("id") Long id, HttpSession session){
        session.removeAttribute("user");
        TbUser tbUser= vistitorinfoService.getUser(id);
        session.setAttribute("user",tbUser);
    }
    //修改数据
    @ResponseBody
    @RequestMapping("/userUpdate")
    public int updateUsers(TbUser tbUser,Long id){

        int i=0;
        try {
            i= vistitorinfoService.updateUsers(tbUser,id);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
