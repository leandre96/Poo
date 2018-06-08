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
import Vegetajuego.PaneJuego;
import java.io.File;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Random;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


public class PanelMovimientoAnimacion {
    private BorderPane root;
    private Label lblTitulo;

    private Button btnSemillas;
    private Button btnPizza;
    private Button btnLimpieza;
    private Button btnJugar;
    
    private HBox   panelSuperior,panelDeDatos;
    public static Pane panel;

    public static Vegeta vegeta;
   
    private Reloj reloj;
    private VBox panelInferior;
    private Label semillas;
    private Basura basura;
    private Image imageView0;
    
    private LinkedList<Basura> LBasura;
    
   
    public PanelMovimientoAnimacion(){
        root= new BorderPane();
        vegeta = new Vegeta();
        LBasura = new LinkedList<Basura>();
         
        
        //reproducir();
        organizarPanel();
        organizarControlesRoot();
        animacion(vegeta.getImagenVegeta());
        manejarTiempoBasura();
        
    }
    
    void manejarTiempoBasura(){
        Random r = new Random();
        
        int num = r.nextInt((int) 50);
        Timeline reloj = new Timeline();
  
        KeyFrame kfsegundo = new KeyFrame(Duration.seconds(num),e->crearBasura());
   
        reloj.getKeyFrames().addAll(kfsegundo);
       
        reloj.setCycleCount(Timeline.INDEFINITE);
        
        reloj.play();
        
    }
     void crearBasura(){
        Basura b = new Basura();
        panel.getChildren().addAll(b.getBasura());
        Random r = new Random();
        
        int num = r.nextInt((int) Constantes.ancho-200);
        b.getBasura().setLayoutX(num);
        Random a = new Random();
        
        int num1 = a.nextInt((int) Constantes.largo-200);
        b.getBasura().setLayoutY(num1);
        /*basura.getBasura().setLayoutX(200);
      basura.getBasura().setLayoutY(200);*/
        //basura.animacion(basura.getBasura());
        LBasura.add(b);
 
     
    }
     
    
    
   /* void reproducir(){
        Media media = new Media("/musica/closer.mp3");
    media.setOnError(() -> System.out.println("error media"));

    MediaPlayer player = new MediaPlayer(media);
    player.setOnError(() -> System.out.println("error player"));

    MediaView view = new MediaView(player);
    }*/
     
     
    void organizarControlesRoot(){
        root= new BorderPane();
        reloj = new Reloj();
        semillas = new Label(String.valueOf(vegeta.getSemillas()));
        
        panelSuperior = new HBox();
        panelInferior = new VBox();
        panelDeDatos = new HBox();
        root.setStyle("-fx-background-image: url('/imagenes/fondo.jpg'); "
        + "-fx-background-position: center center; "
        + "-fx-background-repeat: stretch;"
        + "-fx-background-size:"+1000 +" "+ 800 + ";"
        );
        
        
 
        btnSemillas = new Button("$100\n+5");
        btnSemillas.setId("pizza");
        ImageView imageView = new ImageView("imagenes/semillas.png");
	imageView.setFitWidth(50);
	imageView.setFitHeight(50);
	btnSemillas.setGraphic(imageView);
        btnSemillas.getStylesheets().add("styles/Style.css");
        btnSemillas.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {             
                vegeta.setAlimentacion(vegeta.getAlimentacion() +5);
                System.out.println(vegeta.getAlimentacion());
                vegeta.setSemillas(vegeta.getSemillas()-100);
                System.out.println(vegeta.getSemillas());
            }
        });
        
        
        
        btnPizza = new Button("$50\n+2"+"\n"+reloj.getSemillas());
        btnPizza.setId("pizza");
        ImageView pizza = new ImageView("imagenes/pizza.png");
	pizza.setFitWidth(50);
	pizza.setFitHeight(50);
	btnPizza.setGraphic(pizza);
        btnPizza.getStylesheets().add("styles/Style.css");
        btnPizza.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                vegeta.setAlimentacion(vegeta.getAlimentacion() +2);
                System.out.println(vegeta.getAlimentacion());
                vegeta.setSemillas(vegeta.getSemillas()-50);
                System.out.println(vegeta.getSemillas());
                ((ImageView)PanelMovimientoAnimacion.panel.getChildren().get(0)).setImage(new Image("/imagenes/vegeta.gif"));
            }
        });
        
        
        btnLimpieza = new Button();
        btnLimpieza.setId("Limpieza");
        ImageView image = new ImageView("imagenes/limpieza.png");
	image.setFitWidth(50);
	image.setFitHeight(50);
	btnLimpieza.setGraphic(image);
        btnLimpieza.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t) {
               for (Basura i : LBasura){
                    panel.getChildren().remove(i.getBasura());
               }
               vegeta.setLimpieza(10);
               // vegeta.setAlimentacion(vegeta.getAlimentacion()+10);
               /*semillas .setText(String.valueOf(Integer.valueOf(semillas.getText()).intValue()+10));
                     reloj.AlimentacionActual.setText(String.valueOf(Integer.valueOf(reloj.AlimentacionActual.getText()).intValue()+10));
                     vegeta.setSemillas(vegeta.getSemillas()-10);*/

                }
        });
        
        
        
        btnJugar = new Button();             
        btnJugar.setId("jugar");
        ImageView imageView1 = new ImageView("imagenes/jugar.png");
	imageView1.setFitWidth(100);
	imageView1.setFitHeight(50);
	btnJugar.setGraphic(imageView1);
        btnJugar.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
                 VegetaWorld.Jugar();
                 vegeta.setAnimo(10);
            }
        });
        
        
        
        
        
       // imageView0 = new Image(getClass().getResourceAsStream("imagenes/limpieza.png"));
        
     //   semillas.setGraphic(new ImageView(imageView0));
        //semillas.setTextFill(Color.web("#0076a3"));
        
        
        
        
        
        
        
        
       
        
        panelSuperior.getChildren().addAll(btnPizza,btnSemillas, btnLimpieza, reloj.getSemillas());
        //HBox lineaDeEdad = new HBox();
        //Label label = new Label("esta es una etiqueta");
        
       
        //lineaDeEdad.getChildren().addAll(label,reloj.getEdadActual());
        panelInferior.getChildren().addAll(btnJugar,reloj.getEdadActual(), reloj.getLimpiezaActual(), reloj.getAnimoActual(), reloj.getAlimentacionActual());
        root.setTop(panelSuperior);
        root.setBottom(panelInferior);
        
        
        root.setCenter(panel);
        panelInferior.setAlignment(Pos.CENTER);
        
        panelSuperior.setAlignment(Pos.CENTER);
         
              
        
     }
    
   
     
     void organizarPanel(){
        panel= new Pane();
        //Crear la elipse con radiusx de 60 y radiusy de 60
        panel.getChildren().addAll(vegeta.getImagenVegeta());
         
     }
     
     void animacion(Node m){
         
        m.setLayoutX(50);
        m.setLayoutY(50);
       
        TranslateTransition translateTransition =
            new TranslateTransition(Duration.millis(5000), m);
        translateTransition.setFromX(50);
        translateTransition.setToX(750);
        translateTransition.setCycleCount(1);
        translateTransition.setAutoReverse(true);
        
        TranslateTransition translateTransition2 =
            new TranslateTransition(Duration.millis(5000), m);
        translateTransition2.setFromX(750);
        translateTransition2.setToX(250);
        translateTransition2.setCycleCount(1);
        translateTransition2.setAutoReverse(true);

        FadeTransition fadeTransition = 
            new FadeTransition(Duration.millis(1000), m);
        fadeTransition.setFromValue(1.0f);
        fadeTransition.setToValue(0.3f);
        fadeTransition.setCycleCount(1);
        fadeTransition.setAutoReverse(true);
        System.out.println(m.getLayoutX());
         System.out.println(m.getLayoutY());
 
        RotateTransition rotateTransition = 
            new RotateTransition(Duration.millis(4000), m);
        rotateTransition.setByAngle(30f);
        rotateTransition.setCycleCount(2);
        rotateTransition.setAutoReverse(true);
 
        ScaleTransition scaleTransition = 
            new ScaleTransition(Duration.millis(2000), m);
        scaleTransition.setFromX(1);
        scaleTransition.setFromY(1);
        scaleTransition.setToX(1.2);
        scaleTransition.setToY(1.2);
        
        scaleTransition.setAutoReverse(true);
        
        
        TranslateTransition translateTransition1 =
            new TranslateTransition(Duration.millis(5000), m);
        translateTransition1.setFromY(50);
        translateTransition1.setToY(350);
        translateTransition1.setCycleCount(1);
        translateTransition1.setAutoReverse(true);
        
        TranslateTransition translateTransition5 =
            new TranslateTransition(Duration.millis(5000), m);
        translateTransition5.setFromY(350);
        translateTransition5.setToY(100);
        translateTransition5.setCycleCount(1);
        translateTransition5.setAutoReverse(true);
        
        
        
        
        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(translateTransition,scaleTransition,
        rotateTransition,translateTransition1,translateTransition2,translateTransition5);
        sequentialTransition.setCycleCount(Timeline.INDEFINITE);
        sequentialTransition.setAutoReverse(true);

        sequentialTransition.play();

        
    
    }
     
     
     BorderPane getRoot(){
        return root;
    }

    Object getChildren() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
