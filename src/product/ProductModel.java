package product;

import java.util.UUID;

public class ProductModel {
    private String barCode;
    private String name;
    private int priceInCents;
    private int stock;

    public ProductModel() {
        this.barCode = generateUniqueBarCode();
    }
    
    private String generateUniqueBarCode() {
        return UUID.randomUUID().toString();
    }

    public String getBarCode() {
        return barCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPriceInCents() {
        return priceInCents;
    }
    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
