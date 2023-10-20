package com.youtube.firstProject1.service;


import java.util.List;

import com.youtube.firstProject1.model.User;

public interface UserService {
    public User addUser(User user);
    
    public List<User> getAllSignup();

}
