//public class SynchronizationDemoClass {
//
//
//    public class Display {
//        public synchronized void wish(String name){
//            for(int counter=0; counter<5; counter++) {
//                System.out.print("Good morning : ");
//                try {
//                    Thread.sleep(2000);
//                }catch (InterruptedException e){
//                    System.out.println(e);
//                }
//                System.out.println(name);
//            }
//        }
//    }
//}
//
//
//
//public class MyThread extends Thread{
//    private Display d;
//    private String name;
//
//    public MyThread(Display d,  String name){
//        this.d=d;
//        this.name=name;
//    }
//    public void run(){
//        d.wish(name);
//    }
//}
//
//
//
//public class SynchronizationDemo {
//    public static void main(String[] args) {
//        Display d = new Display();
//        MyThread t1 = new MyThread(d,"Dhoni");
//        MyThread t2 = new MyThread(d,"Yuvraj");
//        t1.start();
//        t2.start();
//    }
//}