import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    //Esto indica al sistema cuando se presiona alguna de las teclas AWSD.
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode(); //Devuelve un numero de la tecla que se presiono.

        if(code == KeyEvent.VK_W){
            upPressed = true;

        }
        if(code == KeyEvent.VK_S){
            downPressed = true;
            
        }
        if(code == KeyEvent.VK_A){
            leftPressed = true;
        }
        if(code == KeyEvent.VK_D){
            rightPressed = true;
        }
        
    }

    //Esto indica al sistema cuando se solto alguna de las teclas AWSD.
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = false;

        }
        if(code == KeyEvent.VK_S){
            downPressed = false;
            
        }
        if(code == KeyEvent.VK_A){
            leftPressed = false;
        }
        if(code == KeyEvent.VK_D){
            rightPressed = false;
        }
        
    } //El KeyListener sirve para recibir las teclas del usuario.
    
}
