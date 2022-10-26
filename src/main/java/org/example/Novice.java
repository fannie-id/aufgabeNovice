package org.example;

import java.util.Scanner;

public class Novice {
    public static void main(String[] args) {
        //showName();


    }

    //Schreibe ein Programm das deinen Namen ausgibt.
    //Lass den Namen mit Hilfe einer Schleife 5 mal ausgeben.
    public static void showName() {
        int count = 0;
        String myName = "Fangfang";
        while (count < 5) {
            System.out.println("my name is " + myName);
            count++;
        }
    }

    //Schreibe eine Methode die prüft ob eine Zahl größer als 0 ist.
    public static boolean isBiggerThanZero(int num) {
        return num > 0;
    }

    //Schreibe eine Methode die das Quadrat einer Zahl berechnet.
    public static int calSquare(int num) {
        return num * num;
    }
    //Schreibe ein Programm, das den Namen des Nutzers einliest (Scanner) und ihn mit Namen begrüßt.

    public static void sayHallo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("bitte geben Sie ihr Namen");
        String name = sc.next();

        System.out.println("Guten Abend! " + name);
    }
}