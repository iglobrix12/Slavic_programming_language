package com.com.com;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class для_всех_богатырей_батюшка_царь_главный {
    public static void Молвить_от_лица_народа(String textt,String text) {
        System.out.println("[" + textt + "] " + text);
    }
    public static void Молвить(String text) {
        System.out.println(text);
    }
    public static void Подаждать_диву_секунду(int time) throws InterruptedException {
        TimeUnit.SECONDS.sleep(time);
    }
    public static void Подаждать_диву_минуты(int time) throws InterruptedException {
        TimeUnit.MINUTES.sleep(time);
    }
    public static void Подаждать_диву_милисикунду(int time) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(time);
    }
    public static void Подаждать_диву_микросекунду(int time) throws InterruptedException {
        TimeUnit.MICROSECONDS.sleep(time);
    }
    public static void Подаждать_диву_день(int time) throws InterruptedException {
        TimeUnit.DAYS.sleep(time);
    }
    public static void Подаждать_диву_час(int time) throws InterruptedException {
        TimeUnit.HOURS.sleep(time);
    }
    public static void уйти(int exit) {
        System.exit(exit);
    }
}
