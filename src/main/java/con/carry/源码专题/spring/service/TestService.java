package con.carry.源码专题.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by wuwenshuai on 2019/10/24.
 */


@Service
public class TestService {

    @Autowired
    private IndexService indexService;
}
