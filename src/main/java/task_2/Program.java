package task_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            if (m % 2 != 0) {
                array[i] = m;
            }
        }
        System.out.println(array.toString());
    }
}
