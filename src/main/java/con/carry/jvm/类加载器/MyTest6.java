package con.carry.jvm.类加载器;

/**
 * Created by wuwenshuai on 2019/9/20.
 */
public class MyTest6 {
    public static void main(String[] args) {
        Single instance = Single.getInstance();
        System.out.println("a:" + Single.a);
        System.out.println("b:" + Single.b);
    }
}
class Single {
    public static int a = 1;
   // public static int b = 0;
    private static Single single = new Single();
    private Single() {
        a++;
        b++;
        System.out.println(a);
        System.out.println(b);
    }
    public static int b = 0;

    public static Single getInstance() {
        return single;
    }
}
