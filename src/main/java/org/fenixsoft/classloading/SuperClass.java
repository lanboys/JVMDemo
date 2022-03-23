package org.fenixsoft.classloading;

/**
 * Created by 蓝兵 on 2019/12/25.
 */
public class SuperClass {

    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}