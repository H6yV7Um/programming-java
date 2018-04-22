package jvm.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆溢出
 * <p>
 * 遇到OOM，根据异常信息判断是哪个区的内存溢出，知道什么样的代码会造成这些
 * 区域的内存溢出，以及出现了这些异常后该如何处理
 * <p>
 * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * <p>
 * Error INFO :java.lang.OutOfMemoryError: Java heap space
 * <p>
 * Created by yancy on 2018/3/20.
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }

    }

}
