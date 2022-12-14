import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Esto se usa para cerrar cerrrar correctamente la ventana
        window.setResizable(false); //Con esto el usuario no puede modificar el tamaño de la ventana
        window.setTitle("Zelda al pedo"); //Configuracion del titulo del juego

        //Aqui llamamos a la clase GamePanel creando un nuevo gamePanel para agregarla a esta ventana.
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel); //Aqui agregamos el gamePanel creado en GamePanel a la ventana

        window.pack(); //Con esto llamamos a la ventana con todas las configuraciones preestablecidas

        window.setLocationRelativeTo(null); //Con esto la ventana se mostrara al centro
        window.setVisible(true); //Con esto podemos ver la ventana

        gamePanel.startGameThread(); //Con esto llamamos los controles para mover el rectangulo




        
    }

    
}
