import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
public class SidWebBeta {
private static List<Publicacion> publicaciones = new LinkedList<>();
    
    
    public static  void publicarAnuncio(String anuncio) {
        if(anuncio.length() <= 0) {
            System.out.println("El anuncio debe contener texto");
        }
        else { 
            Anuncio aviso = new Anuncio(anuncio);
            publicaciones.add(aviso);
            System.out.println("Publicaci�n notificada al correo a las "+ aviso.getFecha_de_publicaci�n());
        }
        
    }
 
    public static  void publicarLeccion(Date fechalimite,List<String> preguntas) {
        if(preguntas.size() <1) {
            System.out.println("No hay suficientes preguntas.");         
        }
        else {
            Leccion leccion = new Leccion(fechalimite, preguntas);
            publicaciones.add(leccion);
            System.out.println("Publicaci�n notificada al correo a las "+ leccion.getFecha_de_publicaci�n());
        }
    }
 
    public static  void publicarTarea(String enunciado, Date fechaEntrega) {

        if(enunciado.length()< 1) {
            System.out.println("Debe tener un enunciado");         
        }
        else {
            Tarea tarea = new Tarea(fechaEntrega, enunciado);
            publicaciones.add(tarea);
            System.out.println("Publicaci�n notificada al correo a las "+ tarea.getFecha_de_publicaci�n());
        }
    }

    
    
    public static void main(String[] args){
        publicarAnuncio("Ma�ana no hay clases");
        List<String> preguntas = new LinkedList<>();
        preguntas.add("�Que es programaci�n orientada a aspectos?");
        publicarLeccion(new Date(),preguntas );
        publicarTarea("Investigacion ...", new Date());
    }
    
}
