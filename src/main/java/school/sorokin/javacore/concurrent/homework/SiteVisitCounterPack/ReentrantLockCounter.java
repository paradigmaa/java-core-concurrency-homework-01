package school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounter;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCounter implements SiteVisitCounter {

    private final ReentrantLock reentrantLock = new ReentrantLock();

    private int count = 0;

    @Override
    public void incrementVisitCount() {
        reentrantLock.lock();
        try {
            Thread.sleep(100);
            count++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public int getVisitCount() {
        reentrantLock.lock();
        try {
            Thread.sleep(100);
            return this.count;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
        }
    }
}
