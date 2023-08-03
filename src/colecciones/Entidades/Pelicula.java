package colecciones.Entidades;

import java.util.Comparator;


public class Pelicula {
    
    private String titulo;
    private String director;
    private double duracion;

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                '}';
    }

    public static Comparator<Pelicula> compareByDuracionAsc = Comparator.comparing(Pelicula::getDuracion);

    public static Comparator<Pelicula> compareByDuracionDesc = (p1, p2) -> Double.compare(p2.getDuracion(), p1.getDuracion());

    public static Comparator<Pelicula> compareByTitulo = Comparator.comparing(Pelicula::getTitulo);

    public static Comparator<Pelicula> compareByDirector = Comparator.comparing(Pelicula::getDirector);
    
}
