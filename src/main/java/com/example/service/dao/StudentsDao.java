package com.example.service.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.service.domain.Students;
import org.apache.ibatis.annotations.Mapper;


// basemap是mybatis plus的类,可以实现一些简单的数据的操作
// 相当于一个类上绑定了很多的方法是,使用的就是这个接口的方法
@Mapper
public interface StudentsDao extends BaseMapper<Students> {
}
