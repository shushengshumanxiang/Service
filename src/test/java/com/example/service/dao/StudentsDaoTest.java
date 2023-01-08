package com.example.service.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentsDaoTest {

    @Autowired
    private  StudentsDao studentsDao;

    @Test    // 测试成功,将数据成功提取出来
    void  add(){

        System.out.println(studentsDao.selectById(3));
    }
}
