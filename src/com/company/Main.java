package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantes vegades vols llançar els daus?");

        int numTiradas = in.nextInt();
        System.out.println(numTiradas);

        int max = 6;
        int min = 1;
        Random randomNumber = new Random();
        int dados [] = new int[13];
        for (int i = 0; i < numTiradas; i++) {
            int dau1 = randomNumber.nextInt(max) + min;
            int dau2 = randomNumber.nextInt(max) + min;
            int sumaDaus = dau1 + dau2;
            dados [sumaDaus] = dados[sumaDaus]+1;

        }
        for (int i = 2; i <= 12; i++) {
            System.out.println(i +" --> "+ dados[i] + " veces");

        }

    }
}
