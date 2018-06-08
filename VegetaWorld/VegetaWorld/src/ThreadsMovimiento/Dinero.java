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
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Dinero {
    
   
    private static final String ARCHIVO_IMAGEN="/imagenes/saibamanes.png";
    private ImageView dinero;
    
    
    /**
     * TODO: Definir un objeto StackPane y un objeto Text
     */
    
    private StackPane pane;
    private Text text;
    /**
     * TODO: Constructor para inicializar todos los elementos
     */
    public Dinero(String texto){
        pane = new StackPane();
        text = new Text(texto);
        dinero= new ImageView(new Image(ARCHIVO_IMAGEN));
        dinero.setFitHeight(60);
        dinero.setFitWidth(60);
 
        agregarPane();
        animacion(pane);
      
    }
    /**
     * TODO: Agregar los elementos imageView y text, llamelo desde el constructor
     */
    public void agregarPane(){
        pane.getChildren().addAll(dinero, text);
    }

    
    
    public ImageView getDinero(){ 
        return dinero;
            
        
    }

    /**
     *  TODO: Cree getters necesarios
     */
    public void setDinero(ImageView dinero) {   
        this.dinero = dinero;
    }

    /**
     * TODO: Metodo Animacion
     */
    
    
    public void animacion(Node n) {
        PathTransition transition = new PathTransition();
        //TODO: Setee el nodo
        transition.setNode(n);
        
        
        
    
        //TODO: Setee el path, lineas verticales aleatorias, cree un objeto de tipo linea
        Random r = new Random();
        
        int num = r.nextInt((int) Constantes.TAMANOPANTALLA);
        Line linea = new Line();
        linea.setStartX(num);
        linea.setStartY(10);
        linea.setEndX(num);
        linea.setEndY(500);
        
        transition.setPath(linea);
        
        
        transition.setDuration(Duration.seconds(5));

        
        transition.setCycleCount(Timeline.INDEFINITE);
       
        transition.setAutoReverse(true);
        //TODO: Poner play a la transicion sino no correra usar el metodo play. 
        transition.play();
    }

    public StackPane getPane() {
        return pane;
    }

    public void setPane(StackPane pane) {
        this.pane = pane;
    }
    
}
