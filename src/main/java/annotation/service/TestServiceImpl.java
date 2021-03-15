package annotation.service;

import annotation.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("testServiceImpl")
//Service等价
public class TestServiceImpl implements TestService {
    //jdk9以上不行
    @Resource(name="testDaoImpl")//把命名为testdaoimpl的bean赋值给testdao
    private TestDao testdao;



    @Override
    public void save() {
        testdao.save();
        System.out.println("testservice save");
    }
}
