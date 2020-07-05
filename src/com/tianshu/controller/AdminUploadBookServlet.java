package com.tianshu.controller;

import com.tianshu.uploadfile.UploadDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//the servlet to generate the token of upload a pdf file
@WebServlet("/adminuploadbooktoken")
public class AdminUploadBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UploadDemo uploadDemo=new UploadDemo();
        String token= uploadDemo.pdf_token_upload();
        //String token=uploadDemo.cover_coken(key);
        request.setAttribute("token",token);
        request.getRequestDispatcher("Adminuploadbook.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
