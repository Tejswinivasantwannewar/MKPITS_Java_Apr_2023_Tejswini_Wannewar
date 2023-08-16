public class Main {
    public static void main(String[] args) {

      //  System.out.println("Walking");   //priority of main thread is first
    //    System.out.println(Thread.currentThread().getPriority());//to get the priority number of main thread.


      //  MyThread thread=new MyThread("Mrunali");//priority of child thread is second means after main thread
       // thread.setName("Tejswini Vasant Wannewar");// to set the Child thread name


      //  Thread.currentThread().setName("Shubham Bhoyar"); //to set main thread name. -------setname always used after start ():.

       // System.out.println(Thread.currentThread().getName()); //to get main thread name -------------we can see the changes of main thread when we write changes aftre the object of child class.

    //    thread.start();
       // System.out.println("sleeping");


      //  System.out.println(thread.getPriority());  // priority number is from 1-10
      //  System.out.println(thread.getName()); // to check thread name



        //-----------runnable method----------------//


       // Thread thread1=new Thread( new YourThread(),"Pranay");  //we can pass object of yourThread like this ----in parameter
       // thread1.start();
       // YourThread yourThread=new YourThread();//-----------we can make object like this or that way also we can make an object using new keyword.

        // thread1.setPriority(8);//to set the thread priority of child ------you can give Priority as per your choice



        //Thread thread2=new Thread( new YourThread(),"Ankita");//if we take multiple thread and by making an object of that thread we can call what we print using start function ....start function is thread method ........if we call start function in multiple thrrad then
                                                                            //first it will give priority to second thread
       // thread2.start();


        //System.out.println("Thread counts  =  "  + Thread.activeCount());




       // System.out.println("-----------------even odd checking in loop using multi-thread-( Thread1 and Thread2  )--------------");
       // Thread t1 = new Thread(new Thread1());
      //  Thread t2=new Thread(new Thread2());

       // t1.start();
       // t2.start();


        System.out.println("----------------Random Number Checking --------------------------");
        Thread threadRandomNumber=new Thread(new ThreadRandomNumber());
        threadRandomNumber.start();

    }
}