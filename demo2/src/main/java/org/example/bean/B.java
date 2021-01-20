package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope(value ="prototype")
public class B {

    public B() {
        System.out.println("B");
    }

    @Autowired
    private A a;
}
