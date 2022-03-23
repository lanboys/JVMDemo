package org.fenixsoft.clazz;

/**
 * Created by 蓝兵 on 2020/1/2.
 */

public class GaussTest {

    public static void main(String[] args) {
        final String a = "lanbing";

        GaussTest[] gaussTests = new GaussTest[5];

        GaussTest test = new GaussTest();
        int add = test.add();

        int sum = 100;
        for (int i = 1; i <= add; i++) {
            sum += i;
        }
    }

    public int add() {
        int sum = sum();
        return sum;
        //return sum();
    }

    public int sum() {
        int a = 1;
        int b = 2;
        return a + b;
    }
}
