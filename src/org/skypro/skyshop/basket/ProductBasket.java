package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private Product[] products = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++){
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public int getTotalPriceBasket() {
        int total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getProductPrice();
            }
        }
        return total;
    }

    public void printBasket() {
        boolean isEmpty = true;
        for (Product product : products) {
            if (product != null) {
                System.out.println("<" + product.getProductName() + ">: " + "<" + product.getProductPrice() + ">");
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("В корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalPriceBasket());
        }
    }

    public boolean searchProduct(String productName) {
        for (Product product : products) {
            if (product != null && productName.equals(product.getProductName())) {
                return true;
            }
        }
        return false;
    }

    public void cleanBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }
}
