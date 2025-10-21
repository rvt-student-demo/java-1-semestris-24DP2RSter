package rvt;

import java.util.Scanner;

public class Produkts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //lietotāja ievade
        System.out.print("Ievadi produkta nosaukumu: ");
        String nosaukums = scanner.nextLine();

        System.out.print("Ievadi produktu skaitu: ");
        int skaits = scanner.nextInt();

        System.out.print("Ievadi produkta cenu: ");
        double cena = scanner.nextDouble();

        // Aprēķina kopējo cenu
        double totalPrice = skaits * cena;

        // Izvada
        System.out.println("\nProdukts");
        System.out.println(nosaukums + " cena: " + cena);
        System.out.println("daudzums " + skaits + ", totalPrice: " + totalPrice);
        scanner.close();
    }
}