package school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounter;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerCounter implements SiteVisitCounter {
    AtomicInteger count = new AtomicInteger(0);
    @Override
    public void incrementVisitCount() {
        count.incrementAndGet();
    }

    @Override
    public int getVisitCount() {
        return count.getAndIncrement();
    }
}
