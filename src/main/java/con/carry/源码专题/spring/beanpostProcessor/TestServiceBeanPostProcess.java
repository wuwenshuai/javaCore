package con.carry.源码专题.spring.beanpostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by wuwenshuai on 2019/11/15.
 */

//@Component
/*ublic class TestServiceBeanPostProcess implements BeanPostProcessor {


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("testService")) {
            System.out.println("postProcessAfterInitialization");

        }
        return bean;
    }

    // 在bean的初始化之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("testService")) {
            System.out.println("postProcessBeforeInitialization");

        }
        return bean;
    }
}*/
