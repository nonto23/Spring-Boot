package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
   private  UserService services ;

    @RequestMapping(value = "{/id}",method = RequestMethod.GET)
    public User findUserById(@PathVariable("id") long id)
    {
        return this.services.findUserById(id);
    }

    @RequestMapping(value = "{/id}",method = RequestMethod.DELETE)
    public void  removeUser(@PathVariable("id")long id)
    {
         services.deleteUser(id);
    }

}
