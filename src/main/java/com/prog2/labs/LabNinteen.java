package com.prog2.labs;

import java.util.Scanner;

/**
 * @author adinashby
 *
 */
public class LabNinteen {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

        System.out.print("Input: n = ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        FooBar fooBar = new FooBar(i);
        
        new Thread(new Runnable() {
            public void run() {
                try {
                    fooBar.foo(new PrintFoo());
                } catch (InterruptedException ex) {
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    fooBar.bar(new PrintBar());
                } catch (InterruptedException ex) {
                }
            }
        }).start();

    }

    /**
     * Please refer to the README file for question(s) description
     */
}
