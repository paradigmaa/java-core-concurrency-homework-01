package school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounter;

public class VolatileCounter implements SiteVisitCounter {
     private volatile int count = 0;

    @Override
    public void incrementVisitCount() {
        this.count++;
    }

    @Override
    public int getVisitCount() {
        return this.count;
    }
}
