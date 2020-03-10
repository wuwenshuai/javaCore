package con.carry.并发.Volatile;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuwenshuai on 2019/10/17.
 */
public class ReadAndUpdateDemo {


    private static final int max = 20;
    private static volatile int init_cache = 0;

    public static void main(String[] args) {

        new Thread(() -> {
            int localData = init_cache;
            while (init_cache < max) {
                if (localData != init_cache) {
                    System.out.println("reder:" + init_cache);
                    localData = init_cache;
                }
            }
        }).start();

        new Thread(() -> {
            int localData = init_cache;
            while (init_cache < max) {
                init_cache++;
                System.out.println("update:" + init_cache);
                try {
                    TimeUnit.SECONDS.sleep(2);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }).start();

    }
}
