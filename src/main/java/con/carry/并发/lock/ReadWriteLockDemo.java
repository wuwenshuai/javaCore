package con.carry.并发.lock;

import java.util.HashMap;
import java.util.Map;

public class ReadWriteLockDemo {


    public static void main(String[] args) {

        Mycache mycache = new Mycache();

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    mycache.put(finalI +"", finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, i + "").start();
        }

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    mycache.get(finalI +"");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, i + "").start();
        }
    }
}


class Mycache {


    private volatile Map<String, Object> cache = new HashMap<>();

    public void get(String key) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "    正在读取");
        Thread.sleep(300);
        System.out.println(Thread.currentThread().getName() + "    读取完成" + key);
    }

    public void put(String key, Object value) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "    正在写入" + value);
        cache.put(key, value);
        Thread.sleep(300);
        System.out.println(Thread.currentThread().getName() + "    写入完成");
    }

}