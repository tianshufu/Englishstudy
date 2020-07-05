package com.tianshu.managewebfile;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.util.Auth;

import com.qiniu.storage.Configuration;

public class Deletefile {
    public static void main(String[] args) {
          Deletefile deletefile=new Deletefile();
          boolean flag=deletefile.deletefile("2020-06-0809:00-09:252TONY4.mp4");
          System.out.println(flag);


        }

        public boolean deletefile (String filekey)
        {
            boolean flag;
            String ACCESS_KEY = "3vO6YAVA-B07QH6brIM5CMlj72B_aGdh4so99BK-";
            String SECRET_KEY = "5xJm0M8OTUWXpYCdr94QlzA2yHpRiHq-7_FiN_KR";
            Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);

            Zone z = Zone.zone0();
            Configuration c = new Configuration(z);

            //实例化一个BucketManager对象
            BucketManager bucketManager = new BucketManager(auth, c);
            //要测试的空间和key，并且这个key在你空间中存在
            String bucket = "lorenworld";
            String key = filekey;
            try {
                //调用delete方法移动文件
                bucketManager.delete(bucket, key);
                flag=true;
            } catch (QiniuException e) {
                //捕获异常信息
                Response r = e.response;
                System.out.println(r.toString());
                flag=false;

            }

            return flag;

        }




    }
