package con.carry.设计模式.策略模式;

/**
 * Created by wuwenshuai on 2019/9/25.
 */
public class WexinPay implements Payment {
    @Override
    public void pay() {
        System.out.println("微信pay。。。。");
    }
}
