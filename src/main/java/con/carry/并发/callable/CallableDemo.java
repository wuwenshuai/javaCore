package con.carry.并发.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 查看电脑核数
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        Thread thread = new Thread(futureTask, "aa");
        thread.start();
        while (!futureTask.isDone()) {

        }
        // 如果没有计算完，会阻塞主线程,一般get方法放在最后
        Integer integer = futureTask.get();
        System.out.println("------");
        System.out.println(integer);
    }
}

class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        Thread.sleep(5000);
        return 1024;
    }
}
