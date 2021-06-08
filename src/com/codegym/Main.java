package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Input Fahrenheit");
                    double fahrenheit = input.nextDouble();
                    double celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println(celsius + "C");
                }
                case 2 -> {
                    System.out.println("Input celsius");
                    double celsius = input.nextDouble();
                    double fahrenheit = (9 / 5.0) * celsius + 32;
                    System.out.println(fahrenheit + "F");
                }
                case 0 -> System.exit(0);
            }
        }
    }
}
