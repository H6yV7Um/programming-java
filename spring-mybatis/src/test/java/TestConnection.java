import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.dao.UserDao;
import test.entity.User;

import java.time.LocalDate;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-core.xml"})
public class TestConnection extends AbstractJUnit4SpringContextTests {

    @Autowired
    UserDao userDao;

    @Test
    public void testA() throws Exception {
        LocalDate today = LocalDate.now();

        User u = new User();
        u.setName("Ocean");
        u.setAge( today+"");
        userDao.insertUser(u);
        if (userDao == null) {
            System.out.println("null");
        } else {
            System.out.println("not null");
        }
    }
}




