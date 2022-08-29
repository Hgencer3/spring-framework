package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigEmployee.class,ConfigNew.class);

        FullTimeEmployee fte=container.getBean(FullTimeEmployee.class);
        fte.createAccount();
        PartTimeEmployee pte=container.getBean(PartTimeEmployee.class);
        pte.createAccount();

        String str=container.getBean("Wellcome",String.class);
        System.out.println(str);
        String str2=container.getBean("Sprint",String.class);
        System.out.println(str2);

    }





}
