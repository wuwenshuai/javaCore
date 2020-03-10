package con.carry.spring基础.service;


import con.carry.spring基础.dao.ProtypeDao;
import con.carry.spring基础.dao.SingleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public  class SingleService {

    @Autowired
    private SingleDao singleDao;

    @Lookup
    public ProtypeDao protypeDao() {
        return null;
    }

    public void dao() {
        System.out.println("singleDao:"+singleDao.hashCode());
        System.out.println("protypeDao:"+protypeDao().hashCode());
    }
}
