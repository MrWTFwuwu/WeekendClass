package annotation.test;

import annotation.controller.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(TestConfig.class);
        TestController tc = appCon.getBean(TestController.class);
        tc.save();
        appCon.close();
    }
}
