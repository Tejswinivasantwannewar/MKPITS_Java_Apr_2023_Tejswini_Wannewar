public class LamdaExpression {

        public static void main(String[] args) {
            Runnable runnable = new Runnable(){
                @Override
                public void run() {
                    System.out.println("Even number = ");
                    for(int counter=1; counter<100; counter++){
                        if(counter%2 == 0){
                            System.out.print(counter + " ");
                        }
                    }
                }
            };
            runnable.run();
            System.out.println();

            Runnable runnable1 = new Runnable(){
                @Override
                public void run(){
                    System.out.println("Odd number = ");
                    for(int counter=0; counter<100; counter++){
                        if(counter%2 != 0){
                            System.out.print(counter + " ");
                        }
                    }
                }
            };
            runnable1.run();

        }
    }

