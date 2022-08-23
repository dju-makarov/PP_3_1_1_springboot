package com.dju.spring.sprinboot.spring_course_springboot.dao;



import com.dju.spring.sprinboot.spring_course_springboot.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getAllUsers();
}

