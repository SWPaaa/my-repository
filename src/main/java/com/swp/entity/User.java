package com.swp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

//lombok里面的注解
@Data//替代Getter,Setter,equals,canEqual,hasCode,toString等方法
@AllArgsConstructor//使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
public class User {
    private  Integer id;
    private  String name;
    public User(){
    }
}
