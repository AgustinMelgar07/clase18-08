import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ventana ventana = new Ventana();

        //pone en escucha al marco
        ventana.addKeyListener(new key());
    }
}
