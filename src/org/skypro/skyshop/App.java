package org.skypro.skyshop;

import org.skypro.skyshop.Article.Article;
import org.skypro.skyshop.Article.Searchable;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {

    public static void main(String[] args) {

        SimpleProduct product1 = new SimpleProduct("Молоко", 700);
        DiscountedProduct product2 = new DiscountedProduct("Печенье", 400, 20);
        FixPriceProduct product3 = new FixPriceProduct("Шоколадка", 650);
        SimpleProduct product4 = new SimpleProduct("Кефир", 370);
        SimpleProduct product5 = new SimpleProduct("Вафля", 15);
        Article product6 = new Article("Молоко", "Это ведь то самое молоко");
        Article product7 = new Article("Кефир", "Это ведь то самый кефир");


        SearchEngine searchEngine = new SearchEngine(10);

        Searchable[] resultSearch = new Searchable[5];

        ProductBasket basket = new ProductBasket();
        // Добавление продуктов в корзину
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        // Добавляем объекты в массив поиска
        searchEngine.add(product1);
        searchEngine.add(product2);
        searchEngine.add(product3);
        searchEngine.add(product4);
        searchEngine.add(product5);
        searchEngine.add(product6);
        searchEngine.add(product7);

        Searchable[] results1 = searchEngine.search("Молоко");
        printResults(results1);

        Searchable[] results2 = searchEngine.search("Кефир");
        printResults(results2);

        Searchable[] results3 = searchEngine.search("Шоколадка");
        printResults(results3);

        Searchable[] results4 = searchEngine.search("Хлеб");
        printResults(results4);

        // Получить стоимость SimpleProduct
        //product1.getProductPrice();

        // Получить стоимость FixPriceProduct
        //product3.getProductPrice();

        // Получить стоимость DiscountedProduct
        //product2.getProductPrice();

        // Вывод количества специальных товаров
        //basket.getQuantitySpecialProduct();

        // Печать содержимого корзины
        //basket.printBasket();
    }

    // Вспомогательный метод для красивого вывода результатов поиска в консоль
    private static void printResults(Searchable[] results) {
        int foundCount = 0;

        for (Searchable item : results) {
            if (item != null) {
                System.out.println(item.getStringRepresentation());
                foundCount++;
            }
        }

        if (foundCount == 0) {
            System.out.println("Ничего не найдено");
        }
    }
}

