/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1.Thread;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Thread h1=new MiHilo(1);
        Thread h2=new MiHilo(2);
        Thread h3=new MiHilo(3);
        Thread h4=new MiHilo(4);
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
}
