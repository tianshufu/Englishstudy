package com.tianshu.controller;

import com.tianshu.entity.Book;
import com.tianshu.utils.BooksInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/teachersearchbooks")
public class TeacherSearchBooksServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Coursevideo coursevideo=new Coursevideo();
        BooksInfo booksInfo=new BooksInfo();
        List<Book> booklist=booksInfo.Searchallbooksinfo();
        req.setAttribute("bookinfo",booklist);
        req.getRequestDispatcher("TeacherSearchBookList.jsp").forward(req,resp);




    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
