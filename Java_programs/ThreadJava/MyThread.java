public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(  "Running");
    }

    public MyThread(String name) {
        super(name);
    }
}
