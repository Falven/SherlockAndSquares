package com.dapper_apps;

import java.util.Scanner;

/**
 * Created by falven on 4/20/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        String[] lines = new String[t];
        for(int i = 0; i < t; ++i) {
            lines[i] = input.nextLine();
        }
        for(int i = 0; i < t; ++i) {
            String[] numbers = lines[i].trim().split("\\s+");
            System.out.println(countSquares(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[numbers.length - 1])));
        }
    }

    public static int countSquares(int a, int b) {
        // n =        3  4  5
        // sqrt(n) = 1.7 2 2.4
        //            2     2
        //               0     + 1 = 2
        // When you take the square root of the first and last number,
        // all the numbers in between are the whole number square roots of the
        // numbers in the non-square root range.
        a = (int)Math.ceil(Math.sqrt(a));
        b = (int)Math.floor(Math.sqrt(b));
        return b - a + 1;
    }
}
