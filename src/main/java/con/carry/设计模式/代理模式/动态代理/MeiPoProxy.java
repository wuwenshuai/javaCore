package con.carry.设计模式.代理模式.动态代理;

import con.carry.设计模式.代理模式.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wuwenshuai on 2019/9/24.
 */
public class MeiPoProxy implements InvocationHandler{

    private Object target;

    // 代理对象持有目标对象的引用,实现InvocationHandler接口

    public Object getInstance(Person target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        // 获取目标用户的代理对象的
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.target, args);
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
        return result;
    }




}
