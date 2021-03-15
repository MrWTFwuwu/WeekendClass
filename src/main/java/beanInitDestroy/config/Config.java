package beanInitDestroy.config;

import beanInitDestroy.Service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("beanInitDestroy")
public class Config {
    @Bean(initMethod = "initService",destroyMethod = "destroyService")
    public MyService getMyService(){
        System.out.println("这是在config中的配置");
        return new MyService();
    }
}
