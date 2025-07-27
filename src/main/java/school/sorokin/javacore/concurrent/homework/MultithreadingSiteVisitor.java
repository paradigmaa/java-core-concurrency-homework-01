package school.sorokin.javacore.concurrent.homework;

import java.util.ArrayList;
import java.util.List;

public class MultithreadingSiteVisitor {
    private final SiteVisitCounter siteVisitCounter;
    private  final List<Thread> threads = new ArrayList<>();
    private long start = 0;
    private long end = 0;

    public MultithreadingSiteVisitor(SiteVisitCounter siteVisitCounter) {
        this.siteVisitCounter = siteVisitCounter;
    }

    public void visitMultithread(int numOfThreads) {
        start = System.nanoTime();
        for (int i = 0; i < numOfThreads; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    siteVisitCounter.incrementVisitCount();
                }
            });
            thread.start();
            threads.add(thread);
        }
    };

    public void waitUntilAllVisited() {
        for (Thread thread : threads) {
            try {
                System.out.println("Поток " + thread.getName() + " выполняется");
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        end = System.nanoTime();
    }

    public int getTotalTimeOfHandling() {
        System.out.println((end - start) / 1_000_000_000.0);
        return siteVisitCounter.getVisitCount();
    }
}
