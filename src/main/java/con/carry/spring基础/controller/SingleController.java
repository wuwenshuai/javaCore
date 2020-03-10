package con.carry.spring基础.controller;


import con.carry.spring基础.config.Spring;
import con.carry.spring基础.service.SingleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class SingleController {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring.class);
        SingleService bean = applicationContext.getBean(SingleService.class);
        bean.dao();

        SingleService bean1 = applicationContext.getBean(SingleService.class);
        bean1.dao();

        SingleService bean2 = applicationContext.getBean(SingleService.class);
        bean2.dao();
    }
}
