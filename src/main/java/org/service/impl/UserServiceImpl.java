package org.service.impl;

import org.dao.UserDao;
import org.service.UserService;
import org.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//标注业务层
@Service
public class UserServiceImpl implements UserService {

    //通过注解注入usermapper
    @Autowired
    private UserDao userDao;


    @Override
    public Person getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void addUser(Person person) {
        userDao.addUser(person);
    }
}
