import javax.swing.*;

public class Programa {


public static void main(String[] args){




    String titular = JOptionPane.showInputDialog("Ingrese Nombre De el Titular: ");
    float cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Monto Inicial : "));

    Cuenta cuentaNro1 = new Cuenta(titular,cantidad);


    float ingresarMonto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Monto a Depositar : "));

    cuentaNro1.ingresar(ingresarMonto);

    float extraerMonto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Monto a Retirar: "));

    cuentaNro1.retirar(extraerMonto);

    JOptionPane.showMessageDialog(null,""+cuentaNro1.retirar(extraerMonto));


}
}
