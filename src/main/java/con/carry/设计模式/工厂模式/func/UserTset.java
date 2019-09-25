package con.carry.设计模式.工厂模式.func;

/**
 * Created by wuwenshuai on 2019/9/22.
 */
public class UserTset {
    public static void main(String[] args) {
        //用户想要伊利牛奶
        Factory yiliFactory = new YiliFactory();
        System.out.println(yiliFactory);
    }
}
