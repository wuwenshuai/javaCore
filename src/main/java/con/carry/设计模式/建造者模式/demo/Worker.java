package con.carry.设计模式.建造者模式.demo;

/**
 * Created by wuwenshuai on 2020/1/6.
 */
public class Worker extends Builder{

    private Product product;
    public Worker() {
        product = new Product();
    }
    @Override
    public void builderA() {
        product.setBuilderA("A");
        System.out.println("A");
    }

    @Override
    public void builderB() {
        product.setBuilderA("B");
        System.out.println("B");
    }

    @Override
    public void builderC() {
        product.setBuilderA("C");
        System.out.println("C");
    }

    @Override
    public void builderD() {
        product.setBuilderA("D");
        System.out.println("D");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
