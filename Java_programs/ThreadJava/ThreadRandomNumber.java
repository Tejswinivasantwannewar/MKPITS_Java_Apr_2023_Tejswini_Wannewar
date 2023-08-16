import java.util.concurrent.ThreadLocalRandom;

public class ThreadRandomNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Math.floor(Math.random()*100));  //math.

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}