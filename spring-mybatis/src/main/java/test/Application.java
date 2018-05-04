package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.dao.UserDao;

public class Application {
    @Autowired
    static UserDao userDao;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        if (userDao==null){
            System.out.println("null");
        }else {
            System.out.println("not null");
        }
    }
}
