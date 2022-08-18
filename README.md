# clase18-08
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s=new Scanner(System.in);
           /*
        int valor1=Integer.parseInt((JOptionPane.showInputDialog("ingrese un valor")));
        int valor2=Integer.parseInt((JOptionPane.showInputDialog("ingrese un valor")));
        int valor3=valor1+valor2;
        JOptionPane.showMessageDialog(null,valor1+"+"+valor2+"="+valor3);
        */


        /*
        int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese edad"));
        if (edad>=18){
            String carnet =JOptionPane.showInputDialog("tiene carnet?");
            if (carnet.equals("si")){
                JOptionPane.showMessageDialog(null, "puede compar el auto");
            } else {
                JOptionPane.showMessageDialog(null, "no puede comprar el auto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "no puede comprar el auto por ser menor");
        }
        */
        String clave="1234";
        System.out.println("ingese clave");
        String ingreseclave;
        ingreseclave=s.next();
        while (ingreseclave.equals(clave)){
            System.out.println("contaseña incorrecta");
            ingreseclave=s.next();
        }
        System.out.println("contaseña correcta");

        int[] valor=new int[20];
        int contador=0;


    }
}
