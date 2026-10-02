import java.util.Scanner;

public class Principal {

    static Scanner scanner = new Scanner(System.in);

    static Doctor doctor;
    static Paciente paciente;
    static Cita cita;

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\n==================================");
            System.out.println("     SISTEMA DE CITAS MEDICAS");
            System.out.println("==================================");
            System.out.println("1. Dar de alta doctor");
            System.out.println("2. Dar de alta paciente");
            System.out.println("3. Crear una cita");
            System.out.println("4. Mostrar informacion");
            System.out.println("5. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    altaDoctor();
                    break;

                case 2:
                    altaPaciente();
                    break;

                case 3:
                    crearCita();
                    break;

                case 4:
                    mostrarInformacion();
                    break;

                case 5:
                    System.out.println("Gracias por utilizar el sistema.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        scanner.close();
    }

    // Alta del doctor
    public static void altaDoctor() {

        System.out.println("\n----- ALTA DE DOCTOR -----");

        System.out.print("Ingrese la cedula: ");
        int cedula = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la especialidad: ");
        String especialidad = scanner.nextLine();

        System.out.print("Ingrese el telefono: ");
        String telefono = scanner.nextLine();

        doctor = new Doctor(
                cedula,
                nombre,
                apellido,
                especialidad,
                telefono
        );

        System.out.println("Doctor registrado correctamente.");
    }

    // Alta del paciente
    public static void altaPaciente() {

        System.out.println("\n----- ALTA DE PACIENTE -----");

        System.out.print("Ingrese el numero de expediente: ");
        int expediente = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el telefono: ");
        String telefono = scanner.nextLine();

        paciente = new Paciente(
                expediente,
                nombre,
                apellido,
                edad,
                telefono
        );

        System.out.println("Paciente registrado correctamente.");
    }

    // Crear cita
    public static void crearCita() {

        System.out.println("\n----- CREAR CITA MEDICA -----");

        if (doctor == null) {
            System.out.println("Primero debe dar de alta un doctor.");
            return;
        }

        if (paciente == null) {
            System.out.println("Primero debe dar de alta un paciente.");
            return;
        }

        System.out.print("Ingrese la fecha de la cita: ");
        String fecha = scanner.nextLine();

        System.out.print("Ingrese la hora de la cita: ");
        String hora = scanner.nextLine();

        System.out.print("Ingrese el motivo de la cita: ");
        String motivo = scanner.nextLine();

        cita = new Cita(
                doctor,
                paciente,
                fecha,
                hora,
                motivo
        );

        System.out.println("Cita creada correctamente.");
        System.out.println("La cita ha sido relacionada con el doctor y el paciente.");
    }

    // Mostrar informacion
    public static void mostrarInformacion() {

        System.out.println("\n==================================");
        System.out.println("       INFORMACION REGISTRADA");
        System.out.println("==================================");

        if (doctor != null) {
            doctor.mostrarDatos();
            System.out.println();
        } else {
            System.out.println("No hay doctor registrado.");
        }

        if (paciente != null) {
            paciente.mostrarDatos();
            System.out.println();
        } else {
            System.out.println("No hay paciente registrado.");
        }

        if (cita != null) {
            cita.mostrarDatos();
        } else {
            System.out.println("No hay cita registrada.");
        }
    }
}