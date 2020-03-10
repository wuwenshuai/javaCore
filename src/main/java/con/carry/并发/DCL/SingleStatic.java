package con.carry.并发.DCL;

/**
 * Created by wuwenshuai on 2019/10/21.
 */
public class SingleStatic {


    private SingleStatic(){

    }

    private static class StaticHandeler{
        private static SingleStatic instance = new SingleStatic();
    }

    public static SingleStatic getInstabce(){
        return StaticHandeler.instance;
    }


    public static void main(String[] args) {
        SingleStatic instabce = SingleStatic.getInstabce();
        SingleStatic instabce1 = SingleStatic.getInstabce();

        System.out.println(instabce == instabce1);
    }
}
