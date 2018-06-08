/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionmovimientoformas;

import Globales.Constantes;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;


public class PanelMovimientoAnimacion {
    private BorderPane root;
    private Label lblTitulo;
    private Button btnIzquierda;
    private Button btnDerecha;
    private Button btnArriba;
    private Button btnAbajo;
    private VBox   panelSuperior;
    private Pane panel;
    private Rectangle rectangle;
    private Ellipse elipse;
   
    private Ciudadano ciudadano;
    private Reloj reloj;
   
    PanelMovimientoAnimacion(){
        organizarPanel();
        organizarControlesRoot();
        animacion(ciudadano.getImagenCiudadano(),new Rectangle(100,200));
    }
    void organizarControlesRoot(){
        reloj = new Reloj();
        root= new BorderPane();
        panelSuperior = new VBox();
        lblTitulo= new Label("Movimiento y Animacion de Formas");
        //Inicializa botones
        btnIzquierda= new Button("◄");
        btnIzquierda.setOnAction(e-> moverDirecciones(e));
        btnDerecha= new Button("►");
        btnDerecha.setOnAction(e-> clickDerecha());
        
        btnArriba = new Button("▲");
        btnArriba.setOnAction(e-> moverDirecciones(e));
        
        btnAbajo = new Button("▼");
        btnAbajo.setOnAction(e -> moverDirecciones(e));
        
        panelSuperior.getChildren().addAll(lblTitulo,reloj.getLblReloj(),btnArriba);
        root.setTop(panelSuperior);
        root.setLeft(btnIzquierda);
        root.setRight(btnDerecha);
        root.setBottom(btnAbajo);
        root.setCenter(panel);
        root.setAlignment(btnDerecha,Pos.CENTER);
        root.setAlignment(btnIzquierda,Pos.CENTER);
        panelSuperior.setAlignment(Pos.CENTER);
        root.setAlignment(btnAbajo,Pos.CENTER);       
        
     }
     void clickDerecha(){
         double x = rectangle.getLayoutX();
         rectangle.setLayoutX(x+Constantes.MOVIMIENTO);
     }
     void moverDirecciones(ActionEvent event){
           double x = rectangle.getLayoutX();
             double y = rectangle.getLayoutY();
            if (event.getSource().equals(btnIzquierda)){
                rectangle.setLayoutX(x-Constantes.MOVIMIENTO);
            }
            else if(event.getSource().equals(btnDerecha)){
               rectangle.setLayoutX(x+Constantes.MOVIMIENTO);
            }
            else if(event.getSource().equals(btnArriba)){
               rectangle.setLayoutY(y-Constantes.MOVIMIENTO);
            }
            else if(event.getSource().equals(btnAbajo)){
                rectangle.setLayoutY(y+Constantes.MOVIMIENTO);
            }
     }
     
     void organizarPanel(){
         panel= new Pane();
         
         rectangle = new Rectangle (60,60);
         rectangle.setLayoutX(Constantes.TAMANOPANTALLA/2);
         rectangle.setLayoutY(Constantes.TAMANOPANTALLA/2);
         rectangle.setFill(Color.BLUE);
       
         //Crear la elipse con radiusx de 60 y radiusy de 60
         elipse = new Ellipse(60,60);
        
        
         //Colocar la elipse en el pane de acuerdo a las coordenadas
         elipse.setCenterX(60);
         elipse.setCenterY(60);
         ciudadano = new Ciudadano(4);
         panel.getChildren().addAll(rectangle, ciudadano.getImagenCiudadano());
         
     }
     
     void animacion(Node n,Shape s){
         //1.- Creo un objeto tipo path trasition
         PathTransition transicion = new PathTransition();
         //2.- Seteo el nodo que quiero que se mueva
         transicion.setNode(n);
         //3.- Selecciono la forma en que el nodo se va a mover
         transicion.setPath(s);
         //4.-Desde donde se va ubicar la animacion
         s.setLayoutX(100);
         s.setLayoutY(100);
         //La duracion de la transicion
         transicion.setDuration(Duration.seconds(10));
         //Cuantas veces se va a repetir la animacion
         transicion.setCycleCount(Timeline.INDEFINITE);
         //Ejecutar la animacion
         transicion.play();
    }
     
    BorderPane getRoot(){
        return root;
    }
    
    /*class MueveForma implements EventHandler<ActionEvent>{

       
        public void handle(ActionEvent event) {
             double x = rectangle.getLayoutX();
             double y = rectangle.getLayoutY();
            if (event.getSource().equals(btnIzquierda)){
                rectangle.setLayoutX(x-Constantes.MOVIMIENTO);
            }
            else if(event.getSource().equals(btnDerecha)){
               rectangle.setLayoutX(x+Constantes.MOVIMIENTO);
            }
            else if(event.getSource().equals(btnArriba)){
               rectangle.setLayoutY(y-Constantes.MOVIMIENTO);
            }
            else if(event.getSource().equals(btnAbajo)){
                rectangle.setLayoutY(y+Constantes.MOVIMIENTO);
            }
        }
        
    }*/
    
}
