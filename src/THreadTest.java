import org.omg.PortableInterceptor.SUCCESSFUL;

import java.util.concurrent.*;

/**
 * @author Micgogi
 * on 4/13/2020  11:45 PM
 * Rahul Gogyani
 */
public class THreadTest {
    public static void main(String[] args) {
        int coreCounts = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCounts);
        //Fixed Thread pools
        ExecutorService executorService = Executors.newFixedThreadPool(coreCounts);
        //CachedThreadPool
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        //ScheduledThreadPool
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        //task to run after 10 seconds delay
        scheduledExecutorService.schedule(new Task(),10, TimeUnit.SECONDS);
        //task to run repeatedly every 10 seconds
        scheduledExecutorService.scheduleAtFixedRate(new Task(),15,10,TimeUnit.SECONDS);
        //task to run repeatedly 10 seconds after previous task completes
        scheduledExecutorService.scheduleWithFixedDelay(new Task(),15,10,TimeUnit.SECONDS);

        //SingleThreadedExceutor


        for (int i = 0; i < 100; i++) {
         //   executorService.execute(new Task());
            executorService1.execute(new Task());
        }
        executorService.shutdown();
    }
}

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
