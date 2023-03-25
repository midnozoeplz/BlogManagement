package com.jianz.JavaEEManagement.service;

import com.jianz.JavaEEManagement.domain.ResponseResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Jianz
 * @version 1.0
 * @Description
 * @Email jianz8153.gmail.com
 * @Date 2023/2/3 23:47
 */

public interface UploadService {
    ResponseResult uploadImg(MultipartFile img);
}

