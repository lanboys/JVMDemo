package org.fenixsoft.jvm.chapter2;

/**
 * VM Args：-Xss128k
 *
 * The stack size specified is too small, Specify at least 108k 栈帧至少108k
 *
 * @author zzm
 */
public class JavaVMStackSOF_1 {

    private static int stackLength = 1;

    public static void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF_1 oom = new JavaVMStackSOF_1();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
