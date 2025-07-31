package school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounter;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerCounter implements SiteVisitCounter {
    private final AtomicInteger count = new AtomicInteger(0);
    @Override
    public void incrementVisitCount() {
        try {
            Thread.sleep(100);
            count.incrementAndGet();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int getVisitCount() {
       return count.get();
    }
}
