package org.fenixsoft.lagou;

/**
 * Created by backend.
 */

public class B {

  private int a = 1234;
  static long C = 1111;

  public long test(long num) {
    long ret = this.a + num + C;
    return ret;
  }
}