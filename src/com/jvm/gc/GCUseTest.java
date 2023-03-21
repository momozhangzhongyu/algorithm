package com.jvm.gc;

import java.util.ArrayList;
import java.util.List;

public class GCUseTest {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        while (true){
            byte[] arr = new byte[100];
            list.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
