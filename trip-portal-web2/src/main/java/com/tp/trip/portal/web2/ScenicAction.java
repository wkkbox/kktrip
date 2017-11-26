package com.tp.trip.portal.web2;

import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScenicAction {

    @Autowired
    private ScenicService scenicService;

    @RequestMapping("/scenic/{scenicId}")
    public String detail(@PathVariable("scenicId") Long scenicId, Model model){
        System.out.println(scenicId);
        TbScenicWithBLOBs scenic = scenicService.getScenicWithBlobskById(scenicId);
        model.addAttribute("scenic",scenic);
        return "scenic_details";
    }

}
