/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresfiles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernanda Torres
 */
public class Movies implements Serializable {
    public List<Movie> peliculas=new ArrayList<>();

    @Override
    public String toString() {
        return "Movies{" + "peliculas=" + peliculas + '}';
    }
    
}
