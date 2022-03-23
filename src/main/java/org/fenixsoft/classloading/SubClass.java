package org.fenixsoft.classloading;

/**
 * Created by 蓝兵 on 2019/12/25.
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }
}