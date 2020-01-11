package con.carry.源码专题.spring.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by wuwenshuai on 2019/12/3.
 * <p>
 * 创建一个切面类
 */

@Component
@Aspect
public class CarryAspectj {


    // 让aop拦截所有的service类

    @Pointcut("execution(* con.carry.源码专题.spring.pojo..*.*(..))")
    public void poittCut() {

    }

    @Before("poittCut()")
    public void before() {
        System.out.println("before---");
    }

}
