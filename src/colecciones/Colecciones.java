package colecciones;

import colecciones.Entidades.Libro;
import colecciones.Servicios.LibroService;
import java.util.Scanner;



public class Colecciones {

    
    public static void main(String[] args) {
        
        LibroService libroService = new LibroService();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            System.out.println("Elegir opcion: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese titulo del libro: ");
                    String titulo = scanner.next();
                    System.out.println("Ingrese autor del libro: ");
                    String autor = scanner.next();
                    System.out.println("Ingrese número de ejemplares: ");
                    int numEjemplares = scanner.nextInt();
                    libroService.agregarLibro(new Libro(titulo, autor, numEjemplares));
                    break;
                case 2:
                    System.out.println("Ingrese titulo del libro a prestar: ");
                    titulo = scanner.next();
                    if (libroService.prestamo(titulo)) {
                        System.out.println("Libro prestado con éxito.");
                    } else {
                        System.out.println("No se pudo prestar el libro. Por favor, verifique el título y la disponibilidad.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese titulo del libro a devolver: ");
                    titulo = scanner.next();
                    if (libroService.devolucion(titulo)) {
                        System.out.println("Libro devuelto con éxito.");
                    } else {
                        System.out.println("No se pudo devolver el libro. Por favor, verifique el título y si ha sido prestado.");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
        
    }
    
}









//==========================================================================================
//    import colecciones.Entidades.CantanteFamoso;
//    import java.util.ArrayList;
//    import java.util.List;
//    import java.util.Scanner;
//
//                Ejercicio extra # 2 colecciones
//
//Scanner scanner = new Scanner(System.in).useDelimiter("\n");
//        List<CantanteFamoso> listaCantantes = new ArrayList<>();
//
//        listaCantantes.add(new CantanteFamoso("Cantante1", "Disco1"));
//        listaCantantes.add(new CantanteFamoso("Cantante2", "Disco2"));
//        listaCantantes.add(new CantanteFamoso("Cantante3", "Disco3"));
//        listaCantantes.add(new CantanteFamoso("Cantante4", "Disco4"));
//        listaCantantes.add(new CantanteFamoso("Cantante5", "Disco5"));
//
//        for (CantanteFamoso cantante : listaCantantes) {
//            System.out.println(cantante);
//        }
//        System.out.println("");
//
//        while(true){
//            System.out.println("1. Agregar cantante");
//            System.out.println("2. Eliminar cantante");
//            System.out.println("3. Mostrar todos los cantantes");
//            System.out.println("4. Salir");
//            System.out.println("Elegir opcion: ");
//            int option = scanner.nextInt();
//
//            switch (option) {
//                case 1:
//                    System.out.println("Ingrese nombre del cantante: ");
//                    String nombre = scanner.next();
//                    System.out.println("Ingrese el disco con mas ventas: ");
//                    String disco = scanner.next();
//                    listaCantantes.add(new CantanteFamoso(nombre, disco));
//                    break;
//                case 2:
//                    System.out.println("Ingrese nombre del cantante a eliminar: ");
//                    nombre = scanner.next();
//                    listaCantantes.removeIf(cantante -> cantante.getNombre().equals(nombre));
//                    break;
//                case 3:
//                    for (CantanteFamoso cantante : listaCantantes) {
//                        System.out.println(cantante);
//                    }
//                    System.out.println("");
//                    break;
//                case 4:
//                    System.exit(0);
//                default:
//                    System.out.println("Opcion no valida");
//            }
//        }
//===========================================================================================


//============================================================================================
//
// import colecciones.Servicios.ServicioPelicula;
//
//                                 Ejercicio colecciones #4
//
//    ServicioPelicula sp = new ServicioPelicula();
//        
//        // Cargamos películas ingresadas por el usuario
//        sp.cargarPelicula();
//
//        // Mostramos todas las películas
//        System.out.println("\n--- Todas las Películas ---");
//        sp.mostrarPeliculas();
//
//        // Mostramos todas las películas con una duración mayor a 1 hora
//        System.out.println("\n--- Películas con duración mayor a 1 hora ---");
//        sp.mostrarPeliculasMayorAUnaHora();
//
//        // Ordenamos las películas de acuerdo a su duración (de mayor a menor) y las mostramos
//        System.out.println("\n--- Películas ordenadas por duración (de mayor a menor) ---");
//        sp.ordenarPeliculasPorDuracionDesc();
//
//        // Ordenamos las películas de acuerdo a su duración (de menor a mayor) y las mostramos
//        System.out.println("\n--- Películas ordenadas por duración (de menor a mayor) ---");
//        sp.ordenarPeliculasPorDuracionAsc();
//
//        // Ordenamos las películas por título, alfabéticamente y las mostramos
//        System.out.println("\n--- Películas ordenadas por título ---");
//        sp.ordenarPeliculasPorTitulo();
//
//        // Ordenamos las películas por director, alfabéticamente y las mostramos
//        System.out.println("\n--- Películas ordenadas por director ---");
//        sp.ordenarPeliculasPorDirector();
//================================================================================================