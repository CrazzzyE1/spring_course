package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cat implements Pet {
    private String name;
    @Override
    public void say() {
        System.out.println("Meow - Meow");
    }
}
