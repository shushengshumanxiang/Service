package com.example.service.Service;


//业务层----->可以使用mp提供的共有属性进行操作,对于我的这个项目已经足够了

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.service.domain.Students;

public interface StudentsService  extends IService<Students> {


//    没有分页功能的具体实现方法，所以需要一个自己写的方法
        Page<Students> getPage(int currentPage, int pageSize);
        Page<Students> getPage(int currentPage, int pageSize,Students students);

}
