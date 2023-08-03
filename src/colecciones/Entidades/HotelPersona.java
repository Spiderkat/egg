package colecciones.Entidades;


public class HotelPersona {
    
    String nombre;
    int edad;
    int dni;
    String pais;

    public HotelPersona(String nombre, int edad, int dni, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.pais = pais;
    }

    // getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public int getDni() { return dni; }
    public String getPais() { return pais; }

    // setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setDni(int dni) { this.dni = dni; }
    public void setPais(String pais) { this.pais = pais; }

    @Override
    public String toString() {
        return "HotelPersona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", pais=" + pais + '}';
    }
      
    
}


