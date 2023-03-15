package pl.javastart.task;

import java.util.Scanner;

public class Category {

    public double tax;

    public static double grossPrice(Product product, double tax) {
        return (product.getPriceNoTax() + (product.getPriceNoTax() * tax));
    }
}
