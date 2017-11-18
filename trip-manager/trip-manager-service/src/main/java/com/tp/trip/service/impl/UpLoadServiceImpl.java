package com.tp.trip.service.impl;

import com.tp.trip.common.util.FtpUtil;
import com.tp.trip.common.util.IDUtils;
import com.tp.trip.service.UpLoadService;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 19:00
 * Version:V1.0
 */
@Service
public class UpLoadServiceImpl implements UpLoadService {
    @Override
    public Map<String,Object> upload(MultipartFile multipartFile){

        Properties properties=new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("ftp.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String address= properties.getProperty("ftp.address");
        String username= properties.getProperty("ftp.username");
        String password= properties.getProperty("ftp.password");
        String basePath= properties.getProperty("ftp.basePath");
        int port = Integer.parseInt(properties.getProperty("ftp.port"));
        String filePath = new DateTime().toString("/yyyy/MM/dd");
        String rename = multipartFile.getOriginalFilename();
        String fileType = rename.substring(rename.indexOf("."));
        String filename = IDUtils.genImageName() + fileType;

        Map<String,Object> map=new HashMap<>();
        try {
            boolean b = FtpUtil.uploadFile(address, port, username, password, basePath, filePath, filename, multipartFile.getInputStream());

            if (b){
                map.put("state", "SUCCESS");
                map.put("title", filename);
                map.put("original", rename);
                map.put("type", fileType);
                map.put("url",filePath + "/" + filename);
                map.put("size", multipartFile.getSize());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return map;
    }
}
