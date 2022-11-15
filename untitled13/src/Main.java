import javax.swing.*;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {
	// write your code here|

        OpcionesClientes adminClientes = new OpcionesClientes();
        // menu
        int opcion = 0;
        int opcion2 = 0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("opciones: ");
            System.out.println("1) Crear Cliente");
            System.out.println("2) Listar clientes");
            System.out.println("3) Buscar y listar datos completos de un cliente");
            System.out.println("4) Buscar y eliminar un cliente");
            System.out.println("5) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            //leer.nextLine();
            switch (opcion) {
                case 1:
                    //add Client
                    System.out.println("\n 1) Crear Cliente");
                    adminClientes.agregarCliente();
                    do {
                    System.out.println("Opciones: ");
                    System.out.println("1) Crear Cuenta");
                    System.out.println("2) Listar Cuentas");
                    System.out.println("3) Buscar y eliminar una Cuenta");
                    System.out.println("4) Salir");
                    System.out.print("Ingrese una opcion: ");
                    opcion2 = leer.nextInt();
                       Cliente cliente = new Cliente(adminClientes.nombres,adminClientes.dnis);
                        System.out.println(adminClientes.nombres+adminClientes.dnis);
                        switch (opcion2){
                        case 1:
                            //add Client
                            cliente.agregarCuenta();
                            break;
                        case 2:
                            //list of clientes
                            System.out.println("\n 2) Listar Cuentas\"");
                            cliente.mostrarNombredeCuenta(cliente.nombreCuenta);
                            break;
                        case 3:
                            //delete a client
                            System.out.println("\n 4) Buscar y eliminar una Cuenta");
                            adminClientes.eliminarCliente();
                            break;
                        case 4:
                            //exit
                            System.out.println("\n 5) Salir");
                            break;
                        default:
                            System.out.println("\n Opcion incorrecta");
                            break;
                    }
                    } while (opcion2 != 4);

                    break;
                case 2:
                    //list of clientes
                    System.out.println("\n 2) Listar clientes");
                    adminClientes.listarClientes();
                    break;
                case 3:
                    //search a client
                    System.out.println("\n 3) Buscar por nombre y listar datos completos de un cliente");
                    adminClientes.buscarCliente();
                    break;
                case 4:
                    //delete a client
                    System.out.println("\n 4) Buscar y eliminar un cliente");
                    adminClientes.eliminarCliente();
                    break;
                case 5:
                    //exit
                    System.out.println("\n 5) Salir");
                    break;
                default:
                    System.out.println("\n Opcion incorrecta");
                    break;
            }
        } while (opcion != 5);
    }

}
