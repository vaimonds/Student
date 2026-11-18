package org.skypro.skyshop.basket;

import org.skypro.skyshop.Exception.BasketEmpty;
import org.skypro.skyshop.Exception.NotRemove;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.*;

public class ProductBasket {

    //private List<Product> products = new LinkedList<>();
    private Map<String, List<Product>> products = new HashMap<>();

    public void addProduct(Product product) {
        products.computeIfAbsent(product.getName(), k -> new ArrayList<>()).add(product);
    }

    public int getTotalPriceBasket() {
        int total = 0;
        for (List<Product> productList: products.values()) {
            Iterator<Product> iterator = productList.iterator();
            while (iterator.hasNext()) {
                // Чтобы не перескакивать на след. элементы дважды
                Product currentProduct = iterator.next();
                if (currentProduct != null) {
                    total += currentProduct.getProductPrice();
                }
            }
        }
        return total;
    }

    public void printBasket() {
        boolean isEmpty = true;

        for (List<Product> productList: products.values()) {
            for (Product product : productList) {
                if (product != null) {
                    if (product.getClass() == SimpleProduct.class) {
                        System.out.println("<" + product.getProductName() + ">: " + "<" + product.getProductPrice() + ">");
                    } else {
                        System.out.println(product.toString());
                    }
                    isEmpty = false;
                }
            }
        }

        if (isEmpty) {
            System.out.println("В корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalPriceBasket());
            getQuantitySpecialProduct();
        }
    }

    /*
    public boolean searchProduct(String productName) {
        for (Product product : products) {
            if (product != null && productName.equals(product.getProductName())) {
                return true;
            }
        }
        return false;
    }
    */

    // Подсчёт количества специальных товаров
    public void getQuantitySpecialProduct() {
        int countSpecialProduct = 0;
        for (List<Product> productList: products.values()) {
            Iterator<Product> iterator = productList.iterator();
            while (iterator.hasNext()) {
                // Чтобы не перескакивать на след. элементы дважды
                Product currentProduct = iterator.next();
                if (currentProduct.isSpecial()) {
                    countSpecialProduct++;
                }
            }

        }
        System.out.println("Специальных товаров: " + countSpecialProduct);
    }

    // Удаление продукта по имени из корзины
    public List<Product> removeProductForList(String name) throws NotRemove, BasketEmpty {
        // Смысла дальше нет идти если имя пустое
        if (name == null) {
            throw new NotRemove("Имя продукто пустое, удаление невозможно");
        }
        List<Product> removedProducts = new LinkedList<>();
        if (products.containsKey(name)) {
            removedProducts.addAll(products.remove(name));
        } else {
            throw new BasketEmpty("Элемент который нужно удалить в списке нет");
        }
        return removedProducts;
    }
}
