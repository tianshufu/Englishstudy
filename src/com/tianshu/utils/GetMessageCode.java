package com.tianshu.utils;

import com.tianshu.MessageSend.HttpClientUtil;

//ths class to generate random num to send to the phone
public class GetMessageCode {
    public static String smsCode(){
        String random=(int)((Math.random()*9+1)*100000)+"";
        System.out.print("random验证码:"+random);
        return random;
    }

    public String SendPhoneVerificationCode (String  phonenum)
    {
        String Uid = "tianqing123";

        //接口安全秘钥
        String Key = "d41d8cd98f00b204e980";

        //手机号码，多个号码如13800000000,13800000001,13800000002
        String smsMob = phonenum;
        String verifynum=smsCode();
        String smsText=verifynum+"短信登录验证码，5分钟内有效，请勿泄露。";
        HttpClientUtil client = HttpClientUtil.getInstance();

        //UTF发送
        int result = client.sendMsgUtf8(Uid, Key, smsText, smsMob);
        if(result>0){
            System.out.println("UTF8成功发送条数=="+result);
            return  verifynum;
        }else{
            System.out.println(client.getErrorMsg(result));
        }
        return "failed";
    }

    public static void main(String[] args) {
        GetMessageCode getMessageCode=new GetMessageCode();
        getMessageCode.SendPhoneVerificationCode("13871228827");
    }


}
