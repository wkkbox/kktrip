package com.tp.trip.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 18:58
 * Version:V1.0
 */
public interface UpLoadService {
    Map<String,Object> upload(MultipartFile multipartFile);
}
