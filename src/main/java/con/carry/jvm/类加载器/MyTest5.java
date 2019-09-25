package con.carry.jvm.类加载器;

/**
 * Created by wuwenshuai on 2019/9/20.
 */
public class MyTest5 {

    public static void main(String[] args) {
        System.out.println(child5.b);
    }

}

interface Parent5 {

}

interface child5 extends Parent5 {
    int b = 6;
}
