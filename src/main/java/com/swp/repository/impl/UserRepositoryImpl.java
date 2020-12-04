package com.swp.repository.impl;

import com.swp.entity.User;
import com.swp.repository.UserRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static Map<Integer,User> map; //static公用，且不用使用this，但是不会改变权限private
    static{ //节约空间，在类初次被加载的时候，会按照static块的顺序来依次执行每个static块，并且只会执行一次
        //（如果不放在static中，每次调用下面方法时都会生成一个map对象）
        map = new HashMap<>();
        map.put(1, new User(1,"张三"));
        map.put(2, new User(2,"李四"));
        map.put(3, new User(3,"王五"));
    }
    @Override//重写，标注下面是实现的接口
    public Collection<User> findAll() {
        return map.values();
    }//values()获取集合中所有值的集合

    @Override
    public User findById(Integer key) {
        return map.get(key);
    }//获得该key下的一行字段（包括id和name）根据键获取值

    @Override
    public void save(User user) {
        map.put(user.getId(),user);
    }//存入

    @Override
    public void deleteById(Integer key) {
        map.remove(key);
    }//删除

    @Override
    public void update(User user) {
        map.put(user.getId(),user);
    }//修改
}
