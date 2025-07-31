package school.sorokin.javacore.concurrent.homework;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SiteVisitCounter> counters = List.of(
                new AtomicIntegerCounter(),
                new ReentrantLockCounter(),
                new SynchronizedBlockCounter(),
                new VolatileCounter(),
                new UnsynchronizedCounter()
        );

        for(SiteVisitCounter c: counters){
            MultithreadingSiteVisitor m = new MultithreadingSiteVisitor(c);
            System.out.println(c.getClass());
            m.visitMultithread(25);
            m.waitUntilAllVisited();
            System.out.println(m.getTotalTimeOfHandling());
        }

    }
}
