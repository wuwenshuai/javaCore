package con.carry.设计模式.策略模式;

/**
 * Created by wuwenshuai on 2019/9/25.
 */
public enum  PayType {

    AliPay(new AliPay()),
    WeiXinPay(new WexinPay());
    private Payment payment;
    PayType(Payment payment) {
        this.payment = payment;
    }
    public Payment getPayment(){
        return this.payment;
    }
}
