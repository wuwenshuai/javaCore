package con.carry.设计模式.建造者模式.demo;

/**
 * Created by wuwenshuai on 2020/1/6.
 */
//指挥构建工程
public class Director {

    public Product builder(Builder builder) {
        builder.builderA();
        builder.builderB();
        builder.builderC();
        builder.builderD();
        return builder.getProduct();
    }
}
