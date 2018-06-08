/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1.Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MiHilo extends Thread{
    private int i;
    public MiHilo(int i){
        this.i=i;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hola mundo del hilo "+i);
    }
}
