package con.carry.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by wuwenshuai on 2019/10/25.
 */

@Component
@Aspect
public class CarryAspect {

    @Pointcut("execution(* con.carry.aop.*.*(..))")
    public void poittCut(){

    }

    @Before("poittCut()")
    public void before(){
        System.out.println("before---");
    }



}
