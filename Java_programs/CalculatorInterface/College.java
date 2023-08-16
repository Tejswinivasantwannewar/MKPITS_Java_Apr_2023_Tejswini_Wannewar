interface college{
    public void department();
}
interface school{
    public void Library();
}

class AchieveMultipleInheritance implements college, school{
    public 	void department(){
        System.out.println("Department list");
    }
    public void Library(){
        System.out.println("book list");
    }

    public static void main(String args[])
    {
        AchieveMultipleInheritance use=new  AchieveMultipleInheritance();
        use.Library();
        use.department();
    }

}