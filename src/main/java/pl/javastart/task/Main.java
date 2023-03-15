package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        Product product1 = new Product("TvSet", "plazma", 2500, "TV1");
        Product product2 = new Product("Prossecco", "semi-dry wine", 40.00, "WINE1");

        System.out.println("Podaj kategorię produktu umieszczoną na opakowaniu. Wpisz ją z włączonym CAPSLOCKIEM. \n" +
                "Jeżeli produkt nie należy do żadnej kategorii, wpisz 0 : ");
        String productCategory = scanner.nextLine();

        switch (productCategory) {
            case "TV1":
                System.out.println("Cena " + Category.grossPrice(product1, 0.23));
                break;
            case "WINE1":
                System.out.println("Cena " + Category.grossPrice(product2, 0.18));
                break;
            case "0":
                System.out.println("Podaj cenę produktu:");
                product.priceNoTax = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Cena " + Category.grossPrice(product, 0.12));
                break;
            default:
                System.out.println("Produkt nie znaleziony! Spróbuj ponownie");
        }

    }
}
