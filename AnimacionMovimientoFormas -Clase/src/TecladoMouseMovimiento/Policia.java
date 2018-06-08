/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TecladoMouseMovimiento;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Policia {
    private int ciudadanosArrestados;
    private ImageView imagenPolicia;
    private static final String ARCHIVO_IMAGEN="/imagenes/Policia_Eddie.png";
    
    Policia(){
        inicializarElementos();
       
        
    }
    public void inicializarElementos(){
        imagenPolicia= new ImageView(new Image(ARCHIVO_IMAGEN));
        imagenPolicia.setFitHeight(80);
        imagenPolicia.setFitWidth(80);
    }
  
    public ImageView getImagenPolicia() {
        return imagenPolicia;
    }
    
}
