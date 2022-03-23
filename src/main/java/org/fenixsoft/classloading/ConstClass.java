package org.fenixsoft.classloading;

/**
 * Created by 蓝兵 on 2019/12/25.
 **/
public class ConstClass {

    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world";
}