import java.util.Date;
import java.util.List;

public class Leccion  extends Publicacion {
	private Date fecha_limite;
    private List<String> preguntas;

    public Leccion(Date fecha, List<String> preguntas) {
        super();
        this.fecha_limite = fecha;
        this.preguntas = preguntas;
    }

    public Date getFecha_limite() {
        return fecha_limite;
    }

    public void setFecha_limite(Date fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    
    public List<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<String> preguntas) {
        this.preguntas = preguntas;
    }
}
