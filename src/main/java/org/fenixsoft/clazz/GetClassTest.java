package org.fenixsoft.clazz;

/**
 * Created by 蓝兵 on 2020/1/2.
 */

public class GetClassTest {

    public GetClassTest() {
    }

    public static void main(String[] args) {
        GetClassTest obj = new GetClassTest();
        String name7 = obj.getName();
        String className = obj.getClass().getName();
        obj.setName(className);
        //
        //String name = Object.class.getName();
        //String name1 = void.class.getName();
        //String name2 = boolean.class.getName();
        //String name3 = int[].class.getName();
        //String name4 = int[][].class.getName();
        //String name5 = Object[].class.getName();
        //String name6 = Object[][].class.getName();
    }

    private String name;
    private int age;

    public int getAge1() {
        int a = age;
        age = a + 5;
        return age;
    }

    public int getAge() {
        age += 5;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
