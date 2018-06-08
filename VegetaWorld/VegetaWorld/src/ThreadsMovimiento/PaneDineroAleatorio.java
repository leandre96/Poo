/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsMovimiento;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class PaneDineroAleatorio {
    private Pane paneJuego;
    /**
     * TODO: Inicialice Pane, Cree una nueva instancia de EjecutorAnimacion, y comience la thread (Ver instrucciones parte inferior)
     */
    
    public PaneDineroAleatorio(){
        paneJuego = new Pane();
        Thread ejecuta = new Thread(new Ejecutaanimacion());
        ejecuta.start();
      
    }

    public Pane getPaneJuego() {
        return paneJuego;
    }

    public void setPaneJuego(Pane paneJuego) {
        this.paneJuego = paneJuego;
    }
   
    void creaNuevoDinero(){
        Dinero m = new Dinero("100");
        paneJuego.getChildren().add(m.getPane());
        m.getPane().setOnMouseClicked(a-> remuevePane(a));
        
       
    }
    /**
     * TODO: Completar este metodo para remover del objeto PaneJuego, el elemento que se esta dando clic
     * utilizando el metodo getSource del parametro recibido, y el metodo remove de GetChildren
     */
    void remuevePane(MouseEvent a){
        paneJuego.getChildren().remove(a.getSource());
       
    }
    
    class Ejecutaanimacion implements Runnable{

        @Override
        public void run() {
            for(int i=0; i<10; i++){
                Platform.runLater(()->creaNuevoDinero());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PaneDineroAleatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                    
            
                
            }
        }
    
    
    
    }


 
    
    /**
     * TODO: Cree getter del panel
     */
    /**
     * TODO: Cree una clase interna llamada EjecutorAnimacion que implemente Runnable
     */
    /**
      * TODO: 1.-Sobrescriba el metodo run, dentro de este metodo cree un for que vaya del 1 al 10
      * 2.-En el metodo run llame al metodo creaNuevoDinero 
      * 3.- Ejecute la thread en el constructor de la clase
      * 4.- Corra la aplicacion, tendra el error de que la thread no es de JavaFX utilice Platform.runLater() para la llamada del metodo
      */
    
        
   
}
