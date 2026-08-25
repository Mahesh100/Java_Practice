package MultiThreading.ExecutorFramework.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> {
            System.out.println("Thread 1 is running");
        });
    }
}
