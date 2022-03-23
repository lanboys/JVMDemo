package org.fenixsoft.classloading;

/**
 * Created by 蓝兵 on 2019/12/25.
 * <p>
 * 被动使用类字段演示三：
 * 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类，
 * 因此不会触发定义常量的类的初始化。
 **/
public class NotInitialization3 {

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}