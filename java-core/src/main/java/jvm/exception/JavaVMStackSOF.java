package jvm.exception;

/**
 * 虚拟机栈和本地方法栈溢出
 * <p>
 * Hotspot虚拟机并不区分虚拟机栈和本地方法栈。
 * <p>
 * JVM Args  本地方法栈：-Xoss（Hotspot中无效）；栈容量：-Xss
 * <p>
 * VM Args：-Xss128k
 * <p>
 * Created by yancy on 2018/3/20.
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
//            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("statck length: " + oom.stackLength);
            throw e;
        }


    }
}
