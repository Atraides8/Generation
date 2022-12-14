import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GamePanel extends JPanel implements Runnable { // Con el "extends" hacemos que el GamePanel herede
                                                            // funciones de JPanel

    // Configuraciones de pantalla
    final int originalTileSize = 16; // Mosaico de 16 x 16 --> PJ, NPC y los mosaicos del mapa del juego.
    final int scale = 3; // Con esto escalamos

    final int tileSize = originalTileSize * scale; // Mosaico de 48x48, este sera el tamaño real del mosaico del juego
    // Acontinuacion decidimos cuantos mosaicos queremos mostrar en la pantalla del
    // juego,
    // tanto horizontal como verticalmente.
    final int maxScreenCol = 16; // Numero de columnas
    final int maxScreenRow = 12; // Numero de filas

    // Lo siguiente es definir el tamaño de la pantalla usando el tamaño del mosaico
    // y la cantidad de mosaicos que queramos mostrar en pantallas.
    final int screenWidth = tileSize * maxScreenCol; // Ancho 768 pixeles
    final int screenHeight = tileSize * maxScreenRow; // Altura 576 pixeles

    // Configurando los FPS
    int FPS = 60;

    // Instanciamos el controlador de teclars
    KeyHandler keyH = new KeyHandler();

    // Este sera un subproceso, nos ayudara para inventar un "tiempo" en el juego
    Thread gameThread;

    // Definiendo algunas posiciones predeterminados
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    // Constructor
    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenWidth));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true); // Con esta funcion el GamePanel puede ser enfocado a recibir teclas de
                                 // entradas.
    }

    // Aqui instanciamos el GamePanel a iniciar el subproceso
    public void startGameThread() {

        gameThread = new Thread(this); // Aqui lo instanciamos
        gameThread.start(); // Aqui iniciamos el subproceso

    }

    // Metodo de ejecucion del subproceso
    @Override
    public void run() {
        // Aqui creamos un bucle que repite siempre que existe un subproceso (gameThread
        // != null)
        // Esto es necesario para mantener la informacion que ingresa actualizado dentro
        // de la pantalla
        // En conclusion siempre que este subproceso este activo, seguira llamando a
        // actualizar y repintar

        // Con esto definimos que queremos dibujar en la pantalla cada 0,016 sg
        double drawInterval = 1000000000 / FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {

            // long currentTime = System.nanoTime(); //Para verificar la hora actual de
            // sistema, se puede usar esta funcion
            // long currentTime2 = System.currentTimeMillis();
            // 1 ACTUALIZA: actualiza la posicion del pj
            update();

            // 2 DIBUJA: actualiza la informacion que muestra en pantalla
            repaint();

            try {
                // Con esto verificamos cuanto tiempo queda despues de que el sistema dibuja y
                // actualiza
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000; // Convertimos los nanosg a milisg

                // Esto se usa en caso de que ocupemos todo el tiempo asignado
                if (remainingTime < 0) {
                    remainingTime = 0;
                }
                // Ese tiempo que sobra lo "dormimos" en ese lapso de tiempo
                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void update() {
        // *Nota:En java X se incrementa hacia la derecha e Y se incrementa hacia abajo.
        // La esquina superior izquierda es de coordenadas (0,0)
        if (keyH.upPressed == true) {
            playerY -= playerSpeed;
        } else if (keyH.downPressed == true) {
            playerY += playerSpeed;
        } else if (keyH.leftPressed == true) {
            playerX -= playerSpeed;
        } else if (keyH.rightPressed == true) {
            playerX += playerSpeed;
        }

    }

    // Con esta clase podemos dibujar en el programa
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Cambiamos el Graphics por Graphics2D ya que el ultimo tiene mejores
        // funcionalidades
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.white); // Esto define el color del objeto que queramos.

        // g2.fillRect(posicion x, posicion y, ancho del objeto, altura del objeto)
        g2.fillRect(playerX, playerY, tileSize, tileSize); // Dibuja un rectangulo con el color indicado anteriormente.

        g2.dispose(); // Esta hace que la ventana creada sea destruida y limpiada por el sistema luego
                      // de cerrarla.

    }
}
