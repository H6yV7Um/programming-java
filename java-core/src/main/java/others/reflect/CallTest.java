package others.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/**`
 * Created by yancy on 2018/3/28.
 */

public class CallTest {
    public static void main(String[] args) throws Exception {

        User user = new User();


//        user.setUsername("user109");
//        user.setPassword("pwd109");
//        user.seteBlog("www.cnblogs.com");
//        user.setRegistrationDate(new Date());

//        Map<String, FieldEntity> map = FieldsCollector.getFileds(user);
//        System.out.println(map);
        Map<String, Object> map = new HashMap();
        map.put("username", "mike");
        map.put("password", "pwd109");
        map.put("eBlog", "http://www.cnblogs.com/nick-huang/");
        map.put("registrationDate", new Date());
//        System.out.println(map);
        Class clazz = user.getClass();
        Field[] fields = clazz.getDeclaredFields();
        List<Map<String, String>> list = new ArrayList();
//        System.out.println(fields[0].getName());
        Map p = new HashMap();
        for (Field field : fields) {

            Modifier.toString(field.getModifiers());
            p.put(field.getType().getName(), field.getType().getName());
            p.put(field.getName(), keySetter(field.getName()));
            list.add(p);
        }
//        for (String i : list) {
//            System.out.println(i);
////        }
        Map<String, String> m = list.get(3);
        Object key = fields[3].getName();
        String methodName = m.get(key);
        Object value = map.get(key);

        String typeKey = fields[3].getType().getName();
        String typeValue = m.get(typeKey);
        // 想办法把String.class去掉，自动判断类型

        Class s = Class.forName(typeValue);
        Method method = clazz.getMethod(methodName, s);
        method.invoke(user, value);

        System.out.println(user.getRegistrationDate());

    }


    /**
     * 根据成员变量生成Setter和Getter的规则
     * 1、若成员变量都是小写，则将变量的首字母变为大写,再与get/set拼接
     * 2、若成员变量的第二个字符大写，则直接与get/set拼接
     *
     * @param fieldName
     * @return
     */
    public static String keySetter(String fieldName) {
        String second = fieldName.substring(1, 2);
        if (second.equals(second.toUpperCase())) {
            return new StringBuffer("set").append(fieldName).toString();
        }

        return new StringBuffer("set").append(fieldName.substring(0, 1).toUpperCase()).append(fieldName.substring(1)).toString();
    }
}
