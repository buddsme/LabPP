package com.lab.first.interval;
import java.util.Scanner;

/**
 * class Interval with lower and upper limits
 * @author Artem
 * @version 1.0
 */
public class Interval {
    private int x;
    private int y;

    /**
     * constructor with params
     * @param x is the lower limit
     * @param y is the upper limit
     */
    public Interval(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return lower param
     */
    public int getX() {
        return x;
    }

    /**
     * @return upper param
     */
    public int getY() {
        return y;
    }

    /**
     * Use to set lower param
     * @param x is the lower param
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Use to set upper param
     * @param y is the upper param
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Sort the array in descending order
     * @param mas is array of values to sort
     */
    public void SortMinus(int[] mas){
        for(int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] < mas[j + 1]) {
                    int var = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = var;
                }
            }
        }
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + "  ");
        }
    }

    /**
     * Sort the array in ascending order
     * @param mas is array of values to sort
     */
    public void SortPlus(int[] mas){
        for(int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int var = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = var;
                }
            }
        }
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + "  ");
        }
    }

    /**
     * Method to find odd numbers
     * @param x is the lower limit
     * @param y is the upper limit
     */
    public void Odd(int x, int y){
        int count = y - x;
        int [] tmpmas = new int[count];
        int counter = 0;
        System.out.println("Odd numbers:");
        for(int i = x; i <= y; i++){
            if (i % 2 == 1 | i % 2 == -1){
                System.out.print(i + "  ");
                tmpmas[counter] = i;
                counter++;
            }
        }
        int [] mas = new int[counter];
        for(int i = 0; i < counter; i++){
            mas[i] = tmpmas[i];
        }
        System.out.print("\n");
        System.out.println("------------SORTED------------");
        SortMinus(mas);
        System.out.println("\n");
    }

    /**
     * Method to find even numbers
     * @param x is the lower limit
     * @param y is the upper limit
     */
    public void Even(int x, int y){
        int count = y - x;
        int [] tmpmas = new int[count];
        int counter = 0;
        System.out.println("Even numbers:");
        for(int i = x; i <= y; i++){
            if (i % 2 == 0){
                System.out.print(i + "  ");
                tmpmas[counter] = i;
                counter++;
            }
        }
        int [] mas = new int[counter];
        for(int i = 0; i < counter; i++){
            mas[i] = tmpmas[i];
        }
        System.out.print("\n");
        System.out.println("------------SORTED------------");
        SortPlus(mas);
        System.out.print("\n");
    }

    /**
     * Use to get sum of odd numbers
     * @param x is the lower param
     * @param y is the upper param
     */
    public void OddSum(int x, int y){
        int sum = 0;
        for(int i = x; i <= y; i++){
            if(i % 2 == 1 | i % 2 == -1)
                sum += i;
        }
        System.out.println("Sum of odd numbers:  " + sum);
    }

    /**
     * Use to get sum of even numbers
     * @param x is the lower param
     * @param y is the upper param
     */
    public void EvenSum(int x, int y){
        int sum = 0;
        for(int i = x; i <= y; i++){
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println("Sum of even numbers:  " + sum);
    }

    /**
     * Method to find largest even num and odd num,
     * find Fibonacci series,
     * percent of odd and even numbers,
     * print all it out
     * @param x is the lower param
     * @param y is the upper param
     */
    public void Fibonacci(int x, int y){
        int largestEven = 0;
        int largestOdd = 0;
        int length;
        if (y % 2 == 0){
            largestEven = y;
            largestOdd = y - 1;
        }
        else if(y % 2 == 1){
            largestOdd = y;
            largestEven = y - 1;
        }
        if(largestEven > largestOdd){
            int tmp = largestEven;
            largestEven = largestOdd;
            largestOdd = tmp;
        }

        System.out.print("Length of Fibonacci series: ");
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
        int [] mas = new int[length];
        mas[0] = largestEven;
        mas[1] = largestOdd;
        for(int i = 2; i < length; i++){
            mas[i] = mas[i - 2] + mas[i - 1];
        }
        System.out.println("----------Fibonacci series----------");
        for(int i = 0; i < length; i++){
            System.out.print(mas[i] + " ");
        }

        int evenCounter = 0;
        int oddCounter = 0;
        for(int i = 0; i < length; i++){
            if(mas[i] % 2 == 0){
                evenCounter++;
            }
            else{
                oddCounter++;
            }
        }
        System.out.println("\n");
        int percent = evenCounter * 100 / length;
        System.out.println(percent + "% even numbers");
        System.out.println(100 - percent + "% odd numbers");
    }
}
