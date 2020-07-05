package com.tianshu.entity;

public class Book {
    private  String bookname;
    private  int bookid;
    private  String bookurl;


    public Book() {
    }

    public Book(String bookname, int bookid, String bookurl) {
        this.bookname = bookname;
        this.bookid = bookid;
        this.bookurl = bookurl;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookurl() {
        return bookurl;
    }

    public void setBookurl(String bookurl) {
        this.bookurl = bookurl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", bookid=" + bookid +
                ", bookurl='" + bookurl + '\'' +
                '}';
    }

}

