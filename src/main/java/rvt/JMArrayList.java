package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OnlyTheseNumbers(scanner);
        ListSize(scanner);
        OnTheList(scanner);
        RemoveLast();

        scanner.close();
    }

    public static void OnlyTheseNumbers(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        System.out.print("From where? ");
        int startIndex = Integer.parseInt(scanner.nextLine());

        System.out.print("To where? ");
        int endIndex = Integer.parseInt(scanner.nextLine());

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static void ListSize(Scanner scanner) {
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nIn total: " + names.size());
    }

    public static void OnTheList(Scanner scanner) {
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        System.out.print("Search for? ");
        String search = scanner.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }

    public static void RemoveLast() {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }
}