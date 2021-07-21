package com.springbasics.triangle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class TriangleApplication {
    public static void main(String[] args) {
        SpringApplication.run(TriangleApplication.class, args);

//        URL url = TriangleApplication.class.getResource("/SpringConfig.xml");
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(url.getPath()));
//        MakeTriangle triangle = (MakeTriangle)factory.getBean("makeTriangle");
//        triangle.drawTriangle();

        ApplicationContext context = new ClassPathXmlApplicationContext("/SpringConfig.xml");
        MakeTriangle t = (MakeTriangle) context.getBean("makeTriangle");
        t.drawTriangle();

    }

}
