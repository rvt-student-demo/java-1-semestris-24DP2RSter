package rvt;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            numberCount++;
            sum += number;
            
        }
        System.out.println("Number of numbers: " + numberCount);
            System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }
}