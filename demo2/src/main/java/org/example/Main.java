package org.example;

import org.example.bean.A;
import org.example.bean.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DefaultConfig.class);

        A a = (A) applicationContext.getBean("a");
        System.out.println(a);

        B b = (B) applicationContext.getBean("b");
        System.out.println(b);

    }

}
