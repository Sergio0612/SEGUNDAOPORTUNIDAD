
class EmpleadoBase extends Empleado {
    private double salarioBase;

    public EmpleadoBase(String nombre, int edad, double salarioMensual, double salarioBase) {
        super(nombre, edad, salarioMensual);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioMensual + salarioBase;
    }

    @Override
    public String obtenerDetalles() {
        return "Empleado Base:\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Salario Base: " + salarioBase + "\n" +
                "Salario Mensual: " + calcularSalarioMensual();
    }
}