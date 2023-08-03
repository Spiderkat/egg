package colecciones.Servicios;

import colecciones.Entidades.Libro;
import java.util.HashSet;
import java.util.Set;


public class LibroService {
    
    private Set<Libro> libros;

    public LibroService() {
        libros = new HashSet<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public boolean prestamo(String titulo) {
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null && libro.getNumEjemplares() > libro.getNumEjemplaresPrestados()) {
            libro.incrementarPrestados();
            return true;
        }
        return false;
    }

    public boolean devolucion(String titulo) {
        Libro libro = buscarLibroPorTitulo(titulo);
        if (libro != null && libro.getNumEjemplaresPrestados() > 0) {
            libro.decrementarPrestados();
            return true;
        }
        return false;
    }
    
    public int MostrarLibros(){
      return libros.size();  
       
}
    
}
