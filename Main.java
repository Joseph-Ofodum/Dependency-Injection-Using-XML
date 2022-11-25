package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Lawyer staff= applicationContext.getBean(Lawyer.class );
        staff.defend();
        System.out.println(staff.getQualification());

        ParaLegal staff1= applicationContext.getBean(ParaLegal.class);
        staff1.defend();
        System.out.println(staff1.getQualification());
    }
}