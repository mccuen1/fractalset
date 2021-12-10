


public class Rectangle {

    private double xmin;
    private double xmax;
    private double ymin;
    private double ymax;

    public Rectangle(double xmin, double xmax, double ymin, double ymax) {
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
    }

    // getters 
    public double getXmin() {
        return this.xmin;
    }
    public double getXmax() {
        return this.xmax;
    }
    public double getYmin() {
        return this.ymin;
    }
    public double getYmax() {
        return this.ymax;
    }

    // setters
    public void setXmin(double xmin) {
        this.xmin = xmin;
    }
    public void setXmax(double xmax) {
        this.xmax = xmax;
    }
    public void setYmin(double ymin) {
        this.ymin = ymin;
    }
    public void setYmax(double ymax) {
        this.ymax = ymax;
    }

    @Override
    public String toString() {
        return String.format("%4.4, %4.4, %4.4, %4.4", this.xmin, this.xmax, this.ymin, this.ymax);
    }
}