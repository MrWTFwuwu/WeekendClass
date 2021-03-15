package aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
//    定义切入点表达式
    @Pointcut("execution(* aspectj.dao.*.*(..))")
    private void myPointcut(){
    }

//前置通知 使用JPoint接口最为参数获取目标对象信息
    @Before("myPointcut()")
    public void before(JoinPoint jp){
        System.out.println("前置通知:模拟权限控制");
        //直译 获取对象签名
        System.out.println(",目标类对象:"+jp.getTarget());
        System.out.println(",被增强处理的方法:"+jp.getSignature().getName());
    }

    //后置返回通知 再返回结果之后执行
    @AfterReturning("myPointcut()")
    public void afterReturning(JoinPoint jp){
        System.out.println("后置返回通知:模拟删除文件  "+jp.getSignature().getName());
    }

    //环绕通知 在目标运行前和运行后都会执行一次
//    ProceedingJoinPoint是jp的子接口 代表可以执行的目标方法
//    返回值必须是object 参数必须是ProceedingJoinPoint 必须throws throwable
    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable {
        System.out.println("环绕开始,执行目标方法前,模拟开启事务");
        //proceed 开始
        Object obj = pjp.proceed();
        System.out.println("环绕结束");
        return obj;
    }

//    异常通知
    @AfterThrowing(value="myPointcut()",throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("异常通知:程序执行异常"+e.getMessage());
    }
    //后置通知 最终通知 不管发生什么最后执行的方法
    @After("myPointcut()")
    public void after(){
        System.out.println("最终通知:模拟释放资源");
    }
}
