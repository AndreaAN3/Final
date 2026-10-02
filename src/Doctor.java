public class Doctor {

    private int cedula;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String telefono;

    public Doctor(int cedula, String nombre, String apellido,
                  String especialidad, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarDatos() {
        System.out.println("----- DATOS DEL DOCTOR -----");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Telefono: " + telefono);
    }
}