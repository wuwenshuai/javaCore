package con.carry.设计模式.工厂模式.abst;

import con.carry.设计模式.工厂模式.Milk;

/**
 * Created by wuwenshuai on 2019/9/22.
 */
public abstract class AbstractFactory {

    //把公共的逻辑抽取出来，便于管理和维护

    public abstract  Milk getYili();
    public abstract  Milk getMengLong();
}
