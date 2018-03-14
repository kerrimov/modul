package UnknownNum;

import java.util.Scanner;

public class Main_Num {
    public static void main(String[] args) {
        System.out.println("Я загадаю число от 1 до n. Введите n");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int ran = (int) (Math.random() * n);
        //System.out.println(ran);

        System.out.println("Я загадал число. Теперь введите количество попыток");
        int k = scr.nextInt();
        System.out.println("А теперь отгадайте мое число");
        for (int i = 0; i < k; i++) {
            int num = scr.nextInt();
            if (num == ran) {
                System.out.println("Поздравляю. Вы угадали число!");
            } else if (num > ran) {
                System.out.println("Ваше число больше моего");
            } else if (num < ran) {
                System.out.println("Мое число больше вашего");
            }
        }
        System.out.println("Ваши попытки закончились");
    }
}

