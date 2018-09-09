package Hourse;

import java.util.Scanner;

public class Main_Hourse {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        Scanner scr = new Scanner(System.in);

        System.out.println("Где конь?");
        int m = 0;
        int n = 0;
        int x = 0;
        int y = 0;

        board[n][m] = scr.nextInt();

        System.out.println("Куда поставить?");
        board[x][y] = scr.nextInt();


        int tryX;
        int tryY;
        //int[] possibleX = {2, 2, -2, -2, 1, -1, 1, -1};
        //int[] possibleY = {1, -1, -1, 1, -2, -2, 2, 2};


       /* public void typeXY () {
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            y = scanner.nextInt();


            tryX = scanner.nextInt();
            tryY = scanner.nextInt();
        }

        public void checkMove () {
            for (int i = 0; i < 8; i++) {
                if (tryX - possibleX[i] == x || tryY - possibleY[i] == y) {
                    System.out.println("Possible move");
                }

            }
        }


    }
}
*/
    }
}