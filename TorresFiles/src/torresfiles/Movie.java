/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresfiles;

import java.io.Serializable;

/**
 *
 * @author Fernanda Torres
 */
public class Movie implements Serializable {
    private int id;
    private String anio,title,genero;

    public Movie(int id, String anio, String title, String genero) {
        this.id = id;
        this.anio = anio;
        this.title = title;
        this.genero = genero;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", anio=" + anio + ", title=" + title + ", genero=" + genero + '}';
    }
    
    
}
