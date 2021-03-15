package annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("testDaoImpl")//<bean id=testdaoimpl>
//Repository等价于上面那个
public class TestDaoImpl implements TestDao{
    @Override
    public void save() {
        System.out.println("testdao save");
    }
}
