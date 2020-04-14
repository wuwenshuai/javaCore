package con.carry.并发.lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁：是指尝试获取锁的线程不会立即阻塞，而是采取循环的方式去尝试获取锁，可以减少线程上下文的切换的消耗，但是有点消耗cpu
 *
 * 自旋的好处：循环比较获取到成功为止，没有类似wait的阻塞
 */
public class SpinLock {

    //原子引用线程
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    public static void main(String[] args) throws Exception{
        SpinLock lock = new SpinLock();
        new Thread(() -> {
            lock.myLock();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.myUnlock();
        },"t1").start();
        Thread.sleep(1000);
        new Thread(() -> {
            lock.myLock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.myUnlock();
        },"t2").start();
    }

    public void myLock() {
        Thread thread = Thread.currentThread() ;
        System.out.println(Thread.currentThread().getName() + " --- come in ");
        // 程序第一次进来的时候，atomicReference里面的thread肯定是null，我就要把当前线程设置进去，返回true
        // 取反变为false，跳出循环
        while (!atomicReference.compareAndSet(null, thread)) {
        }

        //如果当第一个线程的锁还没释放，第二个线程进来了，希望是null，但是不是，此时线程是t1，他就会一直在while循环
        //一直等待，尝试获取线程
    }

    public void myUnlock() {
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread, null);
        System.out.println(Thread.currentThread().getName() + " --- unlock ");
    }
}
