import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1

        System.out.println("Task 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Ф. И. О. Сотрудника = " + fullName);

        // Task 2

        System.out.println("Task 2");

        System.out.println(fullName.toUpperCase());

        // Task 3

        System.out.println("Task 3");

        fullName = "Иванов Семён Семёныч";

        System.out.println(fullName.replace('ё', 'е'));

    }
}
