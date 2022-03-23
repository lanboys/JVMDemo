package org.fenixsoft.classloading;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 蓝兵 on 2019/12/26.
 * <p>
 * 类加载器与instanceof关键字演示
 */
public class ClassLoaderTest {

  public static void main(String[] args) throws Exception {
    ClassLoader classLoader = String.class.getClassLoader();
    ClassLoader classLoader1 = ClassLoaderTest.class.getClassLoader();

    System.out.println("obj.getClass()");
    ClassLoader myLoader = new ClassLoader() {
      @Override
      public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
          String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
          InputStream is = getClass().getResourceAsStream(fileName);
          if (is == null) {
            return super.loadClass(name);
          }
          byte[] b = new byte[is.available()];
          is.read(b);
          return defineClass(name, b, 0, b.length);
        } catch (IOException e) {
          throw new ClassNotFoundException(name);
        }
      }
    };

    Class<?> aClass = myLoader.loadClass("org.fenixsoft.classloading.ClassLoaderTest");
    Object obj = aClass.newInstance();

    Class<?> aClass1 = obj.getClass();
    Class<ClassLoaderTest> aClass2 = ClassLoaderTest.class;

    ClassLoader classLoader2 = aClass1.getClassLoader();

    ClassLoader classLoader3 = aClass2.getClassLoader();

    System.out.println(aClass1);

    System.out.println(obj instanceof org.fenixsoft.classloading.ClassLoaderTest);
  }
}