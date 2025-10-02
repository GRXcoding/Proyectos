/**
 * Clase que representa a un empleado.
 */
public class Empleado {
    /**
     * Atributos de la clase Empleado.
     */
    private String nombre;
    private String cargo;
    private double salario;

    /**
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Establece el nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo Establece el cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return Salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario Establece el salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Devuelve una representación en String del empleado.
     * @return Cadena con los datos del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}