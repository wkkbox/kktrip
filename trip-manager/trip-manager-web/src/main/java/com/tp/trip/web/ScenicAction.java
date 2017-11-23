package com.tp.trip.web;

import com.tp.trip.common.dto.Order;
import com.tp.trip.common.dto.Page;
import com.tp.trip.common.dto.Result;
import com.tp.trip.common.dto.TreeNode;
import com.tp.trip.pojo.po.TbScenic;
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
    @RequestMapping(value = "getScenicById/{id}")
    public void getScenicById(@PathVariable("id") Long id, HttpSession session){
        session.removeAttribute("scenic");
        TbScenic tbScenic= scenicService.getScenic(id);
        session.setAttribute("scenic",tbScenic);
    }



    @ResponseBody
    @RequestMapping("/scenics")
    public Result<TbScenicCustom> scenicListByPage(Page page, Order order, TbScenicWithBLOBs tbScenic){
        /*此处session 获取登录用户  判断是否是管理员*/
       /* TbUser user = (TbUser) session.getAttribute("user");
        Integer usertype = user.getUsertype();
        /*这里测试 以超级管理员*/

        /*System.out.println(tbScenic.getScenicName() instanceof  String);*/
        Result<TbScenicCustom> result = scenicService.listItems(page,order,tbScenic);

        return result;
    }

    @ResponseBody
    @RequestMapping("/scenicStatus/{batch}")
    public int updateBatch(@RequestParam("ids[]") List<Long> ids, @PathVariable("batch") String batch) {
        int i= scenicService.updateBatch(ids,batch);
        return i;
    }
    @RequestMapping("scenicUpdate")
    public int updateSecnic(TbScenicWithBLOBs tbScenicWithBLOBs){
        return scenicService.updateItem(tbScenicWithBLOBs);
    }

    @ResponseBody
    @RequestMapping("/scenicAdd")
    public int saveItem(TbScenicWithBLOBs tbScenicWithBLOBs){
        return scenicService.saveItem(tbScenicWithBLOBs);
    }

    //美食下拉框显示景点名字
    @ResponseBody
    @RequestMapping("/scenicsName")
    public List<TreeNode> scenicList(){
        List<TreeNode> list = scenicService.listScenics();
        return list;
    }
}
