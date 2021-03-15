package instance.instance;

public class BeanInstanceFactory {
    public BeanClass createBeanClassInstance(){
        return new BeanClass("调用实例化工厂方法实例化bean");
    }
}
