
public class Main {
    public static void main(String[] args) {
        EmpleadoBase empleadoBase = new EmpleadoBase("Sergio", 21, 4800, 1200);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Javier", 21, 1200, 160, 10);
        EmpleadoComision empleadoComision = new EmpleadoComision("Bryan", 22, 900, 100, 15);

        System.out.println(empleadoBase.obtenerDetalles());
        System.out.println(empleadoPorHoras.obtenerDetalles());
        System.out.println(empleadoComision.obtenerDetalles());
    }
}




