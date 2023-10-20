package com.youtube.firstProject1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.youtube.firstProject1.model.User;

import com.youtube.firstProject1.service.UserServiceIMPL;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class FirstCon {

@Autowired
    UserServiceIMPL obj;

    @GetMapping("/index")
    public String fun() {
        return "index";
    }
    @GetMapping("/home")
    public String fun2(@RequestParam String name, @RequestParam String email) {
        System.out.println(name);
        System.out.println(email);
        return "home";
    }
    
    @PostMapping("/home1")
    public String f1(@ModelAttribute User c) {
        User b= obj.addUser(c);
        System.out.println(b);
        return "home";
    }
   
@GetMapping ("/getUser")
public String  getAllSignup()
{
   List<User> users = obj.getAllSignup() ;
   users.forEach(data-> System.out.println(data.toString())); 
   System.out.println("fetched");
   return "index";
}

}
