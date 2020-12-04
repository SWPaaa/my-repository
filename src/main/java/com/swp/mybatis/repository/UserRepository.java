package com.swp.mybatis.repository;

import com.swp.entity.User;
import java.util.List;

public interface UserRepository {
    public List<User> findAll();//这里的findAll也与mapping下面的id 对应
    public User findById(Integer id);
    public void save(User user);
    public void deleteById(Integer id);
    public void update(User user);
}
