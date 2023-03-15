package pl.javastart.task;

public class Product {

    private String name;
    private String description;
    public double priceNoTax;
    private String category;

    public Product() {
        return;
    }

    public Product(String name, String description, double priceNoTax, String category) {
        this.name = name;
        this.description = description;
        this.priceNoTax = priceNoTax;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceNoTax() {
        return priceNoTax;
    }

    public void setPriceNoTax(double priceNoTax) {
        this.priceNoTax = priceNoTax;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
