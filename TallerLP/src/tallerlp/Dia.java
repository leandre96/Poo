/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlp;

/**
 *
 * @author User
 */
public class Dia {
    Turno turno1,turno2;
    String dia;
    public Dia(String s,Turno t1,Turno t2){
        dia=s;
        turno1=t1;
        turno2=t2;
        
    }
    public String toString(){
        return dia+" ("+turno1+") ("+turno2+")";
    }
}
