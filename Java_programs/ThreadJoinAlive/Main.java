public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread( new ThreadJoin());
        Thread t2=new Thread(new ThreadJoin());
        t1.start();
        try {
            t1.join();        //this join method hellps to run program properly .............first it will run fisrt task then it will start the second task .
                               // when we use join method then it will not give random number that means it will not run simulatneously .
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();


    }
}