package con.carry.设计模式.策略模式;

/**
 * Created by wuwenshuai on 2019/9/25.
 */
public class Order {

    void pay(PayType payType){

        payType.getPayment().pay();
    }
}
