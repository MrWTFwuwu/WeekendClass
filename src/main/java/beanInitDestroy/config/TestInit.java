package beanInitDestroy.config;

import beanInitDestroy.Service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestInit {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(Config.class);
        MyService ms = appCon.getBean(MyService.class);
        System.out.println("-----------------");
        appCon.close();
    }
}