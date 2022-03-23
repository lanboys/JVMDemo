package org.fenixsoft.classloading;

/**
 * Created by 蓝兵 on 2019/12/26.
 */

public class DeadLoopClass {

    static {
        // 如果不加上这个if语句，编译器将提示“Initializer does not complete normally”并拒绝编译
        if (true) {
            System.out.println(Thread.currentThread() + "init DeadLoopClass");
            while (true) {
                System.out.println(Thread.currentThread());
            }
        }
    }

    public DeadLoopClass() {
        System.out.println(Thread.currentThread() + "new DeadLoopClass");
    }
}