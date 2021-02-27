package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Products products = new Products();
        Departments departments = new Departments();
        Connector connector = new Connector();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("--- Menu ---\n" +
                    "1. Открыть таблицу Products\n" +
                    "2. Открыть таблицу Departments\n" +
                    "3. Вывести совместную таблицу" +
                    "(соответствие товаров и отделов)\n" +
                    "4. Выход");

            int answer = scanner.nextInt();
            if (answer == 4) {
                break;
            }

            switch(answer) {
                case 1:
                    products.selectProducts();
                    System.out.println();
                    break;
                case 2:
                    departments.selectDepartments();
                    System.out.println();
                    break;
                case 3:
                    connector.selectTables();
                    System.out.println();
                    break;
                default:
                    System.out.println("Такого варианта не существует");
            }
        }
    }
}