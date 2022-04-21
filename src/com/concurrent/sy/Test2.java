package com.concurrent.sy;

public class Test2 {



    public static void add2() throws InterruptedException {
        System.out.println("Test--add2 start");
        synchronized(Test2.class){
            System.out.println("Test-synchronized-add2 start");
            Thread.sleep(10000);
            System.out.println("Test-synchronized-add2 end");
        }
        System.out.println("Test--add2 end");
    }

}
