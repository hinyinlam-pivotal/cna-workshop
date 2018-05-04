package com.hintest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hinlam on 8/3/16.
 */

@SpringBootApplication
@EnableAutoConfiguration
public class Main {
    public static void main(String args[]){

        //SpringApplication.run(Main.class, args);

        ApplicationContext ac1 = new AnnotationConfigApplicationContext(MyConfig1.class);
        //ApplicationContext ac2 = new AnnotationConfigApplicationContext(MyConfig2.class);

        String[] test = new String[10];
        System.out.println(ac1.getBeanDefinitionNames());
        for(String name: ac1.getBeanDefinitionNames()){
            System.out.println(name);
        }

    }

}
