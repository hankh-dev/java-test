package org.example.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.submit(() -> {
            try {
                Thread.sleep(30000);
                System.out.println("Thread2 : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("Call shutdownNow!");
                e.printStackTrace();
            }
        });
        executorService2.shutdownNow();
    }
}
