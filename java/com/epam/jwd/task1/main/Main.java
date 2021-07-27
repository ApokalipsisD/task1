package com.epam.jwd.task1.main;

import com.epam.jwd.task1.entity.Equipment;
import com.epam.jwd.task1.entity.Gloves;
import com.epam.jwd.task1.entity.Helmet;
import com.epam.jwd.task1.entity.Jacket;
import com.epam.jwd.task1.logic.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Helmet helmet = new Helmet(5000, 5, "L", "Cross", "End-to-End", "thermoplastic");
        Jacket jacket = new Jacket(10000, 7, "XL", "Vestern", "zipper", 6);
        Gloves gloves = new Gloves(2000, 1, "L", "Sport", "summer", "yes");


        Equipment equipment = new Equipment();
        Operations operations = new Operations(equipment, equipment.getAmmunition());

        System.out.println("Введите 0 для прекращения работы.");
        System.out.println("Введите 1 для добавления 1-ого элемента.");
        System.out.println("Введите 2 для добавления 2-ого элемента.");
        System.out.println("Введите 3 для добавления 3-ого элемента.");
        System.out.println("Введите 4 для подсчета полной стоимости.");
        System.out.println("Введите 5 для сортировки по весу.");
        System.out.println("Введите 6 для определения элементов, соответствующих заданному диапазону цен.");
        System.out.println("Введите 7 для вывода значений на консоль.");

        int choice = 1;
        while (choice != 0) {
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    equipment.addElement(helmet);
                }
                case 2 -> {
                    equipment.addElement(jacket);
                }
                case 3 -> {
                    equipment.addElement(gloves);
                }
                case 4 -> {
                    operations.calculateCost();
                    System.out.println("Total cost: " + operations.getTotalCost());
                }
                case 5 -> {
                    operations.sortByWeight();
                }
                case 6 -> {
                    System.out.println("Введите диапазон цен через пробел:");
                    operations.itemsByPrice(scanner.nextInt(), scanner.nextInt());
                }
                case 7 -> {
                    operations.print();
                }
            }
        }
    }
}
