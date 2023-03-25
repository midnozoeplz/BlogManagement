package com.jianz.JavaEEManagement.controller;

import com.jianz.JavaEEManagement.annotation.SystemLog;
import com.jianz.JavaEEManagement.domain.ResponseResult;
import com.jianz.JavaEEManagement.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/2/3 23:45
 */

@RestController
public class UploadController {
    @Autowired
    private UploadService uploadService;

    @PostMapping("/upload")
    @SystemLog(businessName = "上传头像")
    public ResponseResult uploadImg(MultipartFile img){
        return uploadService.uploadImg(img);
    }
}