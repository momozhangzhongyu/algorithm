package com.concurrent.sy;

public class Test3 {

    public synchronized void add3() throws InterruptedException {
        System.out.println("Test--add3 start");
        synchronized(this){
            System.out.println("Test-synchronized-add3 start");
            Thread.sleep(10000);
            System.out.println("Test-synchronized-add3 end");
        }
        System.out.println("Test--add3 end");
    }


}
