package day4;

import java.util.Scanner;

enum cal {
    Addition, Substraction, Multiplication, Division;
}

public class Calculator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();
        scanner.close();

        cal op = cal.Addition;

        switch (op) {
            case  Addition:
                int output1 = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + output1);
                
            case Substraction:
                int output2 = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + output2);
            case Multiplication:
                int output3 = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + output3);
            case Division:
                int output4 = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + output4);
                break;
            default:
                System.out.println("Error");
                return;
        }
    }
}