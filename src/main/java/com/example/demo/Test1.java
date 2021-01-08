package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog pet1 = context.getBean("myPet", Dog.class);
        Dog pet2 = context.getBean("myPet", Dog.class);
        pet1.setName("123");
        pet2.setName("456");
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(pet1.getName() + " " + pet2.getName());
        context.close();

    }
}
