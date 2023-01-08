package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.service.dao.StudentsDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceApplicationTests {

    @Autowired
    private StudentsDao studentsDao;
    @Test
    void contextLoads() {
        IPage studentsPage = new Page(1,5);
        studentsDao.selectPage(studentsPage,null);
    }

}
