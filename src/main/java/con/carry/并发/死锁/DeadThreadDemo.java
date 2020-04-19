package con.carry.并发.死锁;


/**
 * 死锁是指两个以上的线程
 */
public class DeadThreadDemo {


    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        String lockA = "LockA";
        String lockB = "LockB";
        new Thread(() -> {
            shareData.say(lockA, lockB);
          },"A").start();

        new Thread(() -> {
            shareData.say(lockB, lockA);
        },"B").start();
    }

    // jps
}


class ShareData {
    public void say(String lockA, String lockB) {
        synchronized (lockA) {
            System.out.println("lockA 上锁了,尝试获取lockB" + lockB);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println("lockB 上锁了,尝试获取lockA" + lockA);
            }
        }
    }
}


