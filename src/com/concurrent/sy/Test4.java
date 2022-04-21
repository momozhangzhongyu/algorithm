package com.concurrent.sy;

public class Test4 {

    public synchronized void add4() throws InterruptedException {
        System.out.println("Test-synchronized-add4 start");
        Thread.sleep(10000);
        System.out.println("Test-synchronized-add4 end");
    }
}
