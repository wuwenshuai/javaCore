package con.carry.动态代理源码分析.test;


import con.carry.动态代理源码分析.dao.LubanDao;
import con.carry.动态代理源码分析.dao.LubanDaoImpl;
import con.carry.动态代理源码分析.proxy.ProxyUtil;

import java.lang.reflect.Proxy;


public class Test {
    public static void main(String[] args) {

        LubanDao proxy = (LubanDao) ProxyUtil.newInstance(new LubanDaoImpl());
        proxy.query();

    }
}
