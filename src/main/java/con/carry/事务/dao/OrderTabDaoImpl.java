package con.carry.事务.dao;

import org.springframework.stereotype.Component;

/**
 * Created by wuwenshuai on 2019/11/25.
 */

@Component
public class OrderTabDaoImpl implements OrderTabDao{
    @Override
    public void getOrder() {
        System.out.println("order dao");
    }
}
