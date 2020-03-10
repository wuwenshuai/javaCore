package con.carry.并发.Synchronized;

/**
 * Created by wuwenshuai on 2019/10/15.
 */
public class TicketDemo extends Thread{

    private static int index = 1;
    private static final int max = 50;

    @Override
    public void run() {
        synchronized (this) {
            while (index <= max) {
                System.out.println(Thread.currentThread().getName()+"叫到的号码是："+(index++));
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        for (int i =0; i<10; i++) {
            new TicketDemo().start();
        }
    }
}
