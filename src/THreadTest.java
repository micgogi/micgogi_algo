import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Micgogi
 * on 4/13/2020  11:45 PM
 * Rahul Gogyani
 */
public class THreadTest {
    public static void main(String[] args) {
        int coreCounts = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCounts);
        ExecutorService executorService = Executors.newFixedThreadPool(coreCounts);

        for (int i = 0; i < 100; i++) {
            executorService.execute(new Task());
        }

    }
}

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
