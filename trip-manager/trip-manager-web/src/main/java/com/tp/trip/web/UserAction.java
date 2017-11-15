package com.tp.trip.web;

import com.tp.trip.pojo.po.TbUser;
import com.tp.trip.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = {"/user/{userId}"})
    public TbUser getUserById(@PathVariable("userId") Long id) {
        TbUser findUser = null;
        try {
            findUser = userService.getUserById(id);
            System.out.println(findUser);
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return findUser;
    }
}
