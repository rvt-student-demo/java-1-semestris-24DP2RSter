package rvt;

import java.util.Scanner;

public class message{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String input = scanner.nextLine();

        System.out.println(input);

        scanner.close();
    }
}