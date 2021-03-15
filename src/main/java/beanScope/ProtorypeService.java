package beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")//每次获取bean都会创建一个实例
public class ProtorypeService {
}
