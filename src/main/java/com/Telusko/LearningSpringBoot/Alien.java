package com.Telusko.LearningSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired // field injection
    private Laptop obj;

//    public Alien(Laptop obj) {
//        this.obj = obj; // constructor injection
//    }

//    @Autowired
//    public void setter(Laptop obj) {
//        this.obj = obj; // setter injection
//    }

    public void build(){
        obj.Compile();
        System.out.println("Chal Gaya");
    }
}
