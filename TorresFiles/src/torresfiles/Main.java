/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresfiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernanda Torres
 */
public class Main {
    public static Movies peliculas=new Movies();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            lecturabuffered("tvshows.txt","tvshows1.txt");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lecturaFile("tvshows.txt","tvshows2.txt");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            procesarString(lista_pelis("movies.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(peliculas);
        try {
            guardarObjeto(peliculas);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(recuperarObjeto());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static List<String> lista_pelis(String fileName) throws IOException{
        Path p=Paths.get(fileName);
        return Files.readAllLines(p);
    }
    public static void lecturabuffered(String s1,String s2) throws FileNotFoundException, IOException{
        BufferedReader bf=new BufferedReader(new FileReader(s1));
        BufferedWriter bw=new BufferedWriter(new FileWriter(s2));
        String line;
        try {
            while((line=bf.readLine())!=null){
                bw.write(line);
                bw.write("\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        bf.close();
        bw.close();
        System.out.println("Lectura Buffered exitosa");
    }
    public static void lecturaFile(String s1,String s2) throws IOException{
        try (FileReader fr=new FileReader(s1)){
           try(FileWriter fw=new FileWriter(s2)){
               int line;
               while((line=fr.read())!=-1){
                   fw.write(line);
               }
           }
        
        }
        System.out.println("Lectura File Exitosa");
    }
    public static void procesarString(List<String> lista){
        for(String s:lista){
            String[] s1 = s.split("::");
            String id=s1[0];
            int id_real=Integer.parseInt(id);
            String genero=s1[2];
            String s2a=s1[1].substring(0,s1[1].length()-6);
            String s2b=s1[1].substring(s1[1].length()-6);
            
            peliculas.peliculas.add(new Movie(id_real,s2b,s2a,genero));
        }
    }
    public static void guardarObjeto(Movies m) throws FileNotFoundException, IOException{
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("movies.obj")))) {
            oos.writeObject(m);
            System.out.println("Objeto serializado correctamente");
        }
    }
    public static Movies recuperarObjeto() throws FileNotFoundException, IOException, ClassNotFoundException{
        Movies m;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("movies.obj")))) {
            m = (Movies) ois.readObject();
            System.out.println("Objeto deserializado correctamente");
        }
        return m;
    }
}
