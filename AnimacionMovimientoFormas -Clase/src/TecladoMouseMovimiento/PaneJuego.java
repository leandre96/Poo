package TecladoMouseMovimiento;

import Globales.Constantes;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;


public class PaneJuego {
  private static Pane juego;
  //Elemento que se va a mover con el teclado de izquierda a derecha
  private Policia policia;
  private Rectangle rect1;
  private Rectangle rect2;
  private Rectangle rect3;
  
  public PaneJuego(){
      inicializarControles();
      ubicarElementos();
  }
  void inicializarControles(){
      juego = new Pane();
      policia= new Policia();
     
      rect1= new Rectangle(350,45,30,30);
      rect2= new Rectangle(200,180,30,30);
      rect3= new Rectangle(75,300,30,30);
      
      agregarPane();
      manejarEvento();
      
  }
 
  void agregarPane(){
      juego.getChildren().addAll(policia.getImagenPolicia()); 
      juego.getChildren().addAll(rect1,rect2,rect3);
  }
 /**
  * TODO: En el panel principal establezca los metodos onKeyPressed que llame al metodo moverObjeto
  * y el metodo setonmouseClicked que llame al metodo lanzarEsposas.
  */
 public void manejarEvento(){        
       
        
 }
 /**
  * TODO: Cuando se da clic se crea una nueva instancia de esposa que debe ser anadida al pane juego
  * luego llame al metodo animacion de la esposa.
  * @param e 
  */
 public void lanzarEsposas(MouseEvent e){
  
     
 }
 /**
  * TODO: Utilizando el metodo getCode() del evento evalue si es igual a la tecla derecha
  * e.getCode().equals(KeyCode.RIGHT) , mueva el policia a la derecha
  * Si utilizo la tecla izquierda muevalo a la izquierda
  */        
 public void moverObjeto(KeyEvent e){
   
 
    }
  
  void ubicarElementos(){      
      policia.getImagenPolicia().setLayoutX(0);
      policia.getImagenPolicia().setLayoutY(Constantes.TAMANOPANTALLA-90);      
  }

  public Pane getJuego() {
        return juego;
  }
  
}
