package com.tianshu.uploadfile;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;

import java.io.IOException;


public class UploadDemo {
    //设置好账号的ACCESS_KEY和SECRET_KEY
    String ACCESS_KEY = "3vO6YAVA-B07QH6brIM5CMlj72B_aGdh4so99BK-";
    String SECRET_KEY = "5xJm0M8OTUWXpYCdr94QlzA2yHpRiHq-7_FiN_KR";
    //要上传的空间
    String bucketname = "lorenworld";
    //上传到七牛后保存的文件名
    String key = "my-java.png";
    //上传文件的路径
    String FilePath = "/Users/futianshu/Downloads/Cindy.png";

    //密钥配置
    Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);

    ///////////////////////指定上传的Zone的信息//////////////////
    //第一种方式: 指定具体的要上传的zone
    //注：该具体指定的方式和以下自动识别的方式选择其一即可
    //要上传的空间(bucket)的存储区域为华东时
    // Zone z = Zone.zone0();
    //要上传的空间(bucket)的存储区域为华北时
    // Zone z = Zone.zone1();
    //要上传的空间(bucket)的存储区域为华南时
     Zone z = Zone.zone2();

    //第二种方式: 自动识别要上传的空间(bucket)的存储区域是华东、华北、华南。
    //Zone z = Zone.autoZone();
    Configuration c = new Configuration(z);

    //创建上传对象
    UploadManager uploadManager = new UploadManager(c);

    public static void main(String args[]) throws IOException {
        //new UploadDemo().uploadfile("Loren.png","/Users/futianshu/Desktop/Loren.png");
        new UploadDemo().token();
    }


    //简单上传，使用默认策略，只需要设置上传的空间名就可以了
    public String getUpToken() {
        return auth.uploadToken(bucketname);
    }

    public void upload() throws IOException {
        try {
            //调用put方法上传
            Response res = uploadManager.put(FilePath, key, getUpToken());
            //打印返回的信息
            System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                //响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
        }
    }

    public void uploadfile(String filename, String filePath) throws IOException {

        try {
            //调用put方法上传
            Response res = uploadManager.put(filePath, filename, getUpToken());
            //打印返回的信息
            System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                //响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
        }

    }



    public String token()
    {

        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        StringMap putPolicy = new StringMap();
        putPolicy.put("returnUrl", "http://www.loren.world/Englishstudy/adminuploadfile");
        putPolicy.put("returnBody","{\"key\": $(key), \"hash\": $(etag), \"w\": $(imageInfo.width), \"h\": $(imageInfo.height)}");
        long expireSeconds = 3600;
        String upToken = auth.uploadToken(bucketname, null, expireSeconds, putPolicy);
        System.out.println(upToken);
        return  upToken;

    }

    public String pdf_token_upload()
    {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        StringMap putPolicy = new StringMap();
        putPolicy.put("returnUrl", "http://www.loren.world/Englishstudy/adminstorebook");
        long expireSeconds = 3600;
        String upToken = auth.uploadToken(bucketname, null, expireSeconds, putPolicy);
        System.out.println(upToken);
        return  upToken;


    }

    public String cover_coken(String keystr)
    {
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        StringMap putPolicy = new StringMap();
        String key = "file key";
        putPolicy.put("returnUrl", "http://localhost:8080/Englishstudy_war_exploded/adminuploadfile");
        putPolicy.put("scope","<bucket>:<key>");
        putPolicy.put("returnBody","{\"key\": $(key), \"hash\": $(etag), \"w\": $(imageInfo.width), \"h\": $(imageInfo.height)}");
        long expireSeconds = 3600;
        String upToken = auth.uploadToken(bucketname, key, expireSeconds, putPolicy);
        System.out.println(upToken);
        return  upToken;

    }



}
