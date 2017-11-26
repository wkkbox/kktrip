package com.tp.trip.portal.web2;

import com.tp.trip.common.dto.PageBean;
import com.tp.trip.pojo.po.TbScenicWithBLOBs;
import com.tp.trip.service.TourService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TourAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TourService tourService;

    @ResponseBody
    @RequestMapping(value = {"/tour/inner","/tour/around","/tour/outter"})
    public PageBean<TbScenicWithBLOBs> ScenicTour(TbScenicWithBLOBs scenic, Integer currentPage, Integer pageSize) {
        PageBean<TbScenicWithBLOBs> pb = null;
        try {
            pb = tourService.listScenic(scenic, currentPage, pageSize);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return pb;
    }
}
