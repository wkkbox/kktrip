package com.tp.trip.service.impl;

import com.tp.trip.dao.TbUserMapper;
import com.tp.trip.pojo.po.TbUser;
import com.tp.trip.pojo.po.TbUserExample;
import com.tp.trip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserMapper userMapper;


    @Override
    public TbUser getUserById(Long id) throws Exception{

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TbUser> listAllUser() {

        List<TbUser> tbUsers = userMapper.selectByExample(null);

        return tbUsers;
    }
}
