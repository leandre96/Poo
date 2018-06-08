/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vegetajuego;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Policia {
    private int ciudadanosArrestados;
    private ImageView imagenPolicia;
    private static final String ARCHIVO_IMAGEN="/imagenes/vegetaataca.png";
    
    public Policia(){
        imagenPolicia= new ImageView(new Image(ARCHIVO_IMAGEN));
        imagenPolicia.setFitHeight(150);
        imagenPolicia.setFitWidth(150);
       
        
    }

    public void setImagenPolicia(ImageView imagenPolicia) {
        this.imagenPolicia = imagenPolicia;
    }
    
  
    public ImageView getImagenPolicia() {
        return imagenPolicia;
    }
    
}
