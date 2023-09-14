package FunctionInterface;

public class FunctionalInterfaceAnonymousClass {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hiiiii");
            }

        });thread.start();
    }
}
