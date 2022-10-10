package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        String a = scanner.nextLine();
        int l = a.length();
        for (int i = 0; i < l ; i++) {
            Character c = a.charAt(i);
            int d = Integer.parseInt(c.toString());
        switch (d){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("I don't know");}
        }

    }
}
        /*Пользователь вводит с клавиатуры целое число. Компьютер понимает только "0" и "1".
Если пользователь вводит "0", программа печатает "zero", если "1", то "one", в противном случае
"I don't know".
        */