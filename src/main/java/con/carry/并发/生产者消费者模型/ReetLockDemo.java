package con.carry.并发.生产者消费者模型;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现线程交替加一和减一操作,循环十次
 */
public class ReetLockDemo {

    public static void main(String[] args) {


        ShareData shareData = new ShareData();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                shareData.increment();
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                shareData.decrement();
            }
        }, "B").start();
    }
}


class ShareData {


    private int num = 0;

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() {
        lock.lock();
        try {
            //判断!
            while (num != 0) {
                condition.await();
            }
            //干活
            num++;
            System.out.println(Thread.currentThread().getName() + ":" + num);
            // 通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    public void decrement() {
        lock.lock();
        try {
            //判断!
            while (num == 0) {
                condition.await();
            }
            //干活
            num--;
            System.out.println(Thread.currentThread().getName() + ":" + num);
            // 通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }


}