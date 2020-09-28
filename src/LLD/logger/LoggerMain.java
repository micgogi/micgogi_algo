package LLD.logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/27/2020  5:51 PM
 * Rahul Gogyani
 */
public class LoggerMain {
    public static void main(String args[]) {
        final LogClient logger = new LoggerClientImplementation();
        logger.start("1", 1);
        logger.poll();
        logger.start("3", 2);
        logger.poll();
        logger.end("1");
        logger.poll();
        logger.start("2", 3);
        logger.poll();
        logger.end("2");
        logger.poll();
        logger.end("3");
        logger.poll();
        logger.poll();
        logger.poll();

    }
}

