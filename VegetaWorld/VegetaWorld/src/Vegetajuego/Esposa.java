/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vegetajuego;

import Globales.Constantes;
import javafx.animation.PathTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Esposa {
/**
 * TODO: Crear imageView imagenEsposa, y un objeto tipo Line line
 */
private ImageView imagenEsposa;
private static final String ARCHIVO_IMAGEN="/imagenes/energia.png";    
private Line line;
    Esposa(){
    inicializarElementos();     
        
    }
    /**
     * TODO: Inicialice los elementos, linea e image view, basandose en ciudadano
     */
    public void inicializarElementos(){
        imagenEsposa= new ImageView(new Image(ARCHIVO_IMAGEN));
        line = new Line();
        imagenEsposa.setFitHeight(110);
        imagenEsposa.setFitWidth(110);
        
    }
    
    
    PathTransition animacion(double x){
         //1.- Creo un objeto tipo path trasition
         PathTransition transicion = new PathTransition();
         //2.- Seteo el nodo que quiero que se mueva
         transicion.setNode(imagenEsposa);
         //3.- Selecciono la forma en que el nodo se va a mover
         transicion.setPath(parametrizarLinea(x));         
         //La duracion de la transicion
         transicion.setDuration(Duration.seconds(1));
         //Cuantas veces se va a repetir la animacion
         transicion.setCycleCount(1);
         //Ejecutar la animacion
         transicion.play();
         
         return transicion;
    }


    public Line parametrizarLinea(double x){
        System.out.println(x);     
  
        line.setStartX(Constantes.TAMANOPANTALLA-20);
        line.setEndX(0);
        line.setEndY(x);
        line.setStartY(x);        
        return line;
    }
    /**
     * TODO: Cree getters necesarios     
     */
    public ImageView getImagenEsposa() {
        return imagenEsposa;
    }
    public Line getLine() {
        return line;
    }
    
  
}
