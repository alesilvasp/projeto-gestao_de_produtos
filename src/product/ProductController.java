package product;

import java.util.ArrayList;

public class ProductController {
    private ArrayList<ProductModel> products;

    public ArrayList<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductModel> products) {
        this.products = products;
    }

    public String create(ProductModel payload) {

        return "Produto adicionado" ;
    }

    public ArrayList<ProductModel> read() {
        return products;
    }

    public int retrievePrice(String barCode) {
        int price = 0;

        return price;
    }
}
