package beanInitDestroy.Service;

public class MyService {
    public void initService(){
        System.out.println("init");
    }
    public MyService(){
        System.out.println("构造方法");
    }
    public void destroyService(){
        System.out.println("destroy");
    }
}
