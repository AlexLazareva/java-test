package task_1;

import java.lang.*;
import java.util.Arrays;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        Integer[] numbers = {12, 6, 16, 54, 52};
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Max number is: " + numbers[0]);
        System.out.println("Min number is: " + numbers[numbers.length - 1]);

        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }

        double middle = sum / numbers.length;

        System.out.println("Cреднее значение всех чисел массива равно: " + middle);
    }
}
