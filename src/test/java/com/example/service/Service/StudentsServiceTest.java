package com.example.service.Service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentsServiceTest {

    @Autowired
    private StudentsService service;

    @Test    // 成功通过mp进行数据的查询,将数据库的数据提取出来
    void get(){

        System.out.println(service.getById(2));;
    }
}
