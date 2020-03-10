package con.carry.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * Created by wuwenshuai on 2019/10/25.
 */
public class Demo {

    public static void main(String[] args) throws Exception {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        BaseService baseService = (BaseService) applicationContext.getBean("indexServiceImpl");
      //  IndexServiceImpl baseService1 = (IndexServiceImpl) applicationContext.getBean("indexServiceImpl");



        System.out.println(baseService instanceof IndexServiceImpl);
        System.out.println(baseService instanceof Proxy);
        baseService.query();

        byte[] carries = ProxyGenerator.generateProxyClass("Carry", new Class[]{BaseService.class});
        //把字节数组写到一个class文件
        FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/oldshuai/Desktop/test/a.class"));
        fileOutputStream.write(carries);
    }
}
