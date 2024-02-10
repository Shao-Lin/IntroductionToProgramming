package Task_5_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int height = enterHeight();

        if (isHeightGreaterThenOne(height)) {
            printFigure(height);
        }

    }

    public static int enterHeight() {
        System.out.print("Введите высоту: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static boolean isHeightGreaterThenOne(int height) {
        if (height <= 1) {
            System.out.println("Ошибка. Введите число больше единицы.");
            return false;
        } else {
            return true;
        }
    }

    public static void printFigure(int h) {
        for (int i = 1; i < h; i++) {
            for (int j = h - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println("\\");
        }
        System.out.print("/");
        for (int i = 2; i <= h * 2 - 1; i++) {
            System.out.print("_");
        }
        System.out.print("\\");
    }

}