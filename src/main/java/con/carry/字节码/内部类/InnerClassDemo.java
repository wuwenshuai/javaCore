package con.carry.字节码.内部类;

/**
 * Created by wuwenshuai on 2019/12/30.
 */
public class InnerClassDemo {
    private static int i = 100;
    public static void main(String[] args) {
        //静态内部类
        new StaticInnerClass().print();
    }
    static class StaticInnerClass {
        public void print(){
            System.out.println(i);
        }
    }
}
