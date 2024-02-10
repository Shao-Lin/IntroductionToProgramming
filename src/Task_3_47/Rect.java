package Task_3_47;

public class Rect {
    double x0;
    double y0;
    double x1;
    double y1;

    public Rect(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
    public boolean PointInRect(double x, double y) {
        return x < x0 && x > x1 && y < y0 && y > y1;
    }
}
