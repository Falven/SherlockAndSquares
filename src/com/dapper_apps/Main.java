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
        while(t-- > 0) {
            lines[t] = input.nextLine();
        }
        for(int i = 0; i < lines.length; ++i) {
            String[] numbers = lines[i].trim().split("\\s+");
            System.out.println(countSquares(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
        }
    }

    /**
     * Count the number of square integers between a and b, inclusive.
     * @param a
     * @param b
     * @return The number of square integers between a and b, inclusive.
     */
    public static int countSquares(int a, int b) {
        
        return a + b;
    }
}
