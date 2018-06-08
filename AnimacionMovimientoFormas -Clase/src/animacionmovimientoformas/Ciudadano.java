/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionmovimientoformas;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Ciudadano {
    private int nivelRebelion;
    private ImageView imagenCiudadano;
    private static final String ARCHIVO_IMAGEN="/imagenes/futbolista-oscuro.png";
    Ciudadano(int nivelRebelion){
        imagenCiudadano= new ImageView(new Image(ARCHIVO_IMAGEN));
        imagenCiudadano.setFitHeight(60);
        imagenCiudadano.setFitWidth(60);
        
        this.nivelRebelion= nivelRebelion;
    }

    public ImageView getImagenCiudadano() {
        return imagenCiudadano;
    }
    
}
