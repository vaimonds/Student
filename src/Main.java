import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {


    public static void checkYear(int year) {

        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Это год является високосным");
            return;
        } else {
            System.out.println("Этот год не является високосным");
            return;
        }

    }

    public static void checkDeviceYear(int clientOS, int clientDeviceYear) {

        if (clientOS == 1 && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            return;
        } else if (clientOS == 1 && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
            return;
        } else if (clientOS == 0 && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            return;
        } else if (clientOS == 0 && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            return;
        }
    }

    public static int checkDeliveryDistance(int deliveryDistance) {
        short deliveryTime = 1;

        if (deliveryDistance <= 20) {
            return deliveryTime;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return deliveryTime += 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return deliveryTime += 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Task 1

        System.out.println("Task 1");

        int year = 2000;

        checkYear(year);

        // Task 2

        System.out.println("Task 2");

        int clientOS = 1;

        int clientDeviceYear = 2011;

        checkDeviceYear(clientOS, clientDeviceYear);

        // Task 3

        System.out.println("Task 3");

        int deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней " + checkDeliveryDistance(deliveryDistance));
        }


    }
}
