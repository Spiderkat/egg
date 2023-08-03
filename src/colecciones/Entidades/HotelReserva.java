package colecciones.Entidades;

import java.util.Date;


public class HotelReserva {
    
    String id;
    int numeroHabitacion;
    int cantidadPersonas;
    Date fechas;

    public HotelReserva(String id, int numeroHabitacion, int cantidadPersonas, Date fechas) {
        this.id = id;
        this.numeroHabitacion = numeroHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.fechas = fechas;
    }
    

    // getters
    public String getId() { return id; }
    public int getNumeroHabitacion() { return numeroHabitacion; }
    public int getCantidadPersonas() { return cantidadPersonas; }
    public Date getFechas() { return fechas; }

    // setters
    public void setId(String id) { this.id = id; }
    public void setNumeroHabitacion(int numeroHabitacion) { this.numeroHabitacion = numeroHabitacion; }
    public void setCantidadPersonas(int cantidadPersonas) { this.cantidadPersonas = cantidadPersonas; }
    public void setFechas(Date fechas) { this.fechas = fechas; }

    // toString
    public String toString() {
        return "Reserva [id=" + id + ", numeroHabitacion=" + numeroHabitacion + ", cantidadPersonas=" + cantidadPersonas + ", fechas=" + fechas + "]";
    }
    
}
