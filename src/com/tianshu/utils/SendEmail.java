package com.tianshu.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail
{

    public void teacherinfosendemail(String teacheremail,String teachername,String studentname,String date, String time, String book, String speakpace, String courseplatform, String leavewords)
    {

        String text="Dear teacher "+teachername+", you have a new class booking at "+date+" "+time+" from student "+studentname+". The book for the course is :"+book+" .The speaking pace preferred by the student is:"+speakpace+"."+"The course platform is: "+courseplatform+". The left words from student is: "+leavewords+".Please log in to your account to check more info";
        sendemail(teacheremail,"Booking Information",text);
        System.out.println(text);

    }

    public  void teachercancelemail(String teacheremail, String teachername,String studentname, String date, String time)
    {
        String text= "Dear teacher"+teachername+" I'm sorry to inform that your class for "+date+" "+time+" was cancelled by  student"+studentname;
        sendemail(teacheremail,"Course Canceled",text);
    }

    public void  sendemail(String receivermail,String subject,String text)
    {
        String to = receivermail;

        // 发件人电子邮箱
        String from = "1439631673@qq.com";

        // 指定发送邮件的主机为 smtp.qq.com
        String host = "smtp.qq.com";  //QQ 邮件服务器

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");

        //阿里云服务器禁用25端口，所以服务器上改为465端口
        properties.put("mail.smtp.socketFactory.port", "465");
	    properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	    properties.setProperty("mail.smtp.socketFactory.fallback", "false");
	    properties.setProperty("mail.smtp.socketFactory.port", "465");


        Session session = Session.getDefaultInstance(properties,new Authenticator(){
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("1439631673@qq.com", "znzywqpwzbziifbe"); //发件人邮件用户名、密码
            }
        });

        try{
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject(subject);

            // 设置消息体
            message.setText(text);

            // 发送消息
            Transport.send(message);
            System.out.println("Sent message successfully....from runoob.com");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }




    public static void main(String [] args) {
        SendEmail sendEmail=new SendEmail();
        sendEmail.sendemail("1439631673@qq.com","Class Inform procedure Test","Dear,  Gwen . This is the Loren administrator team, we are sending this email to check if you can receive the notifications when a student had a booking.Please response anything if you have reveived this email");
        //sendEmail.teacherinfosendemail(5,"Cindy","Tony","2020-06-10","08:00-08:25","toefl","fast","Wechat","hi");

    }


}