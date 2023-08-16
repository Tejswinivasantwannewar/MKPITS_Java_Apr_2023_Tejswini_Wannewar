public class StringClass {
    public void stringMismatch(String str1, String str2) throws StringMismatch){
        Object str1;
        if (str1.equals(str2)) {
            System.out.println("Strings are Match");
        } else
        throw  new StringMismatch();
    }

}
