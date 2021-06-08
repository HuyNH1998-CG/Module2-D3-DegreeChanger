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
                    System.out.println(fahrenheitToCelsius(fahrenheit) + "F");
                }
                case 2 -> {
                    System.out.println("Input celsius");
                    double celsius = input.nextDouble();
                    System.out.println(celsiusToFahrenheit(celsius) + "C");
                }
                case 0 -> System.exit(0);
            }
        }
    }
    public static double celsiusToFahrenheit (double celsius){
        return (9 / 5.0) * celsius + 32;
    }
    public static double fahrenheitToCelsius (double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
