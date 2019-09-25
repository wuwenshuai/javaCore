package con.carry.设计模式.工厂模式.simple;

import con.carry.设计模式.工厂模式.Milk;
import con.carry.设计模式.工厂模式.MongLong;
import con.carry.设计模式.工厂模式.YiLi;

/**
 * Created by wuwenshuai on 2019/9/22.
 */
public class SimpleFactory {

    public Milk getMilk(String name) {
        if ("蒙牛".equals(name)) {
            return new MongLong();
        }else if ("伊利".equals(name)) {
            return new YiLi();
        }else {
            System.out.println("我们不能生产该品牌的牛奶");
            return null;
        }
    }
}
