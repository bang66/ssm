package org.service;

import org.pojo.Person;

public interface UserService {
    public Person getUserById(Integer id);
    public void addUser(Person person);
}
