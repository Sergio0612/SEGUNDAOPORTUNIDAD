
abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double salarioMensual;

    public Empleado(String nombre, int edad, double salarioMensual) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioMensual = salarioMensual;
    }

    public abstract double calcularSalarioMensual();

    public abstract String obtenerDetalles();
}