
class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoPorHoras(String nombre, int edad, double salarioMensual, int horasTrabajadas, double salarioPorHora) {
        super(nombre, edad, salarioMensual);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalarioMensual() {
        return horasTrabajadas * salarioPorHora;
    }

    @Override
    public String obtenerDetalles() {
        return "Empleado por Horas:\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Horas Trabajadas: " + horasTrabajadas + "\n" +
                "Salario Mensual: " + calcularSalarioMensual();
    }
}