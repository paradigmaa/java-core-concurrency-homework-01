package school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounter;

public class SynchronizedBlockCounter implements SiteVisitCounter {
    private Integer count = 0;

    @Override
    public synchronized void incrementVisitCount() {
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        this.count++;
    }

    @Override
    public synchronized int getVisitCount() {
        try {
            Thread.sleep(100);
            return this.count;
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
