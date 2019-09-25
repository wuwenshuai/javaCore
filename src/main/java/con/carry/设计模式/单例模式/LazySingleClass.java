package con.carry.设计模式.单例模式;

/**
 * Created by wuwenshuai on 2019/9/23.
 */
public class LazySingleClass {

    //懒汉模式:用到才会始化，线程不安全

    private LazySingleClass(){

    }
    public static  LazySingleClass singleClass = null;

    //提供一个外届访问的方法
    public static LazySingleClass getInstance(){
        if (singleClass == null) {
            singleClass = new LazySingleClass();
        }
        return singleClass;
    }


}
