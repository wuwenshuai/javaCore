package con.carry.源码专题.spring.proxy;

import con.carry.源码专题.spring.config.Config;
import con.carry.源码专题.spring.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wuwenshuai on 2019/12/3.
 */
public class Demo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        Service bean = (Service) annotationConfigApplicationContext.getBean("testService");
        System.out.println(annotationConfigApplicationContext.containsBean("carryAspectj"));
        bean.test1();

    }
}
