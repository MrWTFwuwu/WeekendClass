package aspectj.config;

import aspectj.dao.TestDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
        //初始化spring容器
        AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(AspectjAOPConfig.class);

        //从容器中获取增强后的目标对象
        TestDao testdao = appCon.getBean(TestDao.class);

        //执行方法
        testdao.save();
        System.out.println("------------------");
        testdao.modify();
        System.out.println("------------------");
        testdao.delete();
        appCon.close();
    }
}
