package com.prog2.labs;

/**
 *
 * @author adinashby
 */
public class PrintFoo implements Runnable {

    @Override
    public void run() {
        System.out.print("foo");
    }   
}