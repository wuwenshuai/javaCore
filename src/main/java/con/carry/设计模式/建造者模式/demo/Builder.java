package con.carry.设计模式.建造者模式.demo;

/**
 * Created by wuwenshuai on 2020/1/6.
 */
public abstract class Builder {

    public abstract void builderA();
    public abstract void builderB();
    public abstract void builderC();
    public abstract void builderD();

    //得到产品
    abstract Product getProduct();
}
