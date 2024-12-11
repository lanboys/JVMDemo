package org.fenixsoft.jvm.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * VM Args：-XX:PermSize=6M -XX:MaxPermSize=6M
 *
 *  PermSize设置太小会报错 Too small initial permanent heap
 *
 *
 *  得新建一个jdk是1.6的项目来跑，jdk1.7的常量池已经从永久代移到别的地方（哪里？），测不出效果
 *
 *  Exception in thread "main" java.lang.OutOfMemoryError: PermGen space
 * 	at java.lang.String.intern(Native Method)
 * 	at org.fenixsoft.jvm.chapter2.RuntimeConstantPoolOOM_1.main(RuntimeConstantPoolOOM_1.java from InputFileObject:22)
 *
 * @author zzm
 */
public class RuntimeConstantPoolOOM_1 {

    public static void main(String[] args) {
        // 使用Set保持着常量池引用，避免Full GC回收常量池行为
        Set<String> set = new HashSet<String>();
        // 在short范围内足以让6MB的PermSize产生OOM了
        short i = 0;
        while (true) {
            System.out.println("main(): "+i);
            // 放入运行时常量池中
            set.add(String.valueOf(i++).intern());
        }
    }
}
