package test.dao;


import org.springframework.stereotype.Repository;
import test.entity.User;

@Repository
public interface UserDao {

    int insertUser(User user);
}
