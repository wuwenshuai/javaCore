package con.carry.设计模式.建造者模式.demo2;

/**
 * Created by wuwenshuai on 2020/1/6.
 */
public abstract class Builder {

    abstract Builder builderA(String msg);
    abstract Builder builderB(String msg);
    abstract Builder builderC(String msg);
    abstract Builder builderD(String msg);
    abstract Product getProduct();
}
