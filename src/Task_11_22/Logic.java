package Task_11_22;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        Pattern p = Pattern.compile("(?<= |^)[A-zА-я0-9]{4,7}(?= |$)");
        Matcher m = p.matcher(text);
        HashSet<String> noIdentical = new HashSet<String>();
        while(m.find()){
            noIdentical.add(m.group());
        }
        System.out.print( noIdentical + " ");
    }
}