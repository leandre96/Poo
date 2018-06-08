/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsMovimiento;

import Globales.Constantes;
import java.util.Random;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Dinero {
    /*
    TODO: Definir imageView, debe presentar la imagen bag.png basarse en la clase Ciudadano
    */
   
    private static final String ARCHIVO_IMAGEN="/imagenes/bag.png";
    /**
     * TODO: Definir un objeto StackPane y un objeto Text
     */
    /**
     * TODO: Constructor para inicializar todos los elementos
     */
    Dinero(String texto){
        /**
         * TODO: Al inicializar el objeto de tipo TEXT enviarle el texto enviado por parametro
         * en el constructor
         * text.setFill(Color.WHITE); //Descomentar
         */
        agregarPane();
        animacion();
      
    }
    /**
     * TODO: Agregar los elementos imageView y text, llamelo desde el constructor
     */
    public void agregarPane(){
    }

 
    /**
     *  TODO: Cree getters necesarios
     */
   
    /**
     * TODO: Metodo Animacion
     */
    public void animacion(){
        PathTransition transition = new PathTransition();
        //TODO: Setee el nodo
    
        //TODO: Setee el path, lineas verticales aleatorias, cree un objeto de tipo linea
        Random r = new Random();
        int num = r.nextInt((int) Constantes.TAMANOPANTALLA);
        
 
        
        /* TODO:Seteo la duracion de la animacion con el metodo setDuration
          * este metodo me permite darle una velocidad a la animacion si pongo
          */
        
        /**
          * TODO: Seteo los ciclos de animacion con el metodo setCycleCount
          * me indica cuantas veces deseo q se repita la animacion si quiero indefinido pongo Timeline.INDEFINITE
          */
        
        //TODO: Seteo el path de como se va a mover mi figura, puede escoger cualquier forma
         
         //Setteo autoreverse para que regrese a la posicion original si se desea, comentar sino se desea
        
         //TODO: Poner play a la transicion sino no correra usar el metodo play. 
            
        
    }
    
}
