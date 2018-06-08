package Vegetajuego;

import Globales.Constantes;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import vegetaworld.PanelMovimientoAnimacion;


public class PaneJuego {
  private static Pane juego;
  //Elemento que se va a mover con el teclado de izquierda a derecha
  private Policia policia;
  private Rectangle rect1;
  private Rectangle rect2;
  private Rectangle rect3;
  private Pane paneJuego;
  private Button volver;
  private HBox panel;
  private PanelMovimientoAnimacion root;
  
  public PaneJuego(){
      root = new PanelMovimientoAnimacion();
      policia = new Policia();
      juego = new Pane();
      paneJuego = new Pane();
      volver = new Button();
      inicializarControles();
      ubicarElementos();
      manejarEvento();
      
      organizarControlesRoot();
      Thread ejecuta = new Thread(new Ejecutaanimacion());
      
      
      ejecuta.start();
  }
  
   void organizarControlesRoot(){
       juego.setStyle("-fx-background-image: url('/imagenes/destruido.jpg'); "
+ "-fx-background-position: center center; "
+ "-fx-background-repeat: stretch;"
+ "-fx-background-size:"+1000 +" "+ 800 + ";"
);
        
        panel= new HBox();
        volver = new Button("volver");
        
        
        
        
        
     
      panel.getChildren().addAll(volver);
        
        
         
              
        
     }
  
    void inicializarControles(){
      juego = new Pane();
      policia= new Policia();
      
      agregarPane();
      
      
  }
 
  void agregarPane(){
      juego.getChildren().addAll(policia.getImagenPolicia());
  }
  
  void creaNuevoDinero(){
        Dinero m = new Dinero("100");
        juego.getChildren().add(m.getPane());
        m.getPane().setOnMouseClicked(a-> remuevePane(a));
        
       
    }
 
 public void manejarEvento(){
     juego.setOnKeyPressed(e->moverObjeto(e));
     juego.setOnMouseClicked(e->lanzarEsposas(e));
       
        
 }
 
 

 public void lanzarEsposas(MouseEvent e){
      Esposa esposa = new Esposa();
     juego.getChildren().add(esposa.getImagenEsposa());
     System.out.println("policia"+policia.getImagenPolicia().getLayoutX());
    
     esposa.animacion(policia.getImagenPolicia().getLayoutY()).setOnFinished(ev->{juego.getChildren().remove(esposa.getImagenEsposa());});
  
     
 }
    
 public void moverObjeto(KeyEvent e){
     
     if (e.getCode().equals(KeyCode.RIGHT)){
         policia.getImagenPolicia().setLayoutX(policia.getImagenPolicia().getLayoutY()+5);
     }
     else if (e.getCode().equals(KeyCode.LEFT)){
         policia.getImagenPolicia().setLayoutX(policia.getImagenPolicia().getLayoutY()-5);
     }
   
 
    }
  
  void ubicarElementos(){      
      policia.getImagenPolicia().setLayoutX(800);
      policia.getImagenPolicia().setLayoutY(200);      
  }

  public Pane getJuego() {
        return juego;
  }
  

    public Pane getPaneJuego() {
        return paneJuego;
    }

    public void setPaneJuego(Pane paneJuego) {
        this.paneJuego = paneJuego;
    }
   
    
    
    void remuevePane(MouseEvent a){
        juego.getChildren().remove(a.getSource());
       
    }
    
    class Ejecutaanimacion implements Runnable{

        @Override
        public void run() {
            for(int i=0; i<12; i++){
                Platform.runLater(()->creaNuevoDinero());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println("");
                }
                
                    
            
                
            }}
        
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}}
