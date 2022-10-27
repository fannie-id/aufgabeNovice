package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Expert {
    public static void main(String[] args) {
        String text ="Lorem ipsum dolor sit amet, consetetur sadipscing elitr, " +
                "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, " +
                "sed diam voluptua.";
        System.out.println(reversEingabe());
        seperateText(text);
        crossSum2(549493);
        romaZahl(78);
        sortArray();
    }

    //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    public static String reversEingabe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("bitte gebe was ein");
        String eingabe = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = eingabe.length()-1; i >=0; i--) {

            sb.append(eingabe.charAt(i));
        }
        return sb.toString();
    }

    //Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}
    public static int[] sortArray(){
        int[] arr = {6, 2, 8, 3, 9, 6};
        Arrays.sort(arr);
        return arr;
    }

    //Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
    public static String[] seperateText(String text){
        String[] res = text.split(", ");
        for (String str: res) {
            System.out.println(str);
        }
        return res;
    }

    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
    public static int crossSum1(int num){
        String n = "" +num;
        int len = n.length();
        int sum = 0;
        int res = 0;
        for (int i = 0; i < len; i++) {
            res = num%10;
            sum += res;
            num /= 10;
        }
        return sum;
    }

    public static int crossSum2(int num){
        String n = "" +num;
        int len = n.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int c = n.charAt(i);
            System.out.println(c);

            sum += c-48;
        }
        System.out.println(sum);
        return sum;
    }

    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)

    public static String romaZahl(int num){

        String[] einser={"I","II"," III","IV","V","VI","VII","VIII","IX"};
        String[] zeher={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hunder = "C";
        if(num==100){
            return hunder;
        }
        String roNum = zeher[num/10-1]+einser[num%10-1];
        System.out.println(roNum);
        return roNum;
    }
}
