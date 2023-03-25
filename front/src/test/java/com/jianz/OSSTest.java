package com.jianz;

import com.aliyun.oss.OSS;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author Jianz
 * @version 1.0
 * @Description  用不了，寄
 * @Email jianz8153.gmail.com
 * @Date 2023/2/3 22:46
 */

@SpringBootTest
public class OSSTest {


    @Test
    public void testOss() {
//        //构造一个带指定 Region 对象的配置类
//        Configuration cfg = new Configuration(Region.autoRegion());
//        //...其他参数参考类注释
//
//        UploadManager uploadManager = new UploadManager(cfg);
//        //...生成上传凭证，然后准备上传
////        String accessKey = "notFe8PYzFmfi8wTcP_pjv9KxwB3CGdX1LOrj7Vv";
////        String secretKey = "VafkdwQl_Gn5k1JhLhSBP0x2gc_e5Q1XU5uec2hn";
////        String bucket = "zj-myblog";
//
//        //默认不指定key的情况下，以文件内容的hash值作为文件名
//        String key = "2023/sg.png";
//
//        try {
////            byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
////            ByteArrayInputStream byteInputStream=new ByteArrayInputStream(uploadBytes);
//
//
//            InputStream inputStream = new FileInputStream("C:\\Users\\张健\\Desktop\\Java学习资料\\proxyInvocation.png");
//            OSS oss = new OSS();
//            Auth auth = Auth.create(oss.getAccessKey(), oss.getSecretKey());
//            String upToken = auth.uploadToken(oss.getBucket());
//
//            try {
//                Response response = uploadManager.put(inputStream,key,upToken,null, null);
//                //解析上传成功的结果
//                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
//                System.out.println(putRet.key);
//                System.out.println(putRet.hash);
//            } catch (QiniuException ex) {
//                Response r = ex.response;
//                System.err.println(r.toString());
//                try {
//                    System.err.println(r.bodyString());
//                } catch (QiniuException ex2) {
//                    //ignore
//                }
//            }
//        } catch (Exception ex) {
//            //ignore
//        }
//
//    }
    }
}