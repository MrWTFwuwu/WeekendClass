package beanScope.config;

import beanScope.ProtorypeService;
import beanScope.SingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(ScopeConfig.class);
        SingletonService s1 = appCon.getBean(SingletonService.class);
        SingletonService s2 = appCon.getBean(SingletonService.class);
        ProtorypeService p1 = appCon.getBean(ProtorypeService.class);
        ProtorypeService p2 = appCon.getBean(ProtorypeService.class);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(p1);
        System.out.println(p2);
        appCon.close();
    }
}
