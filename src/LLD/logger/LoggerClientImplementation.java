package LLD.logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Micgogi
 * on 9/27/2020  5:40 PM
 * Rahul Gogyani
 */
public class LoggerClientImplementation implements LogClient {
    private final Map<String, Process> processes;
    private final ConcurrentSkipListMap<Long, Process> queue;
    private final List<CompletableFuture<Void>> futures;
    private final Lock lock;
    private final ExecutorService[] taskScheduler;

    public LoggerClientImplementation() {
        this.processes = new ConcurrentHashMap<>();
        this.queue = new ConcurrentSkipListMap<>();
        this.futures = new CopyOnWriteArrayList<>();
        this.lock = new ReentrantLock();
        this.taskScheduler = new ExecutorService[10];
        for (int i = 0; i < taskScheduler.length; i++) {
            taskScheduler[i] = Executors.newSingleThreadExecutor();
        }
    }

    @Override
    public void start(String processId, long timestamp) {
        taskScheduler[processId.hashCode() % taskScheduler.length].execute(() -> {
            final long now = System.currentTimeMillis();
            final Process process = new Process(processId, now);
            processes.put(processId, process);
            queue.put(now, process);
        });

    }

    @Override
    public void end(String processId) {
        taskScheduler[processId.hashCode() % taskScheduler.length].execute(() -> {
            lock.lock();
            try {
                final long now = System.currentTimeMillis();
                processes.get(processId).setEndTime(now);
                if (!futures.isEmpty() && queue.firstEntry().getValue().getId().equals(processId)) {
                    pollNow();
                    final var result = futures.remove(0);
                    result.complete(null);
                }
            } finally {
                lock.unlock();
            }
        });

    }

    @Override
    public String poll() {
        lock.lock();
        try {
            final var result = new CompletableFuture<Void>();
            if (!queue.isEmpty() && queue.firstEntry().getValue().getEndTime() != -1) {
                pollNow();
            } else {
                futures.add(result);
            }
            try {
                result.get(3, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new RuntimeException(e);
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    private String pollNow() {
        final Process process = queue.firstEntry().getValue();
        final var logStatement = process.getId() + " started at " + process.getStartTime() + " and ended at " + process.getEndTime();
        System.out.println(logStatement);
        processes.remove(process.getId());
        queue.pollFirstEntry();
        return logStatement;
    }
}

