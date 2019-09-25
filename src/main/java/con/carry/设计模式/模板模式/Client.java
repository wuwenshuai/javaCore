package con.carry.设计模式.模板模式;

/**
 * Created by wuwenshuai on 2019/9/25.
 */
public class Client {

    public static void main(String[] args) {
        //模板模式：
        //主要解决了一些通用的方法，却在每一个子类都要重新写这一方法
        //何时使用：有一些通用的方法
        //如何解决：将这些通用的算法抽取出来，注意，为防止恶意操作，一般的模板方法加上final关键字
        //关键代码：在抽象类实现，其他步骤在子类实现
        //优点：封装不变的部分，扩展可变的部分，行为父类控制，子类实现
        //使用场景：有多个子类共有的方法，且逻辑相同

        Game game = new BaskBallGame();
        game.play();

        game = new FootBallGame();
        game.play();
    }
}
