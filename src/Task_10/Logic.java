package Task_10;

import java.util.*;
import java.util.Random;

public class Logic {
    public static void main(String[] args) {
        Map<String, Map<String, ArrayList<Integer>>> specifications = new HashMap<>();
        Map<String, ArrayList<Integer>> price = new HashMap<>();
        specifications.put("Название характеристик1", price);
        ArrayList<Integer> priceL = new ArrayList<>();
        price.put("Цены", priceL);
        priceL.add(15000);
        priceL.add(5000);
        priceL.add(4000);
        priceL.add(3000);
        priceL.add(5000);
        Map<String, ArrayList<Integer>> memory = new HashMap<>();
        specifications.put("Название характеристик2", memory);
        ArrayList<Integer> memoryL = new ArrayList<>();
        memory.put("Количество памяти", memoryL);
        memoryL.add(50);
        memoryL.add(70);
        memoryL.add(90);
        memoryL.add(90);
        memoryL.add(90);
        Map<String, ArrayList<Integer>> rating = new HashMap<>();
        specifications.put("Название характеристик3", rating);
        ArrayList<Integer> ratingL = new ArrayList<>();
        rating.put("Рейтинг", ratingL);
        ratingL.add(5);
        ratingL.add(5);
        ratingL.add(4);
        ratingL.add(5);
        ratingL.add(5);

        ArrayList<String> nameL = new ArrayList<>();
        nameL.add("Xiaomi note 8 pro");
        nameL.add("Yamaha f310");
        nameL.add("Apple iphone");
        nameL.add("Xiaomi note 8 pro");
        nameL.add("p550");

        int money = 10000;
        for (int i = 0; i < priceL.size(); i++) {
            if (money < priceL.get(i)) {
                priceL.remove(i);
                memoryL.remove(i);
                ratingL.remove(i);
                nameL.remove(i);
            }
        }
        int MaxValue = 0;
        for (int i = 0; i < memoryL.size(); i++) {
            if (MaxValue < memoryL.get(i))
                MaxValue = memoryL.get(i);
        }
        for (int i = 0; i < memoryL.size(); i++) {
            if (memoryL.get(i) < MaxValue) {
                memoryL.remove(i);
                ratingL.remove(i);
                nameL.remove(i);
            }
        }
        int Rating = 0;
        for (int i = 0; i < ratingL.size(); i++) {
            if (Rating < ratingL.get(i))
                Rating = ratingL.get(i);
        }
        for (int i = 0; i < ratingL.size(); i++) {
            if (ratingL.get(i) < Rating) {
                ratingL.remove(i);
                nameL.remove(i);
            }
        }
        Random random = new Random();
        ArrayList<String> finalValue = new ArrayList<>();
        int randomValue;
        for (int i = 0; i < nameL.size(); i++) {
            if (nameL.contains("Asus") || nameL.contains("Samsung"))
                finalValue.add(nameL.get(i));
        }
        if (finalValue.size() == 0) {
            randomValue = random.nextInt(nameL.size());
            System.out.println(nameL.get(randomValue));
        } else if (finalValue.size() == 1)
            System.out.println(finalValue.get(0));

        else {
            randomValue = random.nextInt(finalValue.size());
            System.out.println(finalValue.get(randomValue));
        }
    }
}