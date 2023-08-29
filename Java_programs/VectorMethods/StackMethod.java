import java.util.Scanner;
import java.util.Stack;

public class StackMethod {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Stack stack=new Stack();
        stack.push(520);
        stack.push(854);
        stack.push(897);
//        System.out.println("Peek method------------");
//        System.out.println(stack.peek());            //  last in first out .
//        System.out.println("pop method----------------");
//        System.out.println(stack.pop());


        System.out.println("object srach method------------------");
        System.out.println(   stack.search(854));


        String choice;
        System.out.println("check popped element in stack ------------------");

        do {
            if(stack.isEmpty())
            {
                System.out.println("Stack is Empty ");
                break;
            }
            System.out.println("Popped element :-"+stack.pop());
            System.out.println("-------Do You want to Pop next item in stack (yes/no----------- ");
            choice=scanner.next();

        }while (choice.equalsIgnoreCase("yes"));

    }
}
