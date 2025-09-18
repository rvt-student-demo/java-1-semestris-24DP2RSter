package rvt;

import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());
        System.out.println("Grade: " + grade(points));
        scanner.close();
    }

    public static String grade(int points) {
        if (points < 0 || points > 100) {
            return "impossible!";
        } else if (points <= 49) {
            return "Failed";
        } else if (points <= 59) {
            return "1";
        } else if (points <= 69) {
            return "2";
        } else if (points <= 79) {
            return "3";
        } else if (points <= 89) {
            return "4";
        } else if (points <= 100) {
            return "5";
        } else {
            return "incredible!";
        }
    }
    
    }
