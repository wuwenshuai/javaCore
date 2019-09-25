package con.carry.设计模式.工厂模式.func;

import con.carry.设计模式.工厂模式.Milk;
import con.carry.设计模式.工厂模式.YiLi;

/**
 * Created by wuwenshuai on 2019/9/22.
 */
public class YiliFactory implements Factory {
    public Milk getMilk() {
        return new YiLi();
    }
}
