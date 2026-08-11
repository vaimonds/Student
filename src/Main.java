public class Main {
    public static void main(String[] args) {
        // Task 1

        System.out.println("Task 1");

        int firstFriday = 1;

        for (int i = firstFriday; i < 31; i++) {
            if (i % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        // Task 2

        System.out.println("Task 2");

        int distance = 0;
        do {
            System.out.println("Держитесь! Осталось " + (42_195 - distance) + " метров");
            distance = distance + 500;
        } while (distance < 42_195);

        distance = 0;

        System.out.println("Task 2 - The second option");

        for (; distance < 42_195; ) {
            System.out.println("Держитесь! Осталось " + (42_195 - distance) + " метров");
            distance = distance + 500;
        }

        // Task 3

        System.out.println("Task 3");

        int parkingСost = 100;
        int day = 1;
        int amountDeposited = 2000;

        while (amountDeposited > 0) {
            if (day % 5 == 0) {
                day++;
                continue;
            }
            amountDeposited = amountDeposited - parkingСost;
            day++;
        }

        System.out.println("Вы можете оставить автомобиль на " + day + " дней");

        System.out.println("Task 3 - The second option");

        parkingСost = 100;
        day = 1;
        amountDeposited = 2000;

        for (; amountDeposited > 0; ) {

            if (day % 5 == 0) {
                day++;
                continue;
            }

            amountDeposited = amountDeposited - parkingСost;
            day++;
        }

        System.out.println("Вы можете оставить автомобиль на " + day + " дней");

        // Task 4

        System.out.println("Task 4");

        int month = 0;
        int total = 0;

        while (month >= 0) {

            if (total > 12_000_000) {
                break;
            } else if (month % 6 == 0) {
                total = total + (total * 7) / 100;
                System.out.println("Сумма накоплений составляет " + total);
                month++;
                continue;
            }
            total = total + 15_000;
            month++;
            System.out.println("Сумма накоплений составляет " + total);

        }

        // Task 5

        System.out.println("Task 5");

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100) {
            if (overheats > 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge);
                break;
            }else if (minute != 0 && minute % 10 == 0) {
                overheats++;
                minute = minute + 2;
                continue;
            }
            charge = charge + 2;
            minute++;
        }

        System.out.println("Время зарядки составило " + minute + " минут");

    }
}
