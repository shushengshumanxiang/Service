package com.example.service.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.service.Service.StudentsService;
import com.example.service.dao.StudentsDao;
import com.example.service.domain.Students;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// 使用mp来进行操作,也可以进行自己的方法
@Service
public class StudentsServiceImpl extends ServiceImpl<StudentsDao, Students> implements StudentsService {


    @Autowired
    private StudentsDao studentsDao;


    @Override
    public Page<Students> getPage(int currentPage, int pageSize) {
        Page studentsPage = new Page(currentPage,pageSize);
        return studentsDao.selectPage(studentsPage,null);
    }

    @Override
    public Page<Students> getPage(int currentPage, int pageSize, Students students) {
        LambdaQueryWrapper<Students> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(students.getName()),Students::getName,students.getName());
        lqw.like(Strings.isNotEmpty(students.getName()),Students::getName,students.getName());
        lqw.like(true,Students::getAge,students.getAge());
        Page studentsPage = new Page(currentPage,pageSize);
        return studentsDao.selectPage(studentsPage,lqw);
    }
}
