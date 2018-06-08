/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1.Runnable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MyHilo implements Runnable {
    private int i;
    public MyHilo(int i){
        this.i=i;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hola mundo del hilo "+i);//To change body of generated methods, choose Tools | Templates.
    }
    
}
