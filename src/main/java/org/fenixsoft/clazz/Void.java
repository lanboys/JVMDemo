package org.fenixsoft.clazz;

/**
 * Created by 蓝兵 on 2020/1/9.
 */

public class Void {

    public static Class TYPE;

    static {
        try {
            TYPE = Class.forName("java.lang.Void");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
