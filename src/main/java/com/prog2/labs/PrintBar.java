package com.prog2.labs;

/**
 *
 * @author adinashby
 */
public class PrintBar implements Runnable {

    @Override
    public void run() {
        System.out.print("bar");
    }
}