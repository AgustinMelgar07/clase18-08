import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class key implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE) System.out.println("preciono el espacio");
        if(e.getKeyCode()==KeyEvent.VK_V){
            Ventana ventana2 = new Ventana();
            ventana2.iniciarcomponentes();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
