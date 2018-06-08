import java.util.Date;

public class Publicacion {
protected Date fecha_de_publicación;
    
    public Publicacion(){
        this.fecha_de_publicación = new Date();
    }

    public Date getFecha_de_publicación() {
        return fecha_de_publicación;
    }

    public void setFecha_de_publicación(Date fecha_de_publicación) {
        this.fecha_de_publicación = fecha_de_publicación;
    }
}
