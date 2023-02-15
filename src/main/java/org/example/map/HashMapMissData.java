package org.example.map;

import java.util.HashMap;

public class HashMapMissData {

    /**
     * 1、HashMap中 630行打个条件断点（Thread.currentThread().getName().equals("t1") ||
     *         Thread.currentThread().getName().equals("t2")）
     * 2、线程t1进入631行（不执行），切换线程t2执行完，然后断点直接放行，
     * 3、最终hashMap 只输出 {a=java.lang.Object@17d99928}
     */
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, Object> map = new HashMap<>();
        Thread t1 = new Thread(() ->{
            map.put("a", new Object());
        }, "t1");

        Thread t2 = new Thread(() ->{
            map.put("1", new Object());
        }, "t2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(map);
    }
}
