package con.carry.源码专题.spring.controller;

import con.carry.源码专题.spring.config.Config;
import con.carry.源码专题.spring.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wuwenshuai on 2019/10/24.
 */
public class Demo {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Service testService = (Service) applicationContext.getBean("testService");
        testService.test1();
    }
}
