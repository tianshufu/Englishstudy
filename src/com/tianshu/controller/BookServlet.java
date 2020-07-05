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

//订购页面信息提交
@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
    private TimeTable timeTable = new TimeTable();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Teacher teacher= new Teacher();
        SearchTeacherInfo searchTeacherInfo= new SearchTeacherInfo();
        int studentId = ((Student)req.getSession().getAttribute("student")).getStudentid();
        String studentname=((Student)req.getSession().getAttribute("student")).getStudentname();

        int teacherId = Integer.parseInt(req.getParameter("teacherId"));
        String teachername=req.getParameter("teacherName");
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        String coststr=req.getParameter("credit");
        int costs=Integer.parseInt(coststr);
        int timeSlot = timeTable.getTimeSlot(time);
        String books = req.getParameter("books");
        String speakingPace = req.getParameter("speaking_pace");
        String leaveWord = req.getParameter("leave_word");
        String bookplatform=req.getParameter("course_platform");
        BookCourse bookCourse=new BookCourse();
        SendEmail sendEmail=new SendEmail();
        JudgeSameBookCourse judgeSameBookCourse=new JudgeSameBookCourse();
        int studentleftclass;
        studentleftclass=bookCourse.Search_Student_left_class(studentId);
        if(studentleftclass>0)
        {
            //verify if the student had booked the course
            boolean courseflag=judgeSameBookCourse.judgesamebookcourse(studentId,teacherId,date,time);
            //if there are no current class, student can book the course
            if(courseflag)
            {
                bookCourse.Add_Course_info_and_Delete_slot(teacherId,date,timeSlot,studentId,time,books,speakingPace,leaveWord,bookplatform);
                bookCourse.Subtract_Student_left_class(studentId,costs);
                teacher=searchTeacherInfo.searchteacherinfo(teacherId);
                String zoomid=teacher.getZoom_contact();
                String zoompassword=teacher.getZoom_password();
                String teacheremail=teacher.getEmail();


                //send the info to the teacher
                sendEmail.teacherinfosendemail(teacheremail,teachername,studentname,date,time,books,speakingPace,bookplatform,leaveWord);
                //send the booking to the admins
                sendEmail.teacherinfosendemail("diazgwen379@gmail.com",teachername,studentname,date,time,books,speakingPace,bookplatform,leaveWord);
                sendEmail.teacherinfosendemail("149621036qq.com",teachername,studentname,date,time,books,speakingPace,bookplatform,leaveWord);

                //send the course info by messsage to the student's phone
                String studentphonenum=((Student)req.getSession().getAttribute("student")).getPhonenumber();
                ClassInfoMessageSend classInfoMessageSend=new ClassInfoMessageSend();
                classInfoMessageSend.StudentClassInfoSend(studentphonenum,teachername,studentname,books,date,time,zoomid,zoompassword);


                //get the updated student info
                Student student=new Student();
                JDBC searchstudent=new JDBC();
                student=searchstudent.studentinfo(studentId);
                req.getSession().setAttribute("student",student);

                req.getRequestDispatcher("/TeacherSearchTimeStudent?pagenum=1").forward(req,resp);

            }
            //if the student already booked the class
            else
            {
                req.getRequestDispatcher("/SearchStudentCourse").forward(req,resp);

            }



        }

        else
        {
            req.setAttribute("loginError","You don't have enough class num, please go and but more class");
            req.getRequestDispatcher("bookCourse.jsp").forward(req,resp);
        }



    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }


}
