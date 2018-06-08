import java.util.Date;

public class Tarea extends Publicacion{
	private Date fechaEntrega;
    private String enunciado;

    public Tarea(Date fechaEntrega, String enunciado) {
        super();
        this.fechaEntrega = fechaEntrega;
        this.enunciado = enunciado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
}
