public class YourThread implements Runnable {

    @Override
    public void run() {
       // System.out.println("hiii running in runnable method");

        System.out.println("tejuuuuu");
        while(true){
            System.out.println(Thread.currentThread().getName());


           // System.out.println(Thread.currentThread().getPriority());
        }

       // System.out.println(Thread.currentThread().setPriority(9));-------we can set priority after start





    }
}
