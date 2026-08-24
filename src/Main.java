import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1

        int[] array = new int[]{1, 2, 3};

        double[] flo = new double[]{1.57, 7.654, 9.986};

        // Task 2

        System.out.println("Task 2");

        int i = 0;
        while (i < 3) {

            if (i == 2) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
            i++;

        }

        System.out.println(" ");

        i = 0;
        while (i < 3) {

            if (i == 2) {
                System.out.print(flo[i]);
                break;
            }
            System.out.print(flo[i] + ", ");
            i++;
        }

        System.out.println(" ");

        // Task 3

        System.out.println("Task 3");

        i = 2;
        while (i != - 1) {
            if (i == 0) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
            i--;
        }


        System.out.println(" ");

        i = 2;
        while (i != - 1) {
            if (i == 0) {
                System.out.print(flo[i]);
                break;
            }
            System.out.print(flo[i] + ", ");
            i--;
        }

        System.out.println(" ");

        // Task 4

        System.out.println("Task 4");

        i = 0;

        while (i < array.length) {
            if (array[i] % 2 != 0){
                array[i] = array[i] + 1;
                i++;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));

    }
}
