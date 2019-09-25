package con.carry.设计模式.单例模式;

/**
 * Created by wuwenshuai on 2019/9/23.
 */
public class DclSingleClass {

    //双重校验锁模式：DCL：double-checked locking
    private DclSingleClass(){

    }
    public static  volatile DclSingleClass dclSingleClass;

    //提供一个外界访问的方法
    public static DclSingleClass getInstance(){
        if (dclSingleClass == null) {
            synchronized (DclSingleClass.class){
                if (dclSingleClass == null) {
                    dclSingleClass = new DclSingleClass();
                }
            }
        }
        return dclSingleClass;
    }
}
