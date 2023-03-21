package com.jvm.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * -Xms500m -Xmx500m
 * jstat -gc 2136 500 4
 *
 * 输出的是GC相关信息，7063 是 进程ID ，采样时间间隔为500ms，采样数为4。
 *
 */
public class HeapInstanceTest {

    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        List<HeapInstanceTest> list = new ArrayList<HeapInstanceTest>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
