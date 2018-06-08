/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionmovimientoformas;

import TecladoMouseMovimiento.PaneJuego;
import Globales.Constantes;
import ThreadsMovimiento.PaneDineroAleatorio;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Luci
 */
public class PrincipalInicio extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch();
    }

    @Override
    public void start(Stage primaryStage)  {
        PaneDineroAleatorio panejuego= new PaneDineroAleatorio();
        PaneJuego panejuego2 = new PaneJuego();
        
        Scene scene = new Scene(panejuego.getPaneJuego(),Constantes.TAMANOPANTALLA,Constantes.TAMANOPANTALLA);
        Scene scene2 = new Scene(panejuego2.getJuego(),Constantes.TAMANOPANTALLA,Constantes.TAMANOPANTALLA);
        
        scene.setFill(Color.BEIGE);
        primaryStage.setScene(scene2);
        
        //Le doy las propiedades de teclado al panel de la clase PaneJuego, descomentar
        //Otra opcion es manejar los eventos desde la escena 
        scene2.onKeyPressedProperty().bind(panejuego2.getJuego().onKeyPressedProperty());
        primaryStage.show();
    }
    
}
