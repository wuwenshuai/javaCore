package con.carry.设计模式.代理模式.动态代理;

import con.carry.设计模式.代理模式.Person;

/**
 * Created by wuwenshuai on 2019/9/24.
 */
public class Son implements Person{


    @Override
    public void findLove() {
        System.out.println("我想要找一个肤白貌美大长腿的对象，然而我没有时间，我要找人帮我找");
    }


}

