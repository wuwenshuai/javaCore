package con.carry.设计模式.策略模式;

/**
 * Created by wuwenshuai on 2019/9/25.
 */
public class Client {
    public static void main(String[] args) {
        Order o = new Order();
        o.pay(PayType.AliPay);
        o.pay(PayType.WeiXinPay);
    }
}
