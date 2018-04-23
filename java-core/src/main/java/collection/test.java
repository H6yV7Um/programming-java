package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Integer level = null;
        try {
            Set<Integer> s = new HashSet<Integer>();


            if (!s.isEmpty()) {
                level = Collections.max(s);
            } else {
                System.out.println("level: " + level);
            }

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("".equals(null));
    }
}
