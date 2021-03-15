package mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

public class DBUtils {
    private static volatile SqlSessionFactory sqlSessionFactory;
    public static SqlSessionFactory obtionsqlSessionFactory(){
        if(sqlSessionFactory==null){
            synchronized(DBUtils.class){
                if(sqlSessionFactory == null){
                    sqlSessionFactory = getSqlSessionFactory();
                }
            }
        }
        return sqlSessionFactory;
    }

    private static SqlSessionFactory getSqlSessionFactory(){
        //xml路径
        String resource = "mybatis-config.xml";
        SqlSessionFactory sqlSessionFactory = null;
        try{
            //使用输入流
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }
}
