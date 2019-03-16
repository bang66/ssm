package org;

import org.pojo.Person;
import org.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userDao= (UserService) app.getBean(UserService.class);
        Person person = userDao.getUserById(27);
        System.out.println("-------->"+person.toString());

        Person person1=new Person();
        person1.setId(66);
        person1.setAge(12);
        person1.setUsername("xxx");
        person1.setMobilephone("1232434535");
        userDao.addUser(person1);
        System.out.println("add  succ      !");

    }
}
