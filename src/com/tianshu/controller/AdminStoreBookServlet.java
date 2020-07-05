package com.tianshu.controller;

import com.tianshu.uploadfile.Base64code;
import com.tianshu.utils.BooksInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//this servlet is use to get the info from the Qiniu web and store the book info to the database
@WebServlet("/adminstorebook")
public class AdminStoreBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String base64message=req.getParameter("upload_ret");
        Base64code base64code=new Base64code();
        try{
            // get the key from the url
            String decodedmessage=base64code.base64Decode(base64message);
            String value=base64code.getkey(decodedmessage);
            System.out.println("Received book key:"+ value);
            String url=value.replace(" ","%20");
            String book_url="http://tianshufu.site/"+url;
            BooksInfo booksInfo=new BooksInfo();
            booksInfo.InsertBookinfo(value,book_url);
            req.getRequestDispatcher("adminsearchbooks").forward(req,resp);
            //get the value from session





            // remove the value from session
            // req.getSession().removeAttribute("studentid");
            //req.getSession().removeAttribute("date");
            //req.getSession().removeAttribute("timeslot");



            // store the video url to the database
            /*
            TeacherVideo teacherVideo=new TeacherVideo();
            teacherVideo.InsertCourseVideo(teacherid,date,timeslot,studentid,video_url);

            //req.getRequestDispatcher("http://tianshufu.site/"+value).forward(req,resp);
            req.setAttribute("key",value);
            req.getRequestDispatcher("TeacherClassVideoCheck.jsp").forward(req,resp);
            */

        }
        catch (NullPointerException e)
        {
            req.setAttribute("failed",false);
            req.getRequestDispatcher("adminsearchbooks").forward(req,resp);
        }
        //resp.sendRedirect("http://tianshufu.site/"+value);



    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);

    }
}
