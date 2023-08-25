public class ArrayMethodsInLinkedListUserInput {
    private  int marks;
    private String name;

    public ArrayMethodsInLinkedListUserInput() {

    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public ArrayMethodsInLinkedListUserInput(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
public String toString()
{
    return name+"  " +marks;
}


}
