package org.example;


import org.example.controller.Controller;
import org.example.springConfig.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        Controller cardRepository = (Controller) context.getBean("controller");
//        System.out.println(cardRepository);

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Controller controller= context.getBean("controller",Controller.class);
        controller.start();
//        Controller controller=new Controller();

    }
}