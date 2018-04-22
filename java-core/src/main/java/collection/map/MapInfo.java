package collection.map;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class MapInfo {
    public static void main(String[] args) {
        Map m = new HashMap();
        TreeSet treeSet = new TreeSet();
        m.put("Zara", "1");
        m.put("Mahnaz", "2");
        m.put("Ayan", "3");
        m.put("Daisy", "4");

        Iterator i = m.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            // System.out.println(entry);
            Object person = JSON.toJSON(entry);
            treeSet.add(person);
        }
        Iterator iter= treeSet.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }



        LinkedHashSet set = new LinkedHashSet();


    }

}
