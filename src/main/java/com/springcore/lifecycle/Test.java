package com.springcore.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        context.registerShutdownHook();
        Samosa s = (Samosa) context.getBean("s1");
        System.out.println(s.getPrice());

        System.out.println("__________________________________");

        Pepsi s2 = (Pepsi) context.getBean("s2");
        System.out.println(s2.getPrice());
        System.out.println(s2);

        System.out.println("Using Annotation");
        Kachori s3 = (Kachori) context.getBean("s3");
        System.out.println(s3);
    }
}
