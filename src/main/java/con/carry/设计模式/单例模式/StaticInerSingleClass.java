package con.carry.设计模式.单例模式;

/**
 * Created by wuwenshuai on 2019/9/23.
 */
public class StaticInerSingleClass {
    //静态内部类或者登记式的
    private StaticInerSingleClass() {

    }

    private static final StaticInerSingleClass STATIC_INER_SINGLE_CLASS = new StaticInerSingleClass();

    public static final StaticInerSingleClass getInstance() {
        return StaticInerSingleClass.STATIC_INER_SINGLE_CLASS;
    }
}
