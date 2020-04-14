package con.carry.并发.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁：线程可以进入一个他已经拥有锁的所有同步代码块
 */
public class ReenterLockDemo {

    public static void main(String[] args) {

        Phone phone = new Phone();
        //线程操作资源类
        new Thread(() -> {
            phone.sendMsg();
        },"t1").start();

        new Thread(() -> {
            phone.sendMsg();
        },"t2").start();

        new Thread(() -> {
            phone.get();
        },"t3").start();

        new Thread(() -> {
            phone.get();
        },"t4").start();
    }

}

class Phone implements Runnable{


    public synchronized void sendMsg() {
        System.out.println(Thread.currentThread().getName()+"------sendMsg");
        sendEmail();
    }

    public synchronized void sendEmail() {
        System.out.println(Thread.currentThread().getName()+"------sendEmail");
    }

    @Override
    public void run() {
        get();
    }

    Lock lock = new ReentrantLock();
    public void get() {
        lock.lock();
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"------get");
        set();
        lock.unlock();
        lock.unlock();
    }

    public void set() {
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"------set");
        lock.unlock();
    }
}