package aspectj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//注释为配置文件
@Configuration
//自动扫描aspectj包下的注解
@ComponentScan("aspectj")
//开启spring对aspectj的支持
@EnableAspectJAutoProxy
public class AspectjAOPConfig {

}
