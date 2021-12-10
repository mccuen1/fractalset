
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MoirePanel extends JPanel implements ActionListener {
    private static final Color BG_COLOR = new Color(60, 60, 60);
    private double increment2 = 1.2;

    private SunBurst s1 = new SunBurst(110, 250, 250);
    private SunBurst s2 = new SunBurst(110, 250, 250);

    public MoirePanel() {
        this.setBackground(BG_COLOR);
    }

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        int w = this.getWidth();
        int h = this.getHeight();

        g2D.setColor(Color.white);
        g2D.setStroke(new BasicStroke(1));

        s1.draw(g2D);
        s2.draw(g2D);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (s2.getX() >= 330 || s2.getX() <= 170) increment2 *= -1;
        s2.setX(s2.getX() + increment2);
        this.repaint();
    }


}
