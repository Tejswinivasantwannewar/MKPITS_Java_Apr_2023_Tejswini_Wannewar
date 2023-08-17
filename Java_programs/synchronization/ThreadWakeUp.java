public class ThreadWakeUp extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName());


                total+=i;
            }
            notify();
        }
    }

}