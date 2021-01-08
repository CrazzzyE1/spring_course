package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dog implements Pet {
    private String name;
    public Dog() {
        System.out.println("Doggi");
    }

    @Override
    public void say() {
        System.out.println("Bow - Wow");
    }
}
