/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsMovimiento;
import Globales.Constantes;
import java.util.Random;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * @author adan
 */
public class Basura {
    private static final String ARCHIVO_IMAGEN="/imagenes/vidrio.png";
    private ImageView basura;
    
    private Line line;
    

public Basura(){
        line = new Line();
        
        basura= new ImageView(new Image(ARCHIVO_IMAGEN));
        basura.setFitHeight(150);
        basura.setFitWidth(150);
    
        
 
    }

/*public void animacion(Node m){
           Random r = new Random();
        
        int num = r.nextInt((int) Constantes.TAMANOPANTALLA);
         m.setLayoutX(num);
        m.setLayoutY(50);
       
        TranslateTransition translateTransition =
            new TranslateTransition(Duration.millis(2000), m);
        translateTransition.setFromY(10);
        translateTransition.setToY(650);
        translateTransition.setCycleCount(1);
        translateTransition.setAutoReverse(false);
        translateTransition.play();
        
        
         
         
    }*/





    public ImageView getBasura() {
        return basura;
    }

    public void setBasura(ImageView basura) {
        this.basura = basura;
    }
    public Line getLine() {
        return line;
    }
}
