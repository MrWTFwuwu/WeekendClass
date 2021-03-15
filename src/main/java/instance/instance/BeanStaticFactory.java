package instance.instance;

public class BeanStaticFactory {
    private static BeanClass beanInstance = new BeanClass("调用静态工厂方法实力化bean");
    public static BeanClass createInstance(){
        return beanInstance;

    }
}
