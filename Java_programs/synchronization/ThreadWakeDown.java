public class ThreadWakeDown {
    public static void main(String args[]){
        ThreadWakeUp t = new ThreadWakeUp();
        t.start();
        synchronized (t){
            try {
                System.out.println("waiting for the exececution of t -------");
                t.wait();

            } catch (InterruptedException e) {
               // e.getMessage();
            }
            System.out.println("total    "+t.total);
        }
    }
}
