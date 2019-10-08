package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą:");
        int k = input.nextInt();
        for (int i=0; i<=k; i++) {
            long l = (long)Math.pow(2, i);
            System.out.println("2 do potęgi " + i + " wynosi " + l);
        }
    }
}
