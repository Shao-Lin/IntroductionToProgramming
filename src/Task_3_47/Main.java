package Task_3_47;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static final LineUp lineUp = new LineUp(2, 2, 0);
    public static final LineDown lineDown = new LineDown(6, 2, 0.25);
    public static final ParabolaUp parabolaUp = new ParabolaUp(4, 4, -0.5);
    public static final ParabolaDown parabolaDown = new ParabolaDown(0, -3, -0.125);
    public static final Rect rect = new Rect(-2, 4, -6, -3);

    public static SimpleColor getColor(double x, double y) {
        if (parabolaDown.PointInParabola(x, y))
            return SimpleColor.GRAY;

        if (lineDown.isPointAboveLine1(x, y)&& parabolaUp.PointInParabola(x, y)&& rect.PointInRect(x, y))
            return SimpleColor.BLUE;

        if(lineDown.isPointAboveLine1(x, y) && lineUp.isPointAboveLine(x, y))
            return SimpleColor.GREEN;

        if (lineDown.isPointAboveLine1(x, y) && rect.PointInRect(x, y))
            return SimpleColor.WHITE;

        if (parabolaUp.PointInParabola(x, y))
            return SimpleColor.ORANGE;

        if(lineUp.isPointAboveLine(x, y))
            return SimpleColor.GREEN;

        if (lineDown.isPointAboveLine1(x, y))
            return SimpleColor.BLUE;


        else
            return SimpleColor.WHITE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.print("(" + x + ", " + y + ")" + "-->");
        System.out.println(getColor(x, y));
    }
    public static void test(){
        printColorForPoint(1, 1);//blue
        printColorForPoint(-1, 4);//green
        printColorForPoint(-1.5, 1.5);// orange
        printColorForPoint(-4, 1); //blue
        printColorForPoint(-3,0);//white
        printColorForPoint(-8,-1);//blue
        printColorForPoint(0,-4);//grey
        printColorForPoint(-5,-2);//white
        printColorForPoint(-9,1);//orange
        printColorForPoint(10, 2.5);//green
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        test();
        System.out.println("-------------------------------");
        System.out.println("Введите координату Х: ");
        double x = sc.nextDouble();
        System.out.println("Введите координату Y: ");
        double y = sc.nextDouble();
        printColorForPoint(x, y);
    }
}