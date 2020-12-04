package com.swp.repository;

import com.swp.entity.User;

import java.util.Collection;

public interface UserRepository {
    public Collection<User> findAll();
    public User findById(Integer key);
    public void save(User user);
    public void deleteById(Integer key);
    public void update(User user);

}
