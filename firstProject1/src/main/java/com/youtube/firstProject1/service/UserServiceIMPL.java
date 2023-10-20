package com.youtube.firstProject1.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.youtube.firstProject1.model.User;
import com.youtube.firstProject1.repository.RegistrationRep;
import com.youtube.firstProject1.service.UserServiceIMPL;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    RegistrationRep obj;

    @Override
    public User addUser(User user) {
     User a=obj.save(user);
     return a;
    }

   
@Override
        public List<User> getAllSignup() {
                return obj.findAll ();
        }
       
       
       
}

