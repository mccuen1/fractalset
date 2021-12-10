
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class SunBurst {
    
    private Point2D p1;
    private Point2D p2;
    private double x;
    private double y;
    private int steps;
    private double center;

    public SunBurst(int steps, double x, double y) {
        this.steps = steps;
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    // public translate method to move the sunbursts
    private Line2D translateLine(double x, double y) {
        Point2D point1 = new Point2D.Double(p1.getX()+x, p1.getY()+y);
        Point2D point2 = new Point2D.Double(p2.getX()+x, p2.getY()+y);
        
        return new Line2D.Double(point1, point2);
    }


    public void draw(Graphics2D g2D) {

        final double outerRadius = 600;
        final double innerRadius = 30;
        for (int i=0; i < steps; i++) {
            double angle = ((double) i / steps * 2.0 * Math.PI);
            p1 = new Point2D.Double(Math.cos(angle)*innerRadius, Math.sin(angle)*innerRadius);
            p2 = new Point2D.Double(Math.cos(angle)*outerRadius, Math.sin(angle)*outerRadius);

            Line2D line = new Line2D.Double(p1, p2);
            line = translateLine(x, y);
            g2D.draw(line);
        }
    }
}
