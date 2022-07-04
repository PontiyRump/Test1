package Task_1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3, 7};
        int max = getMax(array);
        System.out.println("Maximum Value is: " + max);
        int min = getMin(array);
        System.out.println("Minimum Value is: "+min);

        double average = 0;
        if (array.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        System.out.println(average);

    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int x = 1; x < inputArray.length; x++) {
            if (inputArray[x] > maxValue) {
                maxValue = inputArray[x];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int x = 1; x < inputArray.length; x++) {
            if (inputArray[x] < minValue) {
                minValue = inputArray[x];
            }
        }
        return minValue;
    }

}