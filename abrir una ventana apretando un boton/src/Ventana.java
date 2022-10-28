import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Queue;

public class Ventana extends JFrame {
    JPanel panel =new JPanel();
    public Ventana (){
        setBounds(50,50,500,500);
        setTitle("Nombres");//el titulo de la ventana
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la venta se cierra el programa


    }

    public   void iniciarcomponentes(){
        colocarPaneles();
        colocarEtiquetas();

    }

    public void colocarPaneles(){
        panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);//elimina la ubicacion por defecto de los elementos del poanel
        this.getContentPane().add(panel);

    }
    public   void colocarEtiquetas(){
        JLabel etiqueta =new JLabel();//creamos un etiqueta de texto
        etiqueta.setText("HOLa ");
        etiqueta.setBounds(100,100,200,40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//establecemos la lineacion horizontal del texto
        //etiqueta.setOpaque(true);//habilitamos cambiar el fondo de la etiqueta
        etiqueta.setForeground(Color.white);//cambiamos color de las letras
        //etiqueta.setBackground(Color.red);//el color de fondo de la etiqueta
        etiqueta.setFont(new Font("arial",3,20)); //Establecemos el nombre, estilo y el tamaño
        panel.add(etiqueta);


    }

}
