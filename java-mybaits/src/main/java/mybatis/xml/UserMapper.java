package mybatis.xml;

import entity.User;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by yancy on 2018/4/29.
 */
public interface UserMapper {
    /**
     * 使用mapper代理方法开发
     * <p>
     * mapper.java接口包名和mapper.xml中的namespace一致
     * <p>
     * mapper.java接口中的方法名和mapper.xml中statement的id一致
     * <p>
     * mapper.java接口中的方法输入参数类型和mapper.xml中statement的parameterType指定的类型一致。
     * <p>
     * mapper.java接口中的方法返回值类型和mapper.xml中statement的resultType指定的类型一致。
     * <p>
     * <p>
     * <p>
     * <p>
     * 在Mybatis的配置文件mybatis-config.xml中，进行如下配置
     * <mappers>
     *     <mapper resource="mapper/UserMapper.xml"/>
     * </mappers>
     *
     * <p>
     * 可以使用注解，而不用XML文件
     *
     * @param user
     * @return
     * @throws Exception
     */
//    @Insert("INSERT INTO USER(username,password,sex,address) VALUES (#{username},#{password},#{sex},#{address})")
    int insertUser(User user) throws Exception;


}
