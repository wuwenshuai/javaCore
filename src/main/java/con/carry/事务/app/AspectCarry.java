package con.carry.事务.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by wuwenshuai on 2019/11/25.
 */

@Component
@Aspect
public class AspectCarry {

    @Pointcut("execution(* con.carry.事务.dao..*.*(..))")
    public void pointCut(){

    }


    @Before("pointCut()")
    public void befor(){
        System.out.println("proxy before");
    }
}
