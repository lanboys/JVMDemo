package org.fenixsoft.clazz;

public class StringTest {

    static String s0 = "abc1";
    static StringTest cc = new StringTest();
    int a = 5;

    public static void main(String[] args) {
        String s1 = "abc1";
        String s2 = "abc1";
        boolean x00 = s1 == s0;
        boolean x0 = s1 == s2;

        int x = 1;
        String s3 = "abc" + x;
        boolean x1 = s1 == s3;

        char[] chars = new char[]{'a', 'b', 'c', '1'};

        String s4 = s3.intern();
        boolean x2 = s1 == s4;
        boolean x3 = s1 == s3;

        String tt = new String(chars);
        boolean x4 = tt == s1;
        String s = new String(tt);
        boolean x5 = tt == s;
        String intern = s.intern();
        boolean x6 = intern == s1;
        System.out.println("main(): ");
    }
}
