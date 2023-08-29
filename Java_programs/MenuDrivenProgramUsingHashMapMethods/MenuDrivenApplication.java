import java.util.HashMap;
import java.util.Scanner;

public class MenuDrivenApplication {
    public static void displayDetailsOfHashMap(){
        HashMap <Integer,String> hashMap=new HashMap();
        Scanner scanner=new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("1-Add"+"\n"+"2-Display Details"+"\n"+"3-Find"+"\n"+"4-Delete Data"+"\n"+"5-Replace"+"\n"+"6-clear All"+"\n"+"0-Exit");
            System.out.println("Enter your choice---------------");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the code of city:- ");
                    Integer code = scanner.nextInt();
                    System.out.println("Enter the city Name:-");
                    String city_name = scanner.next();
                    hashMap.put(code, city_name);
                    break;

                case 2:
                    System.out.println(hashMap);
                    break;

                case 3:
                    System.out.println("Enter the code of city:-");
                    Integer codeOf_city = scanner.nextInt();
                    System.out.println("City of given code is:-" + " " + hashMap
                            .get(codeOf_city));
                    break;
                case 4:
                    System.out.println("Enter the code of city which you want to delete:-");
                    Integer city_delete = scanner.nextInt();
                    System.out.println("deleted record is:-" + " " + hashMap.remove(city_delete));
                    System.out.println(hashMap);
                    break;


                case 5:

                    System.out.println("Enter the code of city which you want to replace:-");
                    Integer code_replace = scanner.nextInt();
                    System.out.println("Enter the Changed Name of city:-");
                    String city_new = scanner.next();
                    hashMap.replace(code_replace, city_new);
                    System.out.println(hashMap);
                    break;

                case 6:
                    hashMap.clear();
                    System.out.println("Data is cleared");
                    System.out.println(hashMap);

                case 0:
                    return;

            }
        }
    }
}
