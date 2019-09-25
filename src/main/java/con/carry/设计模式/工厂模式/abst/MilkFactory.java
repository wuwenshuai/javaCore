package con.carry.设计模式.工厂模式.abst;

import con.carry.设计模式.工厂模式.Milk;
import con.carry.设计模式.工厂模式.MongLong;
import con.carry.设计模式.工厂模式.YiLi;

/**
 * Created by wuwenshuai on 2019/9/22.
 */
public class MilkFactory extends AbstractFactory{
    public Milk getYili() {
        return new YiLi();
    }

    public Milk getMengLong() {
        return new MongLong();
    }
}
