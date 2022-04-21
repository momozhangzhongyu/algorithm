package com.concurrent.sy;

public class Test {
    public static synchronized void add() throws InterruptedException {
        System.out.println("Test-synchronized-add start");
        Thread.sleep(10000);
        System.out.println("Test-synchronized-add end");
    }
}
