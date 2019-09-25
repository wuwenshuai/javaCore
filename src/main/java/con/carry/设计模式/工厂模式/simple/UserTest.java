package con.carry.设计模式.工厂模式.simple;

import con.carry.设计模式.工厂模式.Milk;

/**
 * Created by wuwenshuai on 2019/9/22.
 */
public class UserTest {

    public static void main(String[] args) {

        //用户直接使用工厂类创建自己想要的就可以
        SimpleFactory simpleFactory = new SimpleFactory();
        //比如用户想要伊利的牛奶
        Milk yiliMilk = simpleFactory.getMilk("伊利");
        System.out.println(yiliMilk);
    }
}
