package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private Pet pet;
    private String name;
    private int age;

    public Person() {
        System.out.println("Personnnnneesss");
    }
}
