public class Paciente {

    private int expediente;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;

    public Paciente(int expediente, String nombre, String apellido,
                    int edad, String telefono) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }

    public int getExpediente() {
        return expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarDatos() {
        System.out.println("----- DATOS DEL PACIENTE -----");
        System.out.println("Expediente: " + expediente);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
    }
}