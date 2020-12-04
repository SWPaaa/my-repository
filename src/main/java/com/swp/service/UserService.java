package com.swp.service;

import com.swp.entity.User;

import java.util.Collection;

public interface UserService {
    public Collection<User> findAll();
    public User findById(Integer id);
    public void save(User user);
    public void deleteById(Integer id);
    public void update(User user);
}
