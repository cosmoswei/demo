package com.wei.test;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        System.out.println("Git Test");
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        new Thread((new Runnable() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis() + "huangxuwei");
                System.out.println(Thread.currentThread().getName());
            }
        }), "a").start();
    }
}
