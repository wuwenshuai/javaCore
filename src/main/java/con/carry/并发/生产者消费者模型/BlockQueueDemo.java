package con.carry.并发.生产者消费者模型;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 阻塞队列版的生产者与消费者
 */
public class BlockQueueDemo {

    public static void main(String[] args) throws InterruptedException {


        MyShareData myShareData = new MyShareData(new ArrayBlockingQueue<>(10 ));
        new Thread(() -> {
            try {
                myShareData.product();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"a").start();

        new Thread(() -> {
            try {
                myShareData.consumer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"b").start();

        Thread.sleep(5000);
        System.out.println("大老板叫停了，不要生产了");
        myShareData.stop();
    }

}

class MyShareData {


    private volatile boolean flag = true;

    private AtomicInteger atomicInteger = new AtomicInteger();

    //这里要用接口，保证方法的通用性

    private BlockingQueue<String> blockingQueue = null;

    public MyShareData(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    // 生产消息
    public void product() throws Exception {
        // 能不再while循环里面定义变量就不要定义
        boolean offer;
        String data = null;
        while (flag) {
            //对数据加1
            data = atomicInteger.incrementAndGet()+"";
            //生产
            offer = blockingQueue.offer(atomicInteger+"", 2L, TimeUnit.SECONDS);
            if (offer) {
                System.out.println(Thread.currentThread().getName()+"生产消息:"+atomicInteger);
            }else {
                System.out.println("记录日志：生产消息失败");
            }
            Thread.sleep(1000);
        }
        System.out.println("不生产了，叫停了");
    }

    // 消费消息
    public void consumer() throws Exception {
        String poll= null;
        while (flag) {
             poll = blockingQueue.poll(2, TimeUnit.SECONDS);
            if (poll == null) {
                flag = false;
                System.out.println("超过两秒没有获取到数据......");
                return;
            }
            System.out.println(Thread.currentThread().getName()+"消费消息:"+poll);
            Thread.sleep(1000);
        }
    }

    //停止生产
    public void stop() {
        this.flag = false;
    }

}
