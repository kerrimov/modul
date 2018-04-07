package Task2;

import java.util.Scanner;

    public class Game {
        public static void main(String[] args) {
            PingPong pipo = new PingPong();
            Thread pipoThread = new Thread(pipo);
            pipoThread.start();

            System.out.println("Commands:\n " +
                    "1 - Bump\n");
            Scanner scanner = new Scanner(System.in);

            while (pipoThread.isAlive()) {
                int command = scanner.nextInt();
                doSomething(pipo, command);
            }

            System.exit(0);
        }

        private static void doSomething(PingPong pipo, int command) {
            switch (command){
                case 1:
                    pipo.play();
                    break;
                default:
                    System.out.println("Wrong command number");
            }
        }
    }


