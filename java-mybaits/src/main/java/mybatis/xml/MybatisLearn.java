package mybatis.xml;

import entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by yancy on 2018/4/29.
 */
public class MybatisLearn {
    public static String path = "mybatis-config.xml";

    public static void query() throws Exception {
        //1.读mybatis-config.xml文件
        InputStream inputStream = Resources.getResourceAsStream(path);

        //2.初始mybatis，简历session工厂类的实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);

        //3.创建SqlSession实例
        SqlSession session = sqlSessionFactory.openSession();

        //4.SQL操作
        User user = new User();
        user.setUsername("Mike");
        user.setPassword("123");
        user.setSex("male");
        user.setAddress("china");


//        session.insert("mapper.UserMapper.insertUser", user);
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.insertUser(user);
        //5.提交事务
        session.commit();

        //6.关闭session
        session.close();
        System.out.println("success");
    }

    public static void main(String[] args) throws Exception {
        query();
    }
}
