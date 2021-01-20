package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope(value ="prototype")
public class A {

    public A() {
        System.out.println("A");
    }

    @Autowired
    private B b;

}
