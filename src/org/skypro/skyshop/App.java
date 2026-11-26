package org.skypro.skyshop;

import org.skypro.skyshop.Exception.BasketEmpty;
import org.skypro.skyshop.Exception.BestResultNotFound;
import org.skypro.skyshop.Exception.NotRemove;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.search.Searchable;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.*;

public class App {

    public static void main(String[] args) {

        SimpleProduct product1 = null;
        DiscountedProduct product2 = null;

        // Провекра полей в конструкторе Product
        try {
            product1 = new SimpleProduct("null", 700);
            product2 = new DiscountedProduct("Печенье", -400, 400);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        product2 = new DiscountedProduct("Печенье", 400, 50);
        FixPriceProduct product3 = new FixPriceProduct("Шоколадка", 650);
        SimpleProduct product4 = new SimpleProduct("Кефир", 370);
        SimpleProduct product5 = new SimpleProduct("Вафля", 15);
        Article product6 = new Article("Молоко", "Это ведь то самое молоко. Об это молочном молоке ходят легенды");
        Article product7 = new Article("Кефир", "Это ведь то самый кефир. Кефирный кефир не удел");


        SearchEngine searchEngine = new SearchEngine();

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

        Set<Searchable> results1 = searchEngine.search("Кефир");
        for (Searchable item : results1) {
            System.out.println(item.getSearchTerm());
        }

        // Проверка поиска по подстроке удачный вариант
        try {
            Searchable results = searchEngine.findMostRelevant("моло");
            System.out.println(results.toString());
        } catch (BestResultNotFound e) {
            System.out.println(e);
        }

        // Проверка поиска по подстроке НЕ удачный вариант
        try {
            Searchable results = searchEngine.findMostRelevant("мало");
            System.out.println(results.toString());
        } catch (BestResultNotFound e) {
            System.out.println(e);
        }

        // Удаление существующего продукта из корзины и вывод удалённых продуктов
        try {
            List<Product> removedProducts = new LinkedList<>();
            removedProducts.addAll(basket.removeProductForList("Печенье"));
            removedProducts.addAll(basket.removeProductForList("null"));
            removedProducts.addAll(basket.removeProductForList("Шоколадка"));
            Iterator<Product> iterator = removedProducts.iterator();
            while (iterator.hasNext()) {
                Product rmProduct = iterator.next();
                System.out.println("Продукт: " + rmProduct.getProductName() + " удалён");
            }
        } catch (NotRemove e) {
            System.out.println(e);
        } catch (BasketEmpty e) {
            System.out.println(e);
        }

        // Удаление несуществующего продукта и проверка что список удалённых продуктов пустой
        try {
            basket.removeProductForList("Несущ.");
        } catch (NotRemove e) {
            System.out.println(e);
        } catch (BasketEmpty e) {
            System.out.println(e);
        }

        // Вывод содержимого корзины
        basket.printBasket();
    }

    public static class ReverseStringComparator implements Comparator<Searchable> {
        @Override
        public int compare(Searchable o1, Searchable o2) {
            int len1 = o1.getName().length();
            int len2 = o2.getName().length();
            int result = Integer.compare(o1.getName().length(), o2.getName().length());

            // Если длины одинаковые сравниваем по алфавиту
            if (result == 0) {
                return o1.getName().compareTo(o2.getName());
            }

            return result;
        }
    }
}

