package con.carry.设计模式.建造者模式.demo;

/**
 * Created by wuwenshuai on 2020/1/6.
 */
public class TestDemo {

    public static void main(String[] args) {
        Director director = new Director();
        director.builder(new Worker());
    }

}
