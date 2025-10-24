import java.util.Arrays;
import java.util.Random;

public class ArrayProcessor {

    public static void main(String[] args) {
        double[] fractionalArray = new double[15];
        Random random = new Random();

        for (int i = 0; i < fractionalArray.length; i++) {
            double value = random.nextDouble() * 10;

            if (i < 2) {
                fractionalArray[i] = value + 1.0;
            } else {
                if (random.nextBoolean()) {
                    fractionalArray[i] = value + 1.0;
                } else {
                    fractionalArray[i] = -(value + 1.0);
                }
            }
            fractionalArray[i] = Math.round(fractionalArray[i] * 100.0) / 100.0;
        }

        System.out.println("Сгенерированный массив:");
        System.out.println(Arrays.toString(fractionalArray));
        System.out.println("----------------------------------------");

        boolean afterFirstNegative = false;
        double sumOfPositives = 0.0;
        int countOfPositives = 0;

        for (double element : fractionalArray) {
            if (afterFirstNegative) {
                if (element > 0) {
                    sumOfPositives += element;
                    countOfPositives++;
                }
            }

            if (!afterFirstNegative && element < 0) {
                afterFirstNegative = true;
            }
        }

        if (countOfPositives > 0) {
            double average = sumOfPositives / countOfPositives;
            System.out.println("Среднее арифметическое: " + Math.round(average * 100.0) / 100.0);
        } else {
            System.out.println("В массиве нет положительных чисел после первого отрицательного.");
        }
    }
}
