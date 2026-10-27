package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {

    public static void main(String[] args) {

        SimpleProduct product1 = new SimpleProduct("Молоко", 700);
        DiscountedProduct product2 = new DiscountedProduct("Печенье", 400, 20);
        FixPriceProduct product3 = new FixPriceProduct("Шоколадка", 650);
        SimpleProduct product4 = new SimpleProduct("Кефир", 370);
        SimpleProduct product5 = new SimpleProduct("Вафля", 15);

        ProductBasket basket = new ProductBasket();
        // Добавление продуктов в корзину
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);


        // Получить стоимость SimpleProduct
        product1.getProductPrice();

        // Получить стоимость FixPriceProduct
        product3.getProductPrice();

        // Получить стоимость DiscountedProduct
        product2.getProductPrice();

        // Вывод количества специальных товаров
        basket.getQuantitySpecialProduct();

        // Печать содержимого корзины
        basket.printBasket();
    }
}
