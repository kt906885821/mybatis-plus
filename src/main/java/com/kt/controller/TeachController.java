package com.kt.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.kt.dao.TeacherMapper;
import com.kt.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TeachController {


    @Autowired
    private TeacherMapper teacherMapper;

    @GetMapping(value = "/insert")
    public void insert(){
        Teacher teacher = new Teacher();
        teacher.setTeacherName(createRandomStr(6));
        teacher.setTeacherPwd(createRandomStr(6));
        teacherMapper.insert(teacher);
    }

    private static String createRandomStr(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0;i<length;i++){
            int number = random.nextInt(str.length());
            buffer.append(str.charAt(number));
        }
        return buffer.toString();
    }

    @GetMapping(value = "/delete")
    private void delete(@RequestParam int id){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        EntityWrapper entityWrapper=new EntityWrapper(teacher);
        teacherMapper.delete(entityWrapper);

    }



}
