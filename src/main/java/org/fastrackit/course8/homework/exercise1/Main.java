package org.fastrackit.course8.homework.exercise1;

public class Main {
    public static void main(String[] args) {
        Product drinkingCup = new Product(20, "Real Madrid cup", "drinking cup", 5);
        System.out.println(drinkingCup);
        System.out.println("*******************");
        Product lipBalm = new Cosmetics(12, "Neutrogena", "lip balm - healing chapped lips", 1,
                "colorless", 0.15);
        System.out.println(lipBalm);
        System.out.println("*******************");
        Product laptop = new Electronics(5000, "Dell", "i7 - quadcore", 10,
                "Dell laptop", 50.5, 23.5, 3.3, 1.5);
        System.out.println(laptop);
        System.out.println("*******************");
        Product freezer = new Fridge(8000, "Samsung", "2 compartments", 1,
                "Samsung fridge", 1.5, 1.2, 2.2, 55, -20);
        System.out.println(freezer);
        System.out.println("*******************");
    }
}
