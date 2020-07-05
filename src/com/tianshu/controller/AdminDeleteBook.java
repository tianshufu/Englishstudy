package com.tianshu.controller;

import com.tianshu.managewebfile.Deletefile;
import com.tianshu.utils.BooksInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admindeletebook")
public class AdminDeleteBook extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Coursevideo coursevideo=new Coursevideo();
        String url=req.getParameter("bookurl");
        String key=url.replace("http://tianshufu.site/","");
        key=key.replace("%20"," ");
        System.out.println(key);
        String bookidstr=req.getParameter("bookid");
        Integer bookid=Integer.parseInt(bookidstr);
        Deletefile deletefile=new Deletefile();
        boolean deleteflag= deletefile.deletefile(key);
        if (deleteflag) {
            BooksInfo booksInfo=new BooksInfo();
            booksInfo.DeleteBooks(bookid);
            req.getRequestDispatcher("adminsearchbooks").forward(req,resp);

        }

        else {
            req.getRequestDispatcher("adminsearchbooks").forward(req,resp);

        }





    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
