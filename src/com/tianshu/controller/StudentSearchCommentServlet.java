package com.tianshu.controller;

import com.tianshu.entity.Student;
import com.tianshu.entity.StudentCourse;
import com.tianshu.entity.StudentCourseComment;
import com.tianshu.utils.StudentSearchComment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/studentsearchcommment")
public class StudentSearchCommentServlet extends HttpServlet {

    private StudentCourseComment studentCourseComment=new StudentCourseComment();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int studentId = ((Student)req.getSession().getAttribute("student")).getStudentid();
        StudentSearchComment studentSearchComment=new StudentSearchComment();
        List<StudentCourseComment> studentCourseCommentList=new ArrayList<>();
        studentCourseCommentList=studentSearchComment.searchstudentcomment(studentId);
        System.out.println(studentCourseCommentList);
        req.setAttribute("studentcoursecommentlist",studentCourseCommentList);
        req.getRequestDispatcher("studentfinnishedclass.jsp").forward(req,resp);
    }


}
