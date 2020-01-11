package con.carry.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wuwenshuai on 2019/10/25.
 */


@Service("indexServiceImpl")
public class IndexServiceImpl implements BaseService {


    @Override
    public void query() {
        System.out.println("service");
    }
}
