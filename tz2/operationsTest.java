package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import java.io.IOException;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class operationsTest {
    @Before
    @Test
    public void programExceptionFirst() throws NumberFormatException {
        Throwable thrown = assertThrows(NumberFormatException.class, () -> {
            Operations.other("fileWrong.txt");
        });
        assertNotNull(thrown.getMessage());

    }
    @Before
    @Test
    public void programExceptionSecond() throws IOException {
        Throwable thrown = assertThrows(IOException.class, () -> {
            Operations.other("empty.txt");
        });
        assertNotNull(thrown.getMessage());

    }

    @Test
    public void testMin(){
        int[] numbers = {5, 7, 15, 2, 36};
        assertEquals(2, Operations.min(numbers));
    }
    @Test
    public void testMax(){
        int[] numbers = {7, 8, 10, 6, 5};
        assertEquals(10, Operations.max(numbers));
    }
    @Test
    public void testSum(){
        int[] numbers = {5, 10, 6, 8, 9};
        assertEquals(BigInteger.valueOf(38), Operations.sum(numbers));
    }
    @Test
    public void testMult(){
        int[] numbers = {2, 1, 3, 4, 6};
        assertEquals(BigInteger.valueOf(144), Operations.mult(numbers));
    }
    @Test
    public void testTimeMin(){
        long startTimeBig = System.nanoTime();
        int[] numbersBig = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            numbersBig[i] = i;
        }
        Operations.min(numbersBig);
        long endTimeBig = System.nanoTime();
        long durationBig = endTimeBig - startTimeBig;
        System.out.println("Время нахождения минимального значения с 1000000 элементами " + durationBig + " нс");

        long startTimeSmall = System.nanoTime();
        int[] numbersSmall = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersSmall[i] = i;
        }
        Operations.min(numbersSmall);
        long endTimeSmall= System.nanoTime();
        long durationSmall = endTimeSmall - startTimeSmall;
        System.out.println("Время нахождения минимального значения с 10 элементами " + durationSmall + " нс");
        assertTrue("Время выполнения операции слишком долгое: " + durationSmall + "нс", durationSmall < 100);
        System.out.println();
    }
    @Test
    public void testTimeMax(){
        long startTimeThird = System.nanoTime();
        int[] numbersThird = new int[10000];
        for (int i = 0; i < 10000; i++) {
            numbersThird[i] = i;
        }
        Operations.max(numbersThird);
        long endTimeThird = System.nanoTime();
        long durationThird = endTimeThird - startTimeThird;
        System.out.println("Время нахождения максимального значения с 10000 элементами " + durationThird + " нс");

        long startTimeSecond = System.nanoTime();
        int[] numbersSecond = new int[5000];
        for (int i = 0; i < 5000; i++) {
            numbersSecond[i] = i;
        }
        Operations.max(numbersSecond);
        long endTimeSecond = System.nanoTime();
        long durationSecond = endTimeSecond - startTimeSecond;
        System.out.println("Время нахождения максимального значения с 5000 элементами " + durationSecond + " нс");

        long startTimeFourth = System.nanoTime();
        int[] numbersFourth = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbersFourth[i] = i;
        }
        Operations.max(numbersFourth);
        long endTimeFourth = System.nanoTime();
        long durationFourth = endTimeFourth - startTimeFourth;
        System.out.println("Время нахождения максимального значения с 1000 элементами " + durationFourth + " нс");

        long startTimeOne = System.nanoTime();
        int[] numbersOne = new int[500];
        for (int i = 0; i < 500; i++) {
            numbersOne[i] = i;
        }
        Operations.max(numbersOne);
        long endTimeOne = System.nanoTime();
        long durationOne = endTimeOne - startTimeOne;
        System.out.println("Время нахождения максимального значения с 500 элементами " + durationOne + " нс");

        long startTimeFifth = System.nanoTime();
        int[] numbersFifth = new int[100];
        for (int i = 0; i < 100; i++) {
            numbersFifth[i] = i;
        }
        Operations.max(numbersFifth);
        long endTimeFifth = System.nanoTime();
        long durationFifth = endTimeFifth - startTimeFifth;
        System.out.println("Время нахождения максимального значения с 100 элементами " + durationFifth + " нс");

        long startTimeBig = System.nanoTime();
        int[] numbersBig = new int[50];
        for (int i = 0; i < 50; i++) {
            numbersBig[i] = i;
        }
        Operations.max(numbersBig);
        long endTimeBig = System.nanoTime();
        long durationBig = endTimeBig - startTimeBig;
        System.out.println("Время нахождения максимального значения с 50 элементами " + durationBig + " нс");

        long startTimeSmall = System.nanoTime();
        int[] numbersSmall = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersSmall[i] = i;
        }
        Operations.max(numbersSmall);
        long endTimeSmall= System.nanoTime();
        long durationSmall = endTimeSmall - startTimeSmall;
        System.out.println("Время нахождения максимального значения с 10 элементами " + durationSmall + " нс");
        System.out.println();
    }
    @Test
    public void testTimeSum(){
        long startTimeBig = System.nanoTime();
        int[] numbersBig = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            numbersBig[i] = i;
        }
        Operations.sum(numbersBig);
        long endTimeBig = System.nanoTime();
        long durationBig = endTimeBig - startTimeBig;
        System.out.println("Время суммирования 1000000 элементов " + durationBig + " нс");

        long startTimeSmall = System.nanoTime();
        int[] numbersSmall = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersSmall[i] = i;
        }
        Operations.sum(numbersSmall);
        long endTimeSmall= System.nanoTime();
        long durationSmall = endTimeSmall - startTimeSmall;
        System.out.println("Время суммирования 10 элементов " + durationSmall + " нс");
        System.out.println();
    }
    @Test
    public void testTimeMult(){
        long startTimeBig = System.nanoTime();
        int[] numbersBig = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            numbersBig[i] = i;
        }
        Operations.mult(numbersBig);
        long endTimeBig = System.nanoTime();
        long durationBig = endTimeBig - startTimeBig;
        System.out.println("Время перемножения 1000000 элементов " + durationBig + " нс");

        long startTimeSmall = System.nanoTime();
        int[] numbersSmall = new int[10];
        for (int i = 0; i < 10; i++) {
            numbersSmall[i] = i;
        }
        Operations.mult(numbersSmall);
        long endTimeSmall= System.nanoTime();
        long durationSmall = endTimeSmall - startTimeSmall;
        System.out.println("Время перемножения 10 элементов " + durationSmall + " нс");
        System.out.println();
    }
}
