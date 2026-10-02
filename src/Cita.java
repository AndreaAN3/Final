public class Cita {

    private Doctor doctor;
    private Paciente paciente;
    private String fecha;
    private String hora;
    private String motivo;

    public Cita(Doctor doctor, Paciente paciente,
                String fecha, String hora, String motivo) {
        this.doctor = doctor;
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public void mostrarDatos() {
        System.out.println("----- DATOS DE LA CITA -----");

        System.out.println("Doctor: "
                + doctor.getNombre() + " "
                + doctor.getApellido());

        System.out.println("Especialidad: "
                + doctor.getEspecialidad());

        System.out.println("Paciente: "
                + paciente.getNombre() + " "
                + paciente.getApellido());

        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Motivo: " + motivo);
    }
}