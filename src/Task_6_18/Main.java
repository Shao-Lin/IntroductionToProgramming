package Task_6_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double e = scanner.nextDouble();
        double sumN = 0;
        double sumE = 0;
        double sumE10 = 0;
        int i = 1;
        double curX = f(i, 0, x);
        while (i <= n || Math.abs(curX) > e || Math.abs(curX) > e / 10) {
            curX = f(i, curX, x);
            if (i <= n) {
                sumN += curX;
            }
            if (Math.abs(curX) > e){
                sumE += curX;
            }
            if (Math.abs(curX) > e / 10){
                sumE10 += curX;
            }
            i++;
        }
        System.out.println(sumN);
        System.out.println(sumE);
        System.out.println(sumE10);
        System.out.println(1 / (1 - x));
    }

    public static double f(int n, double a, double x) {
        if (n == 1) return 1;
        else
            return a * x;
    }
}
