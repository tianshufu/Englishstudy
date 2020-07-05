package com.tianshu.entity;

public class Admin {
    private  String adminname;
    private  int adminid;
    private  String adminpass;
    private  int adminlevel;

    public Admin() {
    }

    public Admin(String adminname, int adminid, String adminpass, int adminlevel) {
        this.adminname = adminname;
        this.adminid = adminid;
        this.adminpass = adminpass;
        this.adminlevel = adminlevel;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }

    public int getAdminlevel() {
        return adminlevel;
    }

    public void setAdminlevel(int adminlevel) {
        this.adminlevel = adminlevel;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminname='" + adminname + '\'' +
                ", adminid=" + adminid +
                ", adminpass='" + adminpass + '\'' +
                ", adminlevel=" + adminlevel +
                '}';
    }


}
