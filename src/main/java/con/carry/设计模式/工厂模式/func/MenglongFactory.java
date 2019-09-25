package con.carry.设计模式.工厂模式.func;

import con.carry.设计模式.工厂模式.Milk;
import con.carry.设计模式.工厂模式.MongLong;

/**
 * Created by wuwenshuai on 2019/9/22.
 */
public class MenglongFactory implements Factory {
    public Milk getMilk() {
        //这里会处理一系列的业务逻辑，最终生产出蒙牛牛奶
        return new MongLong();
    }
}
