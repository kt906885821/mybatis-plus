package com.kt.pojo;


import com.baomidou.mybatisplus.annotations.TableName;

@TableName(value = "teacher")
public class Teacher {
    private int id;
    private String teacherName;
    private String teacherPwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPwd() {
        return teacherPwd;
    }

    public void setTeacherPwd(String teacherPwd) {
        this.teacherPwd = teacherPwd;
    }
}
