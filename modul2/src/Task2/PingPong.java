package Task2;

public class PingPong implements Runnable {
        private static final int MAX_VALUE = 100;
        private static final int NORMAL_VALUE = 10;
        private int errorCounter = 0;

        private int playLevel = MAX_VALUE;
        private int playLevelStep = 70;

        @Override
        public void run() {
            while (!rip()) {
                try {
                    decreaseParametrs();
                    showProblems();
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(200);
                        if (errorCounter >= 5){
                            break;
                        }
                    }
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Came Over. U lose");
        }

        private void showProblems() {
            if (playLevel <= NORMAL_VALUE){
                System.out.println("Ping");
            }

        }

        public void play() {
            if (playLevel <= NORMAL_VALUE){
                playLevel = MAX_VALUE;
            }else{
                errorCounter++;
            }
            System.out.println("Pong");
        }



        private boolean rip() {
            return (playLevel <= 0 || errorCounter>=5);
        }

        private  void decreaseParametrs(){
            playLevel-= playLevelStep;
        }
    }


