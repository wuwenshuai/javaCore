package con.carry.jvm.类加载器;

import java.util.UUID;

/**
 * Created by wuwenshuai on 2019/9/20.
 */

/**
 * 当一个常量在编译器
 */
public class MyTest2 {

    public static void main(String[] args) {
        System.out.println(Parent2.a);

    }
}

class Parent2 {
    public static final String a = UUID.randomUUID().toString();

    static {
        System.out.println("parent2");
    }
}
