package con.carry.并发.线程池;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {


        ExecutorService threadPool = Executors.newSingleThreadExecutor();  //工作线程

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 3, 3, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());

        try {
            for (int i = 0; i < 1000; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName());
                });
            }
        } catch (Exception e) {

        } finally {
            threadPool.shutdown();
        }


    }
}
