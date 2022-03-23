package org.fenixsoft.lagou;

/**
 * Created by backend.
 */

public class A {

  private B b = new B();

  public static void main(String[] args) {
    A a = new A();
    long num = 4321;

    long ret = a.b.test(num);

    System.out.println(ret);
  }
}
