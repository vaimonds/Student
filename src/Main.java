import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1

        System.out.println("Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника для заполнения отчета — " + fullName);

        // Task 2

        System.out.println("Task 2");

        System.out.println(fullName.toUpperCase());

        // Task 3

        System.out.println("Task 3");

        fullName = "Иванов Семён Семёныч";

        System.out.println(fullName.replace('ё', 'е'));

    }
}
