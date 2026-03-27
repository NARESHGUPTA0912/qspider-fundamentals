package MultiThreading.threadPool;

import java.util.concurrent.*;
public class ThreadDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 5; i++) {
            int task = i;
            executor.submit(() -> {
                System.out.println("Task " + task + " executed by "+Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}