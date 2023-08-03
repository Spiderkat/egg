package colecciones.Entidades;


public class HotelAlojamiento {
    
    String idReserva;

    public HotelAlojamiento(String idReserva) {
        this.idReserva = idReserva;
    }
    

    // getter
    public String getIdReserva() { return idReserva; }

    // setter
    public void setIdReserva(String idReserva) { this.idReserva = idReserva; }

    // toString
    public String toString() {
        return "Alojamiento [idReserva=" + idReserva + "]";
    }
    
}
