package com.example.service.Controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.service.Controller.utils.R;
import com.example.service.Service.StudentsService;
import com.example.service.dao.StudentsDao;
import com.example.service.domain.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;


// 使用restful风格进行编写
@RestController
@RequestMapping("/student")
public class StudentsController {


//    自动装配,将方法导入进来(一直在以后为什么一直导入的都是接口,而不是具体的类)
    @Autowired
    private StudentsService service;



    @GetMapping()
//    @CrossOrigin("http://localhost:7070")   // 后端跨域,第一次见过
    public R getAll(){
        return  new R(true,service.list(),"查询成功");   // 获取所有的数据,然后将数据全部放回成json数组模式
    }


    @PostMapping("/post")
    public  R PostTest(@RequestHeader("Authorization") String Authrozation){
        System.out.println(Authrozation);
        return  new R(true,service.getById(2),"查询成功");
    }

    @PostMapping("/post1")
    public  R PostTest(String name ,Integer age){
        System.out.println(name+" "+ age);
        return  new R(true,service.getById(2),"查询成功");
    }

    @PostMapping("/post2")   // json的数据接受，需要使用requestbody进行标记
    public  R PostTest1(@RequestBody Students students){

        System.out.println(students);
        return  new R(true,service.getById(2),"查询成功");
    }

    @GetMapping("/page")    // 想尝试一下，分页操作的东西
    public R getCurrentPage(Integer currentPage,Integer pageSize){
        Page<Students> page =service.getPage(currentPage,pageSize);
        System.out.println(currentPage+"   "+pageSize);
        System.out.println(page);
        return  new R(true,page,"查询成功");
    }

    @GetMapping("/search")
    public R searchData(Students students){
        System.out.println(students);
//        Page page = service.getPage(currentPage,pageSize,new Students(name,sex,age));
        return new R(true,service.getById(2),"什么情况");
    }
}
