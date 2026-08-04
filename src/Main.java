public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Taks 1");

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // Task 2

        System.out.println("Taks 2");

        for (int i = 10; i != 0; i--) {
            System.out.println(i);
        }

        // Task 3

        System.out.println("Taks 3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        // Task 4

        System.out.println("Taks 4");

        for (int i = 10; i != -11; i--) {
            System.out.println(i);
        }

        // Task 5

        System.out.println("Taks 5");

        for (int i = 1904; i != 2100; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Task 6

        System.out.println("Taks 6");

        for (int i = 7; i != 105; i = i + 7) {
            System.out.println(i);
        }

        // Task 7

        System.out.println("Taks 7");

        for (int i = 1; i != 1024; i = i * 2) {
            System.out.println(i);
        }

        // Task 8

        System.out.println("Taks 8");

        int salary = 29000;
        int total = 0;

        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Task 9

        System.out.println("Taks 8");

        salary = 29000;
        total = 0;

        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Task 10

        System.out.println("Taks 10");

        for (int i = 1; i != 11; i++) {
            int cons = 2;
            System.out.println(cons + " * " + i + " = " + cons * i);
        }
    }
}
