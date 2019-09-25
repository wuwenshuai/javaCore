package con.carry.java基础班;

/**
 * Created by wuwenshuai on 2019/9/11.
 */
public class Demo extends A{

    public static void main(String[] args) {
        //new A().privateTest();
        new Demo().protectedTest();
        new Demo().publicTest();

    }
}

class A {
    public void publicTest() {

    }

    private void privateTest() {

        //该方法只能在本类使用，其余之类或者A类都无法访问
    }

    protected void protectedTest() {
        //子类可以访问

    }
}
