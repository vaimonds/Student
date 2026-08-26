import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1

        System.out.println("Task 1");

        int[] inputArray1 = {150942, 60456, 89546, 47565, 322679};
        int sum = 0;
        int maxPay = inputArray1[0];
        int minPay = inputArray1[0];
        float averagePay = 0.0f;
        int count1 = 0;

        // Поиск суммы и максимальной выплаты
        for (int element : inputArray1) {
            sum = sum + element;
            if (maxPay < element) {
                maxPay = element;
            }
        }

        // Расчёт среднего значения
        averagePay = (float) sum / inputArray1.length;

        // Поиск минимального значения
        for (int element : inputArray1) {
            if (element < minPay) {
                minPay = element;
            }
        }

        float[] outputArray1 = {sum, maxPay, minPay, averagePay};

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));


        // Task 2

        System.out.println("Task 2");

        int[] inputArray2 = {150942, 60456, 89546, 47565, 322679};
        float[] outputArray2 = new float[5];
        float tax = 0.13f;
        float payTax = 0.0f;
        int count2 = 0;

        for (float element : inputArray2) {
            payTax = element * tax;
            outputArray2[count2] = payTax;
            count2++;
        }


        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));


        // Task 3

        System.out.println("Task 3");

        int[] inputArray3 = {1000, 2500, 5000, 7800, 13200};
        boolean[] outputArray3 = new boolean[5];
        int templateBonus = 5000;
        int count3 = 0;

        for (int element : inputArray3) {
            if (element < templateBonus) {
                outputArray3[count3] = false;
                count3++;
            } else {
                outputArray3[count3] = true;
                count3++;
            }
        }

        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        // Task 4

        System.out.println("Task 4");

        int[] inputArray4 = {1000, 2500, -5000, 7800, -13200};
        boolean[] outputArray4 = new boolean[1];

        for (int element : inputArray4) {
            if (element < 0) {
                outputArray4[0] = false;
                break;
            } else {
                outputArray4[0] = true;
            }
        }

        System.out.println(Arrays.toString(inputArray4));
        System.out.println((Arrays.toString(outputArray4)));

        // Task 5

        System.out.println("Task 5");

        int[] inputArray5 = {415765, 518276, 781492, 641328, -9851763};
        int[] outputArray5 = new int[1];
        int count = 0;

        for (int element : inputArray5) {
            if (element > 0) {
                count++;
            }
        }

        outputArray5[0] = count;

        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}
