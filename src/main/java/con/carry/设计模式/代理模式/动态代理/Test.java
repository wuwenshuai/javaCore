package con.carry.设计模式.代理模式.动态代理;

import con.carry.设计模式.代理模式.Person;

/**
 * Created by wuwenshuai on 2019/9/24.
 */
public class Test {
    public static void main(String[] args) {

        Person person = (Person) new MeiPoProxy().getInstance(new Son());
        person.findLove();


    }
}
