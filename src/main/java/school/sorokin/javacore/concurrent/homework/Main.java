package school.sorokin.javacore.concurrent.homework;

import school.sorokin.javacore.concurrent.homework.SiteVisitCounterPack.VolatileCounter;

public class Main {
    public static void main(String[] args) {
        TestCounter testCounter = new TestCounter();
        System.out.println("volatileCounterTest");
        testCounter.volatileCounterTest(150);
        System.out.println("atomicIntegerCounterTest");
        testCounter.atomicIntegerCounterTest(20);
        System.out.println("reentrantLockCounterTest");
        testCounter.reentrantLockCounterTest(100);
        System.out.println("unsynchronizedCounterTest");
        testCounter.unsynchronizedCounterTest(100);
        System.out.println("synchronizedBlockCounterTest");
        testCounter.synchronizedBlockCounterTest(20);
    }
}
