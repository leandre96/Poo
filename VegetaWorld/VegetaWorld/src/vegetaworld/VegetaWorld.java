/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetaworld;

/**
 *
 * @author adan
 */
import Vegetajuego.PaneJuego;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class VegetaWorld extends Application {
    public static Scene scene;
    /**
     * @param args the command line arguments
     */
    
//public static Scene scene
    @Override
    public void start(Stage primaryStage) throws Exception {
        PanelMovimientoAnimacion panel = new PanelMovimientoAnimacion();
        scene= new Scene(panel.getRoot(),Constantes.ancho,Constantes.largo);
        primaryStage.setTitle( "Vegeta world" );
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    public static void Menu(){
        PanelMovimientoAnimacion panel = new PanelMovimientoAnimacion();
        
       scene.setRoot(panel.getRoot());
    }
    public static void Jugar(){
        PaneJuego panejuego2 = new PaneJuego();
 
        scene.setRoot(panejuego2.getJuego());
    }
    
}
