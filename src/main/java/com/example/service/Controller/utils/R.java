package com.example.service.Controller.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//利用此对象,将数据进行规范化
@Data
@AllArgsConstructor   // 有参构造器
@NoArgsConstructor      // 无参构造器
public class R {

    private Boolean flag;     // 表示状态
    private Object data;      // 储存数据
    private String msg;       // 返回一些消息,将一些表达返回给前端
}
