package com.studentManagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid", updatable = false)
    private long sid;
    @Column(name = "st_name")
    private String sname;
    @Column(name = "st_branch")
    private String sbranch;
    @Column(name = "st_username", unique = true)
    private String susername;
    @Column(name = "st_password")
    private String spassword;
    @Column(name = "st_phoneno")
    private String sphoneno;

    public Student() {
    }

    public Student(long sid, String sname, String sbranch, String susername, String spassword, String sphoneno) {
        this.sid = sid;
        this.sname = sname;
        this.sbranch = sbranch;
        this.susername = susername;
        this.spassword = spassword;
        this.sphoneno = sphoneno;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSbranch() {
        return sbranch;
    }

    public void setSbranch(String sbranch) {
        this.sbranch = sbranch;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSphoneno() {
        return sphoneno;
    }

    public void setSphoneno(String sphoneno) {
        this.sphoneno = sphoneno;
    }
}

