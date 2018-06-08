
public class Anuncio extends Publicacion{
	private String contenido;

    public Anuncio(String contenido) {
        super();
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
