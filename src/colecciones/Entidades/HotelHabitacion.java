package colecciones.Entidades;

import java.util.Date;


public class HotelHabitacion {
    
    int numeroHabitacion;
    Date fechaOcupacion;

    public HotelHabitacion(int numeroHabitacion, Date fechaOcupacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.fechaOcupacion = fechaOcupacion;
    }
    

    // getters
    public int getNumeroHabitacion() { return numeroHabitacion; }
    public Date getFechaOcupacion() { return fechaOcupacion; }

    // setters
    public void setNumeroHabitacion(int numeroHabitacion) { this.numeroHabitacion = numeroHabitacion; }
    public void setFechaOcupacion(Date fechaOcupacion) { this.fechaOcupacion = fechaOcupacion; }

    // toString
    public String toString() {
        return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", fechaOcupacion=" + fechaOcupacion + "]";
    }
    
}
