package com.skw.microserviceprovideruser.Controller;

import com.skw.microserviceprovideruser.dao.UserRepository;
import com.skw.microserviceprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User findOne = this.userRepository.findById(id).get();
        return findOne;
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
