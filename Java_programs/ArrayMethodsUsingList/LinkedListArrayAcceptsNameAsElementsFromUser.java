import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListArrayAcceptsNameAsElementsFromUser {
    public static void main(String[] args) {

        LinkedList list=new LinkedList();
//        System.out.println("-------Enter the name which you want to add in linked list---------");
        Scanner scanner=new Scanner(System.in);
        int marks;
        String name;

        String choice;
ArrayMethodsInLinkedListUserInput arrayMethodsInLinkedListUserInput=new ArrayMethodsInLinkedListUserInput();

      do {System.out.println("Enter String which you want to add in linked list :----");
         name= scanner.next();
         marks=scanner.nextInt();
//         list.add(name);
         list.add(new ArrayMethodsInLinkedListUserInput(marks,name));

         System.out.println("Do you want to add another string ");
         

         choice= scanner.next();

      }while (choice.equalsIgnoreCase("yes"));
        for (Object object:
             list)
        {
            System.out.println(object);
        }

        System.out.println(list);

      }

    }


