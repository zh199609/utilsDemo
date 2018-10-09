package com.zl;

public class ThreadLocalTest {
    ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();

    public void set() {
        longLocal.set(1L);
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest test = new ThreadLocalTest();

        test.set(); // 初始化ThreadLocal
        for (int i = 0; i < 10; i++) {
            System.out.println(test.getString() + " : " + test.getLong() + i);
        }

        Thread thread1 = new Thread() {
            public void run() {
                test.set();
                for (int i = 0; i < 10; i++) {
                    System.out.println(test.getString() + " : " + test.getLong() + i);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
        };
        thread1.start();
        System.out.println("--------------------------------");
        Thread thread2 = new Thread() {
            public void run() {
                test.set();
                for (int i = 0; i < 10; i++) {
                    System.out.println(test.getString() + " : " + test.getLong() + i);
                       
                }
            };
        };
        thread2.start();
    }
}
