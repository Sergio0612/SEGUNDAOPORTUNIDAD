
class EmpleadoComision extends Empleado {
    private double ventasRealizadas;
    private double comisionPorVenta;

    public EmpleadoComision(String nombre, int edad, double salarioMensual, double ventasRealizadas, double comisionPorVenta) {
        super(nombre, edad, salarioMensual);
        this.ventasRealizadas = ventasRealizadas;
        this.comisionPorVenta = comisionPorVenta;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioMensual + (ventasRealizadas * comisionPorVenta);
    }

    @Override
    public String obtenerDetalles() {
        return "Empleado por Comisión:\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Ventas Realizadas: " + ventasRealizadas + "\n" +
                "Salario Mensual: " + calcularSalarioMensual();
    }
}