package con.carry.设计模式.策略模式;

/**
 * Created by wuwenshuai on 2019/9/25.
 */
public class Client {
    public static void main(String[] args) {

        //策略模式：定义一些列的算法，把他们一个个封装起来，并且他么可以相互替换
        //主要解决：在有许多算法相试的情况下，使用if else难以维护的问题
        //何时使用：一个系统有许多类，而只区分它们的只是它们的直接行为
        //如何解决：将这些算法封装成一个个的类，任意的替换
        //关键代码：实现同一个接口
        //优点：算法可以任意的切换
        //缺点：策略类会增多，也要对外暴露

        Order o = new Order();
        o.pay(PayType.AliPay);
        o.pay(PayType.WeiXinPay);
    }
}
