public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2015;

        if (clientOS == 1 && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // Задача 3
        int year = 1984;


        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Это год является високосным");
            } else {
                System.out.println("Этот год не является високосным");    }}


        /*
        if (year >= 1584) {
            if(((year - 1584) % 400) == 0) {
                System.out.println("Это год является високосным");
            } else if (year > 1584 && ((year - 1584) % 100) == 0) {
                System.out.println("Этот год не является високосным");
            } else if (((year - 1584) % 4) == 0) {
                System.out.println("Это год является високосным");
            } else {
                System.out.println("Этот год не является високосным");
            }
        }  else {
            System.out.println("Этот год не является високосным");
        }
        */

        // Задача 4
        int deliveryDistance = 95;
        short deliveryTime = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (deliveryTime + 2));
        }

        // Задача 5
        byte monthNumber = 6;

        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("2-й месяц принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("3-й месяц принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("4-й месяц принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("5-й месяц принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("6-й месяц принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("7-й месяц принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("8-й месяц принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("9-й месяц принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("10-й месяц принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("11-й месяц принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("12-й месяц принадлежит к сезону зима");
                break;
            default:
                System.out.println("Номер месяца больше 12");
                break;
        }
    }
}
