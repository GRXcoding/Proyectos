import java.util.Scanner;

/**
 * Clase principal que contiene el método main para gestionar empleados.
 * Permite dar de alta empleados, solicitar un porcentaje de aumento de salario,
 * aplicar el aumento y mostrar la lista de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal de la aplicación.
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados(3);
        empleados.darAltaEmpleado(0, "Juan", "Desarrollador", 50000);
        empleados.darAltaEmpleado(1, "María", "Diseñadora", 45000);
        empleados.darAltaEmpleado(2, "Pedro", "Gerente", 60000);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        empleados.mostrarEmpleados();

        scanner.close();
    }
}