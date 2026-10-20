package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product("Молоко", 700);
        Product product2 = new Product("Печенье", 400);
        Product product3 = new Product("Шоколадка", 650);
        Product product4 = new Product("Кефир", 370);
        Product product5 = new Product("Вафля", 15);
        Product product6 = new Product("Арбуз", 150);

        ProductBasket basket = new ProductBasket();
        // Добавление продуктов в корзину
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        // Добавление продуктов в корзину, в которой нет свободного места
        basket.addProduct(product6);

        // Печать содержимого корзины с несколькими товарами
        basket.printBasket();

        // Получение стоимости корзины с несколькими товарами
        basket.getTotalPriceBasket();

        // Поиск товара, который есть в корзине
        basket.searchProduct("Вафля");

        // Поиск товара, которого нет в корзине
        basket.searchProduct("Арбуз");

        // Очистка корзины
        basket.cleanBasket();

        // Печать содержимого пустой корзины
        basket.printBasket();

        // Получение стоимости пустой корзины
        basket.getTotalPriceBasket();

        // Поиск товара по имени в пустой корзине
        basket.searchProduct("Молоко");


    }
}
