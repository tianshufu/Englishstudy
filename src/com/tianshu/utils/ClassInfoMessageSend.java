package com.tianshu.utils;


import com.tianshu.MessageSend.HttpClientUtil;

// this is the function for the web to send the course info to the students to inform them taking the class
public class ClassInfoMessageSend {
    // this is the function for the web to send the course info to the students to inform them taking the class
    public void StudentClassInfoSend (String  phonenum, String teachername,String studentname, String book, String date, String timeslot, String zoomid, String zoompassword)
    {
        String Uid = "tianqing123";

        //接口安全秘钥
        String Key = "d41d8cd98f00b204e980";

        //手机号码，多个号码如13800000000,13800000001,13800000002
        String smsMob = phonenum;

        String smsText="尊敬的"+studentname+"你好,"+"您已经成功预订"+teachername+" 的课程，上可时间为 "+ date+ timeslot+" 。 上课用到的教材为:"+ book+"。" + "上课的平台是 zoom, zoom id:"+zoomid+" zoom password:"+zoompassword;
        String smsTextsub="尊敬的"+studentname+"您好,您已经成功预订"+teachername+"的课程，上可时间为"+date+timeslot+"  。 上课用到的教材为: "+book+"。上课的平台是"+"zoom"+", 会议号是:"+zoomid+",会议密码是:"+zoompassword;
        HttpClientUtil client = HttpClientUtil.getInstance();

        //UTF发送
        int result = client.sendMsgUtf8(Uid, Key, smsTextsub, smsMob);
        if(result>0){
            System.out.println("UTF8成功发送条数=="+result);
        }else{
            System.out.println(client.getErrorMsg(result));
        }
    }

    public static void main(String[] args) {
        ClassInfoMessageSend classInfoMessageSend= new ClassInfoMessageSend();
        classInfoMessageSend.StudentClassInfoSend("13871228827","Cindy","Tony","TOEFL English Speaking","2020-06-08","08:30-08:55","332-324-3423","213124");
    }


}

