package school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounter;

public class VolatileCounter implements SiteVisitCounter {
     private volatile int count = 0;

    @Override
    public void incrementVisitCount() {
        try {
            Thread.sleep(100);
            this.count++;
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int getVisitCount() {
        return this.count;
    }
}
