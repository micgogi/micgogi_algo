package LLD.logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 9/27/2020  5:40 PM
 * Rahul Gogyani
 */
public class LoggerClientImplementation implements LogClient {
    private final Map<String, Process> processes;
    private final TreeMap<Long, Process> queue;

    public LoggerClientImplementation() {
        this.processes = new HashMap<>();
        this.queue = new TreeMap<>();
    }

    @Override
    public void start(String processId) {
        final long now = System.currentTimeMillis();
        final Process process = new Process(processId, now);
        processes.put(processId, process);
        queue.put(now, process);
    }

    @Override
    public void end(String processId) {
        final long now = System.currentTimeMillis();
        processes.get(processId).setEndTime(now);
    }

    @Override
    public void poll() {
        if(queue.isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        final Process process = queue.firstEntry().getValue();
        if (process.getEndTime() != -1) {
            System.out.println(process.getId() + " started at " + process.getStartTime() + " and ended at " + process.getEndTime());
            processes.remove(process.getId());
            queue.pollFirstEntry();
        }else{
            System.out.println("No completed Task in queue "+queue.size());
        }
    }
}

