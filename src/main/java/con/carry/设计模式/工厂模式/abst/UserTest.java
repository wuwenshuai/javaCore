package con.carry.设计模式.工厂模式.abst;

import con.carry.设计模式.工厂模式.Milk;

/**
 * Created by wuwenshuai on 2019/9/22.
 */
public class UserTest {

    public static void main(String[] args) {
        //用户创建伊利牛奶,只需要直接从工厂里面获取就行，不需要做别的事情
        MilkFactory milkFactory = new MilkFactory();
        Milk yili = milkFactory.getYili();
        System.out.println(yili);
    }
}
