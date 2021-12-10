import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Moire extends JFrame {
    
    private static final int WIDTH = 512;
    private static final int HEIGHT = 512;
    private static final String TITLE = "Moire Pattern";

    public Moire() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setTitle(TITLE);

        Container pane = this.getContentPane();

        MoirePanel panel = new MoirePanel();
        pane.add(panel);

        Timer timer = new Timer(20, panel);
        timer.start();
        
        this.setVisible(true);
    } // Moire()

    public static void main(String[] args) {
        Moire moire = new Moire();
    }
}
