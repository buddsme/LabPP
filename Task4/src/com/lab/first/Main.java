package com.lab.first;
import com.lab.first.interval.Interval;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the interval");
        System.out.print("X: ");
        int x = in.nextInt();
        System.out.print("Y: ");
        int y = in.nextInt();
        if(x > y){
            int tmp = x;
            x = y;
            y = tmp;
        }

        Interval interval = new Interval(x,y);

        System.out.println("\n");
        interval.Odd(x,y);
        System.out.println("\n");
        interval.Even(x,y);
        System.out.println("\n");
        interval.OddSum(x,y);
        System.out.println("\n");
        interval.EvenSum(x,y);
        System.out.println("\n");
        interval.Fibonacci(x,y);
    }
}
