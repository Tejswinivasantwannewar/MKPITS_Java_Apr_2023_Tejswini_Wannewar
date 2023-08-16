interface Interface{

    int number=10;
    public void print();

    default void xerox(){
        System.out.println("xerox the Copy");
    }

    static void show(){

        System.out.println("Show the output");
    }

    private void Activity(){

    }

/*protected  void calculate(){

     System.out.println("Show the output");
}
*/



}
class Test2 implements Interface{

    public void print(){
        System.out.println("Print the book");

    }



}


class Test {
    public static void main(String args[])
    {
        Test2 test=new Test2();
        test.print();
        test.xerox();
    }
}