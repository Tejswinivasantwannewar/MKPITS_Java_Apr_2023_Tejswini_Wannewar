import java.util.HashMap;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put(190,"Pranay");
        hashMap.put(103,"Tejswini");
        System.out.println(hashMap);


        System.out.println("entry set method----------------");
         hashMap.entrySet();

        System.out.println("get method----------------");
        System.out.println(hashMap.get(190));
        HashMap hashMap1=new HashMap();
        hashMap1.putAll(hashMap);
        System.out.println(hashMap1);

        HashMap <String,Integer> hashMap3=new HashMap<String,Integer>();
        System.out.println(hashMap3);

    }
}
