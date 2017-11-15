package com.tp.trip.service;

import com.tp.trip.pojo.po.TbUser;

public interface UserService {
    TbUser getUserById(Long id) throws Exception;
}
