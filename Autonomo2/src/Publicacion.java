import java.util.Date;

public class Publicacion {
protected Date fecha_de_publicaci�n;
    
    public Publicacion(){
        this.fecha_de_publicaci�n = new Date();
    }

    public Date getFecha_de_publicaci�n() {
        return fecha_de_publicaci�n;
    }

    public void setFecha_de_publicaci�n(Date fecha_de_publicaci�n) {
        this.fecha_de_publicaci�n = fecha_de_publicaci�n;
    }
}
