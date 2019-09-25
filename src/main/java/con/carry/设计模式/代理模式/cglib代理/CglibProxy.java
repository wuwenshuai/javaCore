package con.carry.设计模式.代理模式.cglib代理;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by wuwenshuai on 2019/9/24.
 */
public class CglibProxy {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        //设置回调所需要的拦截器
        enhancer.setCallback(new MyMethodInterceptor());
        PersonService personService = (PersonService) enhancer.create();
        System.out.println(personService.sayHello("pjmike"));
    }
}
