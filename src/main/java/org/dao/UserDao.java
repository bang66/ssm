package org.dao;

import org.pojo.Person;



public interface UserDao {
    public Person getUserById(Integer id);
    public void addUser(Person person);
}
