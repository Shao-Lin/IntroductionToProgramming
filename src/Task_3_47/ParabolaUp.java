package Task_3_47;

public class ParabolaUp {
    private final double x0;
    private final double y0;
    private final double a;


    public ParabolaUp(double x, double y, double a) {
        this.x0 = x;
        this.y0 = y;
        this.a = a;
    }
    public boolean PointInParabola(double x, double y){
        return x < a * Math.pow(y - y0, 2) + x0;
    }
}
