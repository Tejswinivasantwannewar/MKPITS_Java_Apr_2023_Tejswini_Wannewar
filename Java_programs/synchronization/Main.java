public class Main {
    public static  void main(String[] args) {
        //Sender o=new Sender();
      //ThreadedSend thread=new ThreadedSend("hiiiii",o);
      //ThreadedSend  t2=new ThreadedSend("byeee",o);
      // thread.start();
     // t2.start();
       // System.out.println("---------------anonymous class-------------");
//      new Thread(new Runnable() {    ///anonymous class ..............
//            @Override
//            public void run() {
//                System.out.println("Tejswini Vasant Wannewar ");
//            }
//        }).start();   //you can start here by removing reference of object
      //t.start();



        //-----------------Wait ---------------------------//

        System.out.println("-------------Wait  and notify ---------------");


        Thread t4=new Thread(new ThreadWakeUp());
//        Thread t5=new Thread(new ThreadWakeUp());
       // Thread t6=new Thread(new ThreadWakeDown());

        t4.start();
//        t5.start();
      //  t6.start();


    }
}