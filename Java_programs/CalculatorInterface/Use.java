abstract  class Use{

    int Mobile_Number;
    abstract void start();
    abstract void close();
    void eat(){
        System.out.println("Press button to start");
    }

}
class methodLogic extends Use {


    void  start() {
        System.out.println("Press button to start");
    }
    void close(){}

}
class Tab extends Use {


    void  start() {
        System.out.println("Press button to start");

    }
    void close(){}
}

class MobileAbstractExample{
    public static void main(String args[])
    {
        methodLogic startMobile=new methodLogic();
        startMobile.start();

     /*  Use use=new Use();
           use.start();*/
    }
}