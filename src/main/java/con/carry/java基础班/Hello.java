package con.carry.java基础班;


/**
 * Created by wuwenshuai on 2019/9/16.
 */
public class Hello {
    public static void main(String[] args) {

        IUser user = new UserImpl();


        }

    }


 interface IUser{
    void add();
}
class UserImpl implements IUser{

    public void add() {
        System.out.println("add");
    }
}
