package Array;

import java.util.Scanner;

public class Array_main {
   public static void main(String[] args) {
        System.out.println("На сколько элементов массив?");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] mas = new int[n];
        int count = 1;
        int j;
        for (int i = 0; i < mas.length - 1; i++) {
            mas[i] = (int) (Math.random() * n);
        }

        for (int i = 0; i < mas.length - 1; i++) {
            for (j = i+1; j < mas.length; j++){
                if (mas[i] == mas[j]){
                    break;
                }
            }
            if (j == mas.length){
                count++;
            }
            System.out.print(mas[i] + " ");
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("Ответ: " + count);
    }
}
