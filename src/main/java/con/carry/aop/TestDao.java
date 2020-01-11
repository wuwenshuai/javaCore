package con.carry.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * Created by wuwenshuai on 2019/10/25.
 */

@Repository
public class TestDao {


    public void test(){
        System.out.println("test");
    }


}
