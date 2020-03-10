package con.carry.源码专题.spring.service;

import org.springframework.stereotype.Component;

/**
 * Created by wuwenshuai on 2019/12/5.
 */

@Component
public class IndexService  implements Service{
    @Override
    public void test1() {
        System.out.println("index service");
    }
}
