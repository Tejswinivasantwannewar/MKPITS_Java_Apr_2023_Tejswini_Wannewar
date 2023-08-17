public class Sender {
    public  synchronized void  send(String  msg){   ///synchronized method--------

       synchronized (this) {  //synchronized block----we cannot use this when we use static keyword.  \
           System.out.println("sending   --->   " + msg);
           System.out.println("Send --->   " + msg);
       }

    }
}
