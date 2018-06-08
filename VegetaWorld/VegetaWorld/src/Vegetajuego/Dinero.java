/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vegetajuego;
import Globales.Constantes;
import ThreadsMovimiento.Basura;
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

    private StackPane pane;
    private Text text;
    private Basura basura;
   
   
    Dinero(String texto){
        
        basura = new Basura();
        pane = new StackPane();
        text = new Text(texto);
        dinero= new ImageView(new Image(ARCHIVO_IMAGEN));
        dinero.setFitHeight(60);
        dinero.setFitWidth(60);
        
         text.setFill(Color.WHITE); 
       
        agregarPane();
        animacion(pane);
      
    }
    

    public void agregarPane(){
        pane.getChildren().addAll(dinero, text);
    }

    
    
    public ImageView getDinero(){ 
        return dinero;
            
        
    }


    public void setDinero(ImageView dinero) {   
        this.dinero = dinero;
    }

    public void animacion(Node n) {
        PathTransition transition = new PathTransition();
        //TODO: Setee el nodo
        transition.setNode(n);
        
  
        Random r = new Random();
        
        int num = r.nextInt((int) Constantes.TAMANOPANTALLA);
        Line linea = new Line();
        linea.setStartX(50);
        linea.setStartY(num-100);
        linea.setEndX(650);
        linea.setEndY(num-100);
        
        transition.setPath(linea);
        
        transition.setDuration(Duration.seconds(10));
  
        transition.setCycleCount(Timeline.INDEFINITE);
  
        transition.setAutoReverse(true);
      
        transition.play();
    }

    public StackPane getPane() {
        return pane;
    }/*
    public void verificar(){
        if (this.getDinero().getLayout() == basura.getBasura().getLayoutX()){
            pane.getChildren().remove(this.getDinero());
        }
    }*/

    public void setPane(StackPane pane) {
        this.pane = pane;
    }
    
}
