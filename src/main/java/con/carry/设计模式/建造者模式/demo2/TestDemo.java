package con.carry.设计模式.建造者模式.demo2;

/**
 * Created by wuwenshuai on 2020/1/6.
 */
public class TestDemo {
    public static void main(String[] args) {

        Work work = new Work();
        Product product = work.getProduct();
        System.out.println(product);
        work.builderA("1").builderB("2").builderC("3").builderD("4");
    }
}
