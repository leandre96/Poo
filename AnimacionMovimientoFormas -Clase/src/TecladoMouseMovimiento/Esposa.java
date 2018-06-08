/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TecladoMouseMovimiento;

import Globales.Constantes;
import javafx.animation.PathTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Esposa {
/**
 * TODO: Crear imageView imagenEsposa,
 */
private Line line;
private static final String ARCHIVO_IMAGEN="/imagenes/esposas.png"; 
private ImageView imagenEsposa;
    Esposa(){
    inicializarElementos();     
        
    }
    /**
     * TODO: Inicialice los elementos: linea e image view, basandose en clase Policia
     */
    public void inicializarElementos(){
        imagenEsposa= new ImageView(new Image(ARCHIVO_IMAGEN));
        imagenEsposa.setFitHeight(80);
        imagenEsposa.setFitWidth(80);
    }
    
    /**
     * TODO: Crear animacion de linea, en el path llame al metodo parametrizar linea 
     * @param x
     * @return 
     */
    PathTransition animacion(double x){
         //1.- Creo un objeto tipo path trasition
        
         //2.- Seteo el nodo que quiero que se mueva
         //3.- Selecciono la forma en que el nodo se va a mover utilice el metodo parametrizarLinea
         //La duracion de la transicion
         //Cuantas veces se va a repetir la animacion
         //Ejecutar la animacion
         
         //Return transicion
          return null;
    }


    public Line parametrizarLinea(double x){
        System.out.println(x);     
  
        line.setStartX(x);
        line.setEndX(x);
        line.setEndY(0);
        line.setStartY(Constantes.TAMANOPANTALLA-40);        
        return line;
    }
    /**
     * TODO: Cree getters necesarios     
     */

    
  
}
