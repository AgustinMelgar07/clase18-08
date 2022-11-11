import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana3 extends JFrame{
    Cliente cliente= new Cliente();
    JPanel panel =new JPanel();
    public  Ventana3(){
        setSize(500,500);//establecemos el tamaño
        // setLocation(550,200);//estableces la posicion
        // setBounds(300,200,500,500);//establece la poscion y el tamaño de la ventana
        setTitle("Nombres");//el titulo de la ventana
        setLocationRelativeTo(null);//establecemos la pantalla en el centro
        setMinimumSize(new Dimension(200,200));//establece el tamaño minimo
        iniciarcomponentes2();
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la venta se cierra el programa

    }
    public   void iniciarcomponentes2(){
        colocarPaneles2();
        Activo();
        Pasivo();
        Patrimonio_neto();
        Resultado_positivo();
        Resultado_negativo();

    }
    public  void colocarPaneles2(){
        panel = new JPanel();
        panel.setLayout(null);//elimina la ubicacion por defecto de los elementos del poanel
        this.getContentPane().add(panel);

    }
    private  void Activo() {
        JButton boton1 = new JButton("ACtivo");
        boton1.setBounds(50, 50, 100, 40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial",3, 15));
        panel.add(boton1);
        ActionListener oyentedeAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    listaDespegables v=new listaDespegables();
v.setVisible(true);
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        };

        boton1.addActionListener(oyentedeAccion1);
    }
    private  void Pasivo() {
        JButton boton1 = new JButton("Pasivo");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial", 3, 15));
        panel.add(boton1);
        ActionListener oyentedeAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Pasivo v=new Pasivo();
v.setVisible(true);
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        };

        boton1.addActionListener(oyentedeAccion2);
    }
    private   void Patrimonio_neto() {
        JButton boton1 = new JButton("Patrimonio Neto");
        boton1.setBounds(150, 150, 100, 40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial", 3, 15));
        panel.add(boton1);
        ActionListener oyentedeAccion5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    PN v=new PN();

                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        };

        boton1.addActionListener(oyentedeAccion5);
    }
    private  void Resultado_positivo() {
        JButton boton1 = new JButton("Resultado Positivo");
        boton1.setBounds(200, 200, 100, 40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial", 3, 15));
        panel.add(boton1);
        ActionListener oyentedeAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    RP v=new RP();

                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        };

        boton1.addActionListener(oyentedeAccion3);
    }
    private  void Resultado_negativo() {
        JButton boton1 = new JButton("Resultado Negativo");
        boton1.setBounds(250, 250, 100, 40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial", 3, 15));
        panel.add(boton1);
        ActionListener oyentedeAccion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    RN v=new RN();
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        };

        boton1.addActionListener(oyentedeAccion4);
    }



}
