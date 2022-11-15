import java.util.LinkedList;
import java.util.Scanner;

public class Cliente implements Datos{
    private String nombre;
    private int dni;
    private LinkedList<Cuenta> cuentas;
    public Cliente(String nombre, int dni) {
        this.nombre=nombre;
        this.dni=dni;
        this.cuentas = new LinkedList<>();
    }
    OpcionesClientes opcionesClientes;
String nombreCuenta;

    //add Activo to the colection
    public void agregarCuenta(){
        Scanner leer2 = new Scanner(System.in);
        System.out.println("\n 1) Crear Cuenta");
        System.out.print("NOMBRE: ");
        String nombre = leer2.nextLine();
        nombreCuenta=nombre;
        System.out.print("TIPO: ");
        String tipo = leer2.nextLine();
        System.out.print("MONTO:");
        double monto = leer2.nextDouble();
        Cuenta cuenta= new Cuenta(nombre, tipo ,monto);
        this.cuentas.add(cuenta);
    }

    //search activos by name
    public Cuenta mostrarNombredeCuenta(String nombre){
            for (Cuenta cuenta : cuentas) {
                if(cuenta.getNombre().equals(nombre)){
                    return cuenta;
                }
            }
            return null;
        }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String MostrarDatos() {
        return "Cliente{" +
                "Nombre: " + getNombre() +
                ", DNI: " + getDni() +
                ", Activos: " + this.cuentas +
                '}';
    }

}
