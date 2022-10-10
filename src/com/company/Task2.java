package com.company;

public class Task2 {
    public static void main(String[] args) {
/*В диапазоне [1..10] найти количество чисел, которые делятся на 2 или на 3.*/
        int a = 0,b = 0;
        for (int i = 1; i<=10; i++ ){
            if (i%2 == 0 && i%3 == 0){
                a++;
                b++;
            }else if (i%2 == 0){
                a++;
            }else if (i%3 == 0){
                b++;
            }

        }
        System.out.printf("Количество числе которые делятся на 2 : %d , а на 3 : %d",a,b);
    }
}
