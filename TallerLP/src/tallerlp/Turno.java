/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlp;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Turno {
    Grupo grupos;
    boolean primero;
    public Turno(Grupo g,boolean f){
        grupos=g;
        primero=f;
    }
    public String toString(){
        if(primero){
            return "Turno 7 30 ("+grupos+")";
        }
        else{
            return "Turno 8 30 ("+grupos+")";
        }
    }
}
