/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsMovimiento;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;


public class PaneDineroAleatorio {
    private Pane paneJuego;

    
    public Pane getPaneJuego(){
        return paneJuego;
      
    }

    /**
     * TODO: Inicialice Pane, Cree una nueva instancia de EjecutorAnimacion, y comience la thread (Ver instrucciones parte inferior)
     */
    public void setPaneJuego(Pane paneJuego) {
        this.paneJuego = paneJuego;
    }

    public PaneDineroAleatorio() {
    }
    /**
     * TODO: Este metodo crea una nueva instancia de Dinero, y agrega el StackPane a PaneJuego
     * De al stackPanel el evento setonmouseclicked que llame al metodo remueveDePanel(MouseEvent e)
     */
    void creaNuevoDinero(){
       
    }
    /**
     * TODO: Completar este metodo para remover del objeto PaneJuego, el elemento que se esta dando clic
     * utilizando el metodo getSource del parametro recibido, y el metodo remove de GetChildren
     */
    void remueveDePanel(MouseEvent e){
       
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
