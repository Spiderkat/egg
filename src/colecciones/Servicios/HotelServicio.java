package colecciones.Servicios;

import colecciones.Entidades.HotelAlojamiento;
import colecciones.Entidades.HotelHabitacion;
import colecciones.Entidades.HotelPersona;
import colecciones.Entidades.HotelReserva;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HotelServicio {
    
    private Map<Integer, HotelPersona> personas = new HashMap<>();
    Map<Integer, HotelHabitacion> habitaciones = new HashMap<>();
    Map<String, HotelReserva> reservas = new HashMap<>();
    Map<String, HotelAlojamiento> alojamientos = new HashMap<>();

    // Métodos CRUD para Persona, Habitacion, Reserva y Alojamiento
    void agregarPersona(HotelPersona persona) { personas.put(persona.getDni(), persona); }
    void modificarPersona(int dni, HotelPersona persona) { personas.put(dni, persona); }
    void eliminarPersona(int dni) { personas.remove(dni); }
    HotelPersona obtenerPersona(int dni) { return personas.get(dni); }

    void agregarHabitacion(HotelHabitacion habitacion) { habitaciones.put(habitacion.getNumeroHabitacion(), habitacion); }
    void modificarHabitacion(int numeroHabitacion, HotelHabitacion habitacion) { habitaciones.put(numeroHabitacion, habitacion); }
    void eliminarHabitacion(int numeroHabitacion) { habitaciones.remove(numeroHabitacion); }
    HotelHabitacion obtenerHabitacion(int numeroHabitacion) { return habitaciones.get(numeroHabitacion); }

    void agregarReserva(HotelReserva reserva) { reservas.put(reserva.getId(), reserva); }
    void modificarReserva(String id, HotelReserva reserva) { reservas.put(id, reserva); }
    void eliminarReserva(String id) { reservas.remove(id); }
    HotelReserva obtenerReserva(String id) { return reservas.get(id); }

    void agregarAlojamiento(HotelAlojamiento alojamiento) { alojamientos.put(alojamiento.getIdReserva(), alojamiento); }
    void modificarAlojamiento(String idReserva, HotelAlojamiento alojamiento) { alojamientos.put(idReserva, alojamiento); }
    void eliminarAlojamiento(String idReserva) { alojamientos.remove(idReserva); }
    HotelAlojamiento obtenerAlojamiento(String idReserva) { return alojamientos.get(idReserva); }
    
    void mostrarPersonas() {
    for (Map.Entry<Integer, HotelPersona> entry : personas.entrySet()) {
        System.out.println("DNI: " + entry.getKey() + "\n" + entry.getValue().toString());
    }
}
    
    void mostrarHabitaciones() {
    for (Map.Entry<Integer, HotelHabitacion> entry : habitaciones.entrySet()) {
        System.out.println("Numero de Habitacion: " + entry.getKey() + "\n" + entry.getValue().toString());
    }
}
    
    void mostrarReservas() {
    for (Map.Entry<String, HotelReserva> entry : reservas.entrySet()) {
        System.out.println("ID: " + entry.getKey() + "\n" + entry.getValue().toString());
    }
}

    void mostrarAlojamientos() {
    for (Map.Entry<String, HotelAlojamiento> entry : alojamientos.entrySet()) {
        System.out.println("ID Reserva: " + entry.getKey() + "\n" + entry.getValue().toString());
    }
}
    
    
    void mostrarMenu() {
        System.out.println("1. Agregar Persona");
        System.out.println("2. Modificar Persona");
        System.out.println("3. Eliminar Persona");
        System.out.println("4. Mostrar Personas");
        System.out.println("");
        System.out.println("5. Agregar Habitacion");
        System.out.println("6. Modificar Habitacion");
        System.out.println("7. Eliminar Habitacion");
        System.out.println("8. Mostrar Habitacion");
        System.out.println("");
        System.out.println("9. Agregar Reserva");
        System.out.println("10. Modificar Reserva");
        System.out.println("11. Eliminar Reserva");
        System.out.println("12. Mostrar Reserva");
        System.out.println("");
        System.out.println("13. Agregar Alojamiento");
        System.out.println("14. Modificar Alojamiento");
        System.out.println("15. Eliminar Alojamiento");
        System.out.println("16. Mostrar Alojamiento");
        
        System.out.println("0. Salir");
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            mostrarMenu();
            String opcion = scanner.next();
             switch (opcion) {
            case "1":
                System.out.println("Introduce el nombre, edad, dni y pais de la persona (separados por un enter)");
                agregarPersona(new HotelPersona(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next()));
                break;
            case "2":
                System.out.println("Introduce el dni de la persona a modificar y los nuevos datos (nombre, edad, dni y pais)");
                modificarPersona(scanner.nextInt(), new HotelPersona(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next()));
                break;
            case "3":
                System.out.println("Introduce el dni de la persona a eliminar");
                eliminarPersona(scanner.nextInt());
                break;
            case "4":
                mostrarPersonas();
                break;
            case "5":
                System.out.println("Introduce el número de habitación y la fecha de ocupación (AAAA-MM-DD) de la habitación (separados por un enter)");
                agregarHabitacion(new HotelHabitacion(scanner.nextInt(), Date.valueOf(scanner.next())));
                break;
            case "6":
                System.out.println("Introduce el número de la habitación a modificar y los nuevos datos (número de habitación y fecha de ocupación AAAA-MM-DD)");
                modificarHabitacion(scanner.nextInt(), new HotelHabitacion(scanner.nextInt(), Date.valueOf(scanner.next())));
                break;
            case "7":
                System.out.println("Introduce el número de la habitación a eliminar");
                eliminarHabitacion(scanner.nextInt());
                break;
            case "8":
                mostrarHabitaciones();
                break;
            case "9":
                System.out.println("Introduce el ID, número de habitación, cantidad de personas y fecha de la reserva (AAAA-MM-DD) (separados por un enter)");
                agregarReserva(new HotelReserva(scanner.next(), scanner.nextInt(), scanner.nextInt(), Date.valueOf(scanner.next())));
                break;
            case "10":
                System.out.println("Introduce el ID de la reserva a modificar y los nuevos datos (ID, número de habitación, cantidad de personas y fecha de la reserva AAAA-MM-DD)");
                modificarReserva(scanner.next(), new HotelReserva(scanner.next(), scanner.nextInt(), scanner.nextInt(), Date.valueOf(scanner.next())));
                break;
            case "11":
                System.out.println("Introduce el ID de la reserva a eliminar");
                eliminarReserva(scanner.next());
                break;
            case "12":
                mostrarReservas();
                break;
            case "13":
                System.out.println("Introduce el ID de la reserva para el alojamiento");
                agregarAlojamiento(new HotelAlojamiento(scanner.next()));
                break;
            case "14":
                System.out.println("Introduce el ID de la reserva a modificar y el nuevo ID de la reserva para el alojamiento");
                modificarAlojamiento(scanner.next(), new HotelAlojamiento(scanner.next()));
                break;
            case "15":
                System.out.println("Introduce el ID de la reserva del alojamiento a eliminar");
                eliminarAlojamiento(scanner.next());
                break;
            case "16":
                mostrarAlojamientos();
                break;
            case "0":
                scanner.close();
                return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    
}
