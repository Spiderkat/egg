package colecciones.Entidades;

public class Libro {
    
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro(String titulo, String autor, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void incrementarPrestados() {
        this.numEjemplaresPrestados++;
    }

    public void decrementarPrestados() {
        this.numEjemplaresPrestados--;
    }

    @Override
    public String toString() {
        return "Libro [Titulo=" + titulo + ", Autor=" + autor + ", Numero de Ejemplares=" + numEjemplares
                + ", Numero de Ejemplares Prestados=" + numEjemplaresPrestados + "]";
    }
    
}
