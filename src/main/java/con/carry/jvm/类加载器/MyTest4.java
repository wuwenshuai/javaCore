package con.carry.jvm.类加载器;

/**
 * Created by wuwenshuai on 2019/9/20.
 */
public class MyTest4 {
    public static void main(String[] args) {
        Parent4[] parent4 = new Parent4[1];
        System.out.println(parent4.getClass());
    }
}

class Parent4 {
    static {
        System.out.println("parent");
    }
}
