package product;

import java.util.ArrayList;
import java.util.stream.Stream;

import exceptions.NegativePriceException;
import exceptions.NotFoundException;

public class ProductController {
    private ArrayList<ProductModel> products;

    public ArrayList<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductModel> products) {
        this.products = products;
    }

    public String create(ProductModel payload) throws NegativePriceException {

        if (payload.getPriceInCents() < 0) {
            throw new NegativePriceException();
        }

        return "Produto " + payload.getName() + " adicionado!";
    }

    public ArrayList<ProductModel> read() {
        return getProducts();
    }

    public int retrievePrice(String barCode) throws NotFoundException {

        Stream<ProductModel> allProducts = getProducts().stream();

        ProductModel foundProduct = allProducts
                .filter(p -> p.getBarCode()
                .equals(barCode))
                .findFirst()
                .orElseThrow(NotFoundException::new);

        return foundProduct.getPriceInCents();
    }
}
