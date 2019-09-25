package con.carry.jvm.类加载器;

/**
 * Created by wuwenshuai on 2019/9/19.
 */
public class MyTest {

    public static void main(String[] args) {
        System.out.println(Child.a);
    }
}

class Child extends Parent {


    static {
        System.out.println("Child");
    }
}

class Parent {


    public static final String a = "111";

    static {
        System.out.println("parent");
    }
}
