package school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounter;

public class UnsynchronizedCounter implements SiteVisitCounter {

    private int count = 0;

    @Override
    public void incrementVisitCount() {
        this.count++;
    }

    @Override
    public int getVisitCount() {
        return this.count;
    }
}
