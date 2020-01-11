package con.carry.设计模式.建造者模式.demo2;

/**
 * Created by wuwenshuai on 2020/1/6.
 */
public class Work extends Builder {

    private Product product;
    public  Work(){
        product = new Product();
    }
    @Override
    Builder builderA(String msg) {
        product.setBuilderA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuilderB(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuilderC(msg);
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setBuilderD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
