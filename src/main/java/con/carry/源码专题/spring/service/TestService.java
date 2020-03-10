package con.carry.源码专题.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by wuwenshuai on 2019/10/24.
 */


@Component
public class TestService  implements Service{

    public TestService() {
        System.out.println("no");
    }

    @Autowired
    public TestService(IndexService indexService) {
        System.out.println("index----");
    }
    @Override
    public void test1() {
        System.out.println("testservice");
    }
}
