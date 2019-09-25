package con.carry.jvm.类加载器;

/**
 * Created by wuwenshuai on 2019/9/21.
 */
public class MyTest7 {

    public static void main(String[] args) {
        Class<MyTest> myTestClass = MyTest.class;
        System.out.println(myTestClass.getClassLoader());
    }
}
