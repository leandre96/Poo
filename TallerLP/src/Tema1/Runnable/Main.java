/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1.Runnable;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyHilo(1));
        Thread t2=new Thread(new MyHilo(2));
        Thread t3=new Thread(new MyHilo(3));
        Thread t4=new Thread(new MyHilo(4));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}
