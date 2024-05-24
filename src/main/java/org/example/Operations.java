package org.example;
import java.math.BigInteger;
import java.io.*;
public class Operations {
    public static void main( String[] args) throws IOException{
        other("file.txt");
    }
    public static void other(String fileName) throws IOException{
        try {
            int[] numbers;
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String k = reader.readLine();
                if (k != null) {
                    String[] numberStrings = k.split(" ");
                    numbers = new int[numberStrings.length];
                    for (int i = 0; i < numberStrings.length; i++) {
                        numbers[i] = Integer.parseInt(numberStrings[i]);
                    }
                } else {
                    throw new IOException("Файл пуст");
                }
            }
            int min = min(numbers);
            int max = max(numbers);
            BigInteger sum = sum(numbers);
            BigInteger mult = mult(numbers);

            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное число: " + max);
            System.out.println("Сумма всех чисел: " + sum);
            System.out.println("Произведение всех чисел: " + mult);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Ошибка");
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
    public static int min(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i : numbers) {
            int number = i;
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int max(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i : numbers) {
            int number = i;
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static BigInteger sum(int[] numbers) {
        BigInteger sum = BigInteger.ZERO;
        for (int i : numbers) {
            BigInteger number = new BigInteger(String.valueOf(i));
            sum = sum.add(number);
        }
        return sum;
    }

    public static BigInteger mult(int[] numbers) {
        BigInteger product = BigInteger.ONE;
        for (int i : numbers) {
            BigInteger number = new BigInteger(String.valueOf(i));
            product = product.multiply(number);
        }
        return product;
    }
}
