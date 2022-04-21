package com.concurrent.sy;

public class ApplyThread implements Runnable {

    @Override
    public void run(){
        try {
//            test.add();
            System.out.println(111);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
