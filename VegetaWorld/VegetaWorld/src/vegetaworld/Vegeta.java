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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Vegeta {
    private int nivelRebelion;
    private ImageView imagenvegeta;
    private static final String ARCHIVO_IMAGEN="/imagenes/vegeta.jpg";
    int edad;
    int edadMaxima;
    int Alimentacion;
    int Limpieza;
    int Animo;
    int semillas;
    
    Vegeta(){
        imagenvegeta= new ImageView(new Image(ARCHIVO_IMAGEN));
        imagenvegeta.setFitHeight(150);
        imagenvegeta.setFitWidth(100);
        edad = 0;
        edadMaxima = 500;
        Alimentacion=Limpieza=Animo=10;
        semillas = 500;
    }

    public int getSemillas() {
        return semillas;
    }

    public void setSemillas(int semillas) {
        this.semillas = semillas;
    }



    public void setImagenvegeta(ImageView imagenvegeta) {
        this.imagenvegeta = imagenvegeta;
    }

    public ImageView getImagenVegeta() {
        return imagenvegeta;
    }

    public void setNivelRebelion(int nivelRebelion) {
        this.nivelRebelion = nivelRebelion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public void setAlimentacion(int Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    public void setLimpieza(int Limpieza) {
        this.Limpieza = Limpieza;
    }

    public void setAnimo(int Animo) {
        this.Animo = Animo;
    }

    public int getNivelRebelion() {
        return nivelRebelion;
    }

    public ImageView getImagenvegeta() {
        return imagenvegeta;
    }

    public static String getARCHIVO_IMAGEN() {
        return ARCHIVO_IMAGEN;
    }

    public int getEdad() {
        return edad;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public int getAlimentacion() {
        return Alimentacion;
    }

    public int getLimpieza() {
        return Limpieza;
    }

    public int getAnimo() {
        return Animo;
    }

    Label setText(String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
