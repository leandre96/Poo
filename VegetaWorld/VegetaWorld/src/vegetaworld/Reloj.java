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
import ThreadsMovimiento.Basura;
import java.time.LocalDateTime;
import java.util.LinkedList;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Reloj {
    private Label lblReloj;
    Label edadActual;
    Label AlimentacionActual;
    Label LimpiezaActual;
    int valor=0;
    Label AnimoActual;
    LinkedList<String> LRutasImagenesVegeta;
    Vegeta vegeta = PanelMovimientoAnimacion.vegeta;
    Label semillas;
    ImageView imagen = new ImageView("/imagenes/namekusein.jpg");
    
    
    
    
    Reloj(){
        LRutasImagenesVegeta = new LinkedList<String>();
        LRutasImagenesVegeta.add("/imagenes/vegeta.jpg");
        LRutasImagenesVegeta.add("/imagenes/vegeta1.png");
        LRutasImagenesVegeta.add("/imagenes/vegeta2.png");
        LRutasImagenesVegeta.add("/imagenes/vegetablue.png");
        lblReloj= new Label(LocalDateTime.now().toString());
        semillas = new Label(String.valueOf(vegeta.getSemillas()));
        edadActual = new Label(String.valueOf(vegeta.getEdad()));
        LimpiezaActual = new Label(String.valueOf(vegeta.getLimpieza()));
        AnimoActual = new Label(String.valueOf(vegeta.getAnimo()));
        AlimentacionActual = new Label(String.valueOf(vegeta.getAlimentacion()));
        manejarTiempo();
    }

    public Label getSemillas() {
        return semillas;
    }

    public void setSemillas(Label semillas) {
        this.semillas = semillas;
    }

    public Vegeta getVegeta() {
        return vegeta;
    }
    
    public Label getEdadActual(){
        return edadActual;
    }

    public Label getAlimentacionActual() {
        return AlimentacionActual;
    }

    public void setAlimentacionActual(Label AlimentacionActual) {
        this.AlimentacionActual = AlimentacionActual;
    }

    public Label getAnimoActual() {
        return AnimoActual;
    }

    public void setAnimoActual(Label AnimoActual) {
        this.AnimoActual = AnimoActual;
    }
    
    
    void manejarTiempo(){
        Timeline reloj = new Timeline();
        Timeline vida = new Timeline();
        Timeline dinero = new Timeline();
        
        
        
        KeyFrame kfsegundo = new KeyFrame(Duration.seconds(1),e->manejaSegundo());
        KeyFrame kfdinero = new KeyFrame(Duration.seconds(1),e->manejadinero());
        KeyFrame kfminuto = new KeyFrame(Duration.seconds(1),e->controlaVida());
        
        
        
        dinero.getKeyFrames().addAll(kfdinero);
        reloj.getKeyFrames().addAll(kfsegundo);
        vida.getKeyFrames().addAll(kfminuto);
        reloj.setCycleCount(Timeline.INDEFINITE);
        vida.setCycleCount(Timeline.INDEFINITE);
        dinero.setCycleCount(Timeline.INDEFINITE);
        
        
        reloj.play();
        vida.play();
        dinero.play();
    }

    
    public Label getLimpiezaActual() {
        return LimpiezaActual;
    }

    
    
    
    
    void controlaVida(){
  
        vegeta.setEdad(vegeta.getEdad() + 1);
        edadActual.setText(String.valueOf(vegeta.getEdad()));
        System.out.println(vegeta.getEdad());
        System.out.println(vegeta.getAlimentacion());
        System.out.println(vegeta.getAnimo());
        System.out.println(vegeta.getLimpieza());

        vegeta.setAnimo(vegeta.getAnimo()-1);
        AnimoActual.setText(String.valueOf(vegeta.getAnimo()));
        
        vegeta.setLimpieza(vegeta.getLimpieza() - 1);
        LimpiezaActual.setText(String.valueOf(vegeta.getLimpieza()));
        
        vegeta.setAlimentacion(vegeta.getAlimentacion() - 1);
        AlimentacionActual.setText(String.valueOf(vegeta.getAlimentacion()));
        
        
        if(valor%4==0){
            ((ImageView)PanelMovimientoAnimacion.panel.getChildren().get(0)).setImage(new Image(LRutasImagenesVegeta.get(3)));
        }else if(valor%3==0){
        ((ImageView)PanelMovimientoAnimacion.panel.getChildren().get(0)).setImage(new Image(LRutasImagenesVegeta.get(2)));
        }else if(valor%2==0){
        ((ImageView)PanelMovimientoAnimacion.panel.getChildren().get(0)).setImage(new Image(LRutasImagenesVegeta.get(1)));
        }else{
        ((ImageView)PanelMovimientoAnimacion.panel.getChildren().get(0)).setImage(new Image(LRutasImagenesVegeta.get(0)));
        }
        
        if(vegeta.getEdad()>5){
            ((ImageView)PanelMovimientoAnimacion.panel.getChildren().get(0)).setImage(new Image("imagenes/vegetamuerto.png"));
            //PanelMovimientoAnimacion.animacion(vegeta.setImagenvegeta(imagen).sequentialTransition.stop());

        }
        
        
        
        if(vegeta.getAlimentacion()<0){
            vegeta.setAlimentacion(0);
        }
        if(vegeta.getAnimo()<0){
            vegeta.setAnimo(0);
        }
        if(vegeta.getLimpieza()<0){
            vegeta.setLimpieza(0);
        }
        
        if(vegeta.getAlimentacion()==0 || vegeta.getLimpieza()==0 || vegeta.getAnimo()==0){
            vegeta.setEdad(vegeta.getEdad() + 100);
        }
        
        
        valor++;
        
    }
    
    
    void manejaSegundo(){
        lblReloj.setText(LocalDateTime.now().toString());
    }
    
    void manejadinero(){
        vegeta.setSemillas(vegeta.getSemillas());
        semillas.setText(String.valueOf(vegeta.getSemillas()));
    }

    public Label getLblReloj() {
        return lblReloj;
    }
    
    
}

