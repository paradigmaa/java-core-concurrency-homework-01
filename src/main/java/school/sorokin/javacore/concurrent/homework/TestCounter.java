package school.sorokin.javacore.concurrent.homework;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack.*;

public class TestCounter {
    public void atomicIntegerCounterTest(int threads) {
        MultithreadingSiteVisitor multithreadingSiteVisitor = new MultithreadingSiteVisitor(new AtomicIntegerCounter());
        multithreadingSiteVisitor.visitMultithread(threads);
        multithreadingSiteVisitor.waitUntilAllVisited();
        System.out.println(multithreadingSiteVisitor.getTotalTimeOfHandling());
    }

    public void unsynchronizedCounterTest(int threads) {
        MultithreadingSiteVisitor multithreadingSiteVisitor = new MultithreadingSiteVisitor(new UnsynchronizedCounter());
        multithreadingSiteVisitor.visitMultithread(threads);
        multithreadingSiteVisitor.waitUntilAllVisited();
        System.out.println(multithreadingSiteVisitor.getTotalTimeOfHandling());
    }

    public void synchronizedBlockCounterTest(int threads) {
        MultithreadingSiteVisitor multithreadingSiteVisitor = new MultithreadingSiteVisitor(new SynchronizedBlockCounter());
        multithreadingSiteVisitor.visitMultithread(threads);
        multithreadingSiteVisitor.waitUntilAllVisited();
        System.out.println(multithreadingSiteVisitor.getTotalTimeOfHandling());
    }

    public void reentrantLockCounterTest(int threads) {
        MultithreadingSiteVisitor multithreadingSiteVisitor = new MultithreadingSiteVisitor(new ReentrantLockCounter());
        multithreadingSiteVisitor.visitMultithread(threads);
        multithreadingSiteVisitor.waitUntilAllVisited();
        System.out.println(multithreadingSiteVisitor.getTotalTimeOfHandling());
    }

    public void volatileCounterTest(int threads) {
        MultithreadingSiteVisitor multithreadingSiteVisitor = new MultithreadingSiteVisitor(new VolatileCounter());
        multithreadingSiteVisitor.visitMultithread(threads);
        multithreadingSiteVisitor.waitUntilAllVisited();
        System.out.println(multithreadingSiteVisitor.getTotalTimeOfHandling());
    }
}
