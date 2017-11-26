package com.tp.trip.portal.web2;

import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.service.ScenicIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PortalIndexAction {

    @Autowired
    private ScenicIndexService scenicIndexService;


    @RequestMapping("/")
    public String portalIndex(Model model) {
        List<TbScenicWithBLOBs> scenics = scenicIndexService.listInners();
        model.addAttribute("inners", scenics);
        scenics = scenicIndexService.listOutters();
        model.addAttribute("outters", scenics);
        scenics = scenicIndexService.listArounds();
        model.addAttribute("arounds", scenics);
        return "index";
    }

    @RequestMapping("/tour/{page}")
    public String TourIndex(@PathVariable("page") String page) {
        System.out.println(page);
        return page;
    }
}
