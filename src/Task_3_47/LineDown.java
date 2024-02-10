package Task_3_47;

public class LineDown {
    double x0;
    double y0;
    double a;

    public LineDown(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }
    public boolean isPointAboveLine1(double x, double y) {
        return y > a * (x - x0) + y0;
    }
}
