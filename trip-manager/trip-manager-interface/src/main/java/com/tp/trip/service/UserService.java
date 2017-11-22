package com.tp.trip.service;

import com.tp.trip.pojo.po.TbUser;

import java.util.List;

public interface UserService {
    TbUser getUserById(Long id) throws Exception;

    List<TbUser> listAllUser();
}
