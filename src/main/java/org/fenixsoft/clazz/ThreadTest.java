package org.fenixsoft.clazz;

/**
 * Created by 蓝兵 on 2020/3/31.
 */

public class ThreadTest {

    public volatile static int a;

    public static void main(String[] args) throws InterruptedException {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20000; i++) {
                    increase();
                }
            }
        });
        thread.start();
        for (int i = 0; i < 20000; i++) {
            increase();
        }
        thread.join();
        System.out.println("main(): " + a);
    }

    public static void increase() {
        int a = ThreadTest.a;
        ThreadTest.a = a + 1;
        System.out.println("increase(): " + Thread.currentThread().getName()
                + " : " + ThreadTest.a);
    }
}
