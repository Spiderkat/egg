package colecciones.Servicios;

import colecciones.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ServicioPelicula {
    
    private List<Pelicula> peliculas;

    public ServicioPelicula() {
        peliculas = new ArrayList<>();
    }

    public void cargarPelicula() {
        Scanner sc = new Scanner(System.in);
        String seguir = "S";
        while (seguir.equalsIgnoreCase("S")) {
            System.out.print("Ingrese el título de la película: ");
            String titulo = sc.nextLine();
            System.out.print("Ingrese el director de la película: ");
            String director = sc.nextLine();
            System.out.print("Ingrese la duración de la película (en horas): ");
            double duracion = sc.nextDouble();
            sc.nextLine();
            peliculas.add(new Pelicula(titulo, director, duracion));
            System.out.print("¿Desea agregar otra película (S/N)? ");
            seguir = sc.nextLine();
        }
    }

    public void mostrarPeliculas() {
        peliculas.forEach(System.out::println);
    }

    public void mostrarPeliculasMayorAUnaHora() {
        peliculas.stream().filter(p -> p.getDuracion() > 1).forEach(System.out::println);
    }

    public void ordenarPeliculasPorDuracionDesc() {
        Collections.sort(peliculas, Pelicula.compareByDuracionDesc);
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorDuracionAsc() {
        Collections.sort(peliculas, Pelicula.compareByDuracionAsc);
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorTitulo() {
        Collections.sort(peliculas, Pelicula.compareByTitulo);
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(peliculas, Pelicula.compareByDirector);
        mostrarPeliculas();
    }
    
}
