/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionmovimientoformas;

import java.time.LocalDateTime;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Reloj {
    private Label lblReloj;
    
    Reloj(){
        lblReloj= new Label(LocalDateTime.now().toString());
        manejarTiempo();
    }
    void manejarTiempo(){
        Timeline reloj = new Timeline();
        Timeline vida = new Timeline();
        KeyFrame kfsegundo = new KeyFrame(Duration.seconds(1),e->manejaSegundo());
        KeyFrame kfminuto = new KeyFrame(Duration.seconds(10),e->controlaVida());
        
        reloj.getKeyFrames().addAll(kfsegundo);
        vida.getKeyFrames().addAll(kfminuto);
        reloj.setCycleCount(Timeline.INDEFINITE);
        vida.setCycleCount(Timeline.INDEFINITE);
        reloj.play();
        vida.play();
    }
    void controlaVida(){
        System.out.println("Ha pasado un minuto mas en tu vida");
    }
    void manejaSegundo(){
        lblReloj.setText(LocalDateTime.now().toString());
    }

    public Label getLblReloj() {
        return lblReloj;
    }
    
    
}
