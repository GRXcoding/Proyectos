/**
 * Clase que gestiona un conjunto de empleados.
 */
public class Empleados {
    /**
     * Array que almacena la lista de empleados.
     */
    public Empleado[] lista;

    /**
     * @param cantidad Número de empleados a gestionar.
     */
    public Empleados(int cantidad) {
        lista = new Empleado[cantidad];
    }

    /**
     * Da de alta un empleado en la posición indicada.
     * @param indice Índice en el array.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public void darAltaEmpleado(int indice, String nombre, String cargo, double salario) {
        lista[indice] = new Empleado(nombre, cargo, salario);
    }

    /**
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Muestra por pantalla la lista de empleados.
     */
    public void mostrarEmpleados() {
        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}