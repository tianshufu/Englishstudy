package com.tianshu.controller;

import com.tianshu.entity.Student;
import com.tianshu.entity.Teacher;
import com.tianshu.entity.TimeTable;
import com.tianshu.utils.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// sevlet for students to cancel the class
@WebServlet("/studentcancelcourse")
public class StudentCancelCourseServlet extends HttpServlet {
    private TimeTable timeTable = new TimeTable();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentCancelCourse studentCancelCourse=new StudentCancelCourse();
        BookCourse bookCourse=new BookCourse();
        int studentId = ((Student)req.getSession().getAttribute("student")).getStudentid();
        String studentname=((Student)req.getSession().getAttribute("student")).getStudentname();
        Integer teacherId = Integer.parseInt(req.getParameter("teacherId"));
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        int timeSlot = timeTable.getTimeSlot(time);

        //send the email to the teacher to inform the class has been canceled
        Teacher teacher= new Teacher();
        SearchTeacherInfo searchTeacherInfo=new SearchTeacherInfo();
        teacher=searchTeacherInfo.searchteacherinfo(teacherId);
        String teacheremail=teacher.getEmail();
        String teachername=teacher.getTeacher_name();
        // get the costs of the class
        Integer costs=teacher.getCredit();
        SendEmail sendEmail= new SendEmail();

        sendEmail.teachercancelemail(teacheremail,teachername,studentname,date,time);

        //send the email to the admin
        sendEmail.teachercancelemail("diazgwen379@gmail.com",teachername,studentname,date,time);



        studentCancelCourse.StudentCancelCourse(teacherId,date,timeSlot,studentId,time);
        bookCourse.Add_Student_left_class(studentId,costs);

        Student student=new Student();
        JDBC searchstudent=new JDBC();
        student=searchstudent.studentinfo(studentId);
        req.getSession().setAttribute("student",student);
        req.getRequestDispatcher("/SearchStudentCourse").forward(req,resp);


        //req.getRequestDispatcher("/TeacherSearchTimeStudent").forward(req,resp);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }


}
