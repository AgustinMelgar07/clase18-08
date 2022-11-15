import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class OpcionesClientes {
    private LinkedList<Cliente> clientes;
    public OpcionesClientes() {
        this.clientes = new LinkedList<>();
    }
String nombres;
    int dnis;
    public void agregarCliente() {
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombre = leer.nextLine();

        System.out.print("DNI:");
        int dni = leer.nextInt();

        Cliente cliente = new Cliente(nombre, dni);
        nombres= cliente.getNombre();
        dnis= cliente.getDni();
        this.clientes.add(cliente);
    }

    public void listarClientes(){
        for (Cliente cliente1 : clientes) {
            System.out.println(cliente1.MostrarDatos());
        }
    }

    public void buscarCliente(){
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombreCliente = leer.nextLine();
        for (Cliente cliente1 : clientes) {
            if (cliente1.getNombre().equals(nombreCliente)) {
                System.out.println(cliente1.MostrarDatos());
                break;
            }
        }
    }

    public void eliminarCliente(){
        Scanner leer = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombreCliente1 = leer.nextLine();
        for (Cliente cliente1 : clientes) {
            if (cliente1.getNombre().equals(nombreCliente1)) {
                clientes.remove(cliente1);
                System.out.println("Cliente eliminado");
                break;
            }
        }
    }

}

