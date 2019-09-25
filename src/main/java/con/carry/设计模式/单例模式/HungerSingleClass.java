package con.carry.设计模式.单例模式;

/**
 * Created by wuwenshuai on 2019/9/23.
 */
public class HungerSingleClass {

    //恶汉模式:一上来就会加载,线程安全

    private HungerSingleClass(){

    }
    public static final HungerSingleClass HUNGER_SINGLE_CLASS = new HungerSingleClass();

    //提供一个外界访问的方法
    public static HungerSingleClass getInstance(){
        return HUNGER_SINGLE_CLASS;
    }

}
