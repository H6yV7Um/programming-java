package others.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yancy on 2018/3/28.
 * Map<String, FieldEntity>
 *
 *
 *
 *  根据成员变量生成Setter和Getter的规则
 *  1、若成员变量都是小写，则将变量的首字母变为大写,再与get/set拼接
 *  2、若成员变量的第二个字符大写，则直接与get/set拼接
 */
public class TestReflect {
    public void key(Object object) throws Exception {
        Class clazz = User.class;
        Field[] fields = clazz.getDeclaredFields();
        Map<String, FieldEntity> map = new HashMap<String, FieldEntity>();

        for (Field f : fields) {
            System.out.println(f.getName());

        }
        Method method = clazz.getMethod("getPassword");
        Object o = method.invoke(object);
//        System.out.println(o);
    }

    public static void main(String[] args) throws Exception {
        TestReflect t = new TestReflect();
        User user = new User();

        user.setUsername("user109");
        user.setPassword("pwd109");
        user.seteBlog("http://www.cnblogs.com/nick-huang/");
        user.setRegistrationDate(new Date());

        t.key(user);

    }
}
