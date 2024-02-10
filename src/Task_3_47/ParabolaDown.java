package Task_3_47;

public class ParabolaDown {
        private final double x0;
        private final double y0;
        private final double a;


        public ParabolaDown(double x, double y, double a) {
            this.x0 = x;
            this.y0 = y;
            this.a = a;
        }
    public boolean PointInParabola(double x, double y){
        return y < a * Math.pow(x - x0, 2) + y0;
    }
}
