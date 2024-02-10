package Task_4_20;

import java.util.Scanner;

public class Main {
    public static double enterNumber(String message){
        Scanner enter = new Scanner(System.in);
        System.out.print(message);
        double number = enter.nextInt();

        return number;
    }
    public static double task(double number){
        double returnNumber = 0;
        double summation = 1;
        for(double check = number; check > 0; check--){
            returnNumber = returnNumber + Math.pow (summation, check);
            summation++;
        }
        return returnNumber;
    }

    public static void main(String[] args){
        System.out.println(task(enterNumber("Enter extent: ")));
    }

}