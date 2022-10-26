package org.example;

import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        zahlListe();

        wordList();
    }

    //Fülle ein String-Array mit den Zahlenwörtern "Eins" bis "Zehn"
    public static String[] zahlenwortArray(){
        return new String[]{"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn" };
    }

    //Schreibe eine Methode die zu einer einstelligen Zahl das entsprechende Zahlenwort ausgibt.
    public static String zahlenWort(int zahl){

        return zahlenwortArray()[zahl-1];
    }

    //Schreibe ein Programm das die Zahlen 1-100 ausgibt, aber:
    //Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
    //Vor Zahlen die durch 5 teilbar sind soll ein $ stehen
    public static void zahlListe(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(convertNum(i));
        }
    }

    public static String convertNum(int i){
        if (i%15==0){
            return "#$"+i;
        }else if(i%3==0){
            return "#"+i;
        }else if(i%5==0){
            return "$"+i;
        }else{
            return String.valueOf(i);
        }
    }
    //Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner) und diese in einem Array speichert.
    //Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch mal aus.
    public static void wordList(){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count =0;
        while(count<5){
            System.out.println("gebe was ein");
            sb.append(" ").append(sc.next());
            count++;
            System.out.println(sb);
        }
    }
}
