package com.bsg5.chapter4;

public class Object03 extends HasData {
    static Object semaphore = null;

    public void init() {
        semaphore = new Object();
    }

    public void dispose() {
        System.out.printf("destroy called\n");
        semaphore = null;
    }
}
