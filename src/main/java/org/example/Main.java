package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Para değerini girin: ");
        double para = scanner.nextDouble();

        scanner.close();

        double kdvOrani = (para > 1000) ? 0.08 : 0.18;
        double kdvTutari = para * kdvOrani;
        double kdvliFiyat = para + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + para);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
    }
