package com.example.springboot.service;

import com.example.springboot.dao.FakeRepoDatabase;
import com.example.springboot.entity.User;

public class UserService {
    private FakeRepoDatabase fake ;

    public User findUserById(long id)
    {
        return this.fake.findUserById(id);
    }
    public void deleteUser(long id)
    {
        this.fake.deleteUser(id);
    }
     public void insertUser(User users)
     {
         this.fake.insertUser(users);
     }

}
