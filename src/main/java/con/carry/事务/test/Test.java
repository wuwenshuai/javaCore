package con.carry.事务.test;

import con.carry.事务.app.Config;
import con.carry.事务.dao.OrderTabDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wuwenshuai on 2019/11/25.
 */
public class Test {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        OrderTabDao bean = annotationConfigApplicationContext.getBean(OrderTabDao.class);
        bean.getOrder();
    }
}
