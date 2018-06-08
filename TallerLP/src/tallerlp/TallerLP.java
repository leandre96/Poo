/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author User
 */
public class TallerLP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Grupo> lg=new ArrayList<>();
        lg.add(new Grupo(1));
        lg.add(new Grupo(2));
        lg.add(new Grupo(3));
        lg.add(new Grupo(4));
        lg.add(new Grupo(5));
        lg.add(new Grupo(6));
        lg.add(new Grupo(7));
        lg.add(new Grupo(8));
        for(int j=0;j<10;j++){
        for (int i=0;i<5;i++){
            Random r1=new Random();
            boolean b=r1.nextBoolean();
            Random r2=new Random();
            int num1=1;
            Random r3=new Random();
            int num2=1;
            while(num1==num2){
                num1=r2.nextInt(7)+1;
                num2=r3.nextInt(7)+1;
            }
            Dia d;
            switch (i) {
                case 0:
                    d=new Dia("Lunes",new Turno(lg.get(num1),b),new Turno(lg.get(num2),!b));
                    break;
                case 1:
                    d=new Dia("Martes",new Turno(lg.get(num1),b),new Turno(lg.get(num2),!b));
                    break;
                case 2:
                    d=new Dia("Miercoles",new Turno(lg.get(num1),b),new Turno(lg.get(num2),!b));
                    break;
                case 3:
                    d=new Dia("Jueves",new Turno(lg.get(num1),b),new Turno(lg.get(num2),!b));
                    break;
                default:
                    d=new Dia("Viernes",new Turno(lg.get(num1),b),new Turno(lg.get(num2),!b));
                    break;
            }
            System.out.println(d);
        }
        System.out.println("__________________________________________________-");
    }
        
    }
    
}
