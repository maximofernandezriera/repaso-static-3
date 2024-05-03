public class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    public Persona() {
        incrementarContador();
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        incrementarContador();
    }
    public void setNombre(String nom) {
        nombre = nom;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int ed) {
        edad = ed;
    }
    public int getEdad() {
        return edad;
    }
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static int incrementarContador() {
        return contadorPersonas++;
    }
}