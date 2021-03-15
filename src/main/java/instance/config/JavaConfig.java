package instance.config;

import instance.instance.BeanClass;
import instance.instance.BeanInstanceFactory;
import instance.instance.BeanStaticFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean(value="beanClass")//value可以省略
    public BeanClass getBeanClass(){
        return new BeanClass();
    }
    @Bean("beanStaticFactory")
    public BeanClass getBeanStaticFactory(){
        return BeanStaticFactory.createInstance();
    }
    @Bean("beanInstanceFactory")
    public BeanClass getBeanInstanceFactory(){
        BeanInstanceFactory bi = new BeanInstanceFactory();
        return bi.createBeanClassInstance();
    }

}
