package con.carry.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wuwenshuai on 2019/10/25.
 */

@Configuration
@ComponentScan("con")
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AopConfig {
}
