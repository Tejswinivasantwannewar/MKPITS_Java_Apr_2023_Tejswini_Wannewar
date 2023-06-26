public class Main {

    public static  void main(String args[]) {
    /*--------------- Covert LongValue Primitive to Wrapper class ---------------------------*/
                PrimitiveToWrapperLong primitiveToWrapper = new PrimitiveToWrapperLong();
        System.out.println("Long value is: " + primitiveToWrapper.getLongWrapperFromPrimitive());
        System.out.println("Bit count of Long: " + primitiveToWrapper.getLongBitCountFromPrimitive());
        System.out.println("Long from string value: " + primitiveToWrapper.getLongBFromStringValue());
        System.out.println("Convert back to String from Long from string value: " + String.valueOf(primitiveToWrapper.getLongBFromStringValue()));
        System.out.println("----------------------------- Primitive to wrapper class using Integer dataType ------------------------------------");

        /*-------------------- Convert IntegerValue Primitive to Wrapper class ----------------------- */
        PrimitiveToWrapperInteger primitiveToWrapperInteger = new PrimitiveToWrapperInteger();
        System.out.println("Integer value is : " + primitiveToWrapperInteger.getIntegerWrapperFromPrimitive());
        System.out.println("Integer from String value : " +primitiveToWrapperInteger.getIntegerFromStringValue());
        System.out.println("Convert back to string from Integer from string value : " + String.valueOf(primitiveToWrapperInteger.getIntegerFromStringValue()));
        System.out.println("BitCount value of Integer Value : " + primitiveToWrapperInteger.getIntegerBitFromIntegerValue());

        System.out.println("Comparison between two Integer value = " + primitiveToWrapperInteger.compareTwoValue());
        System.out.println("Comparison between two Unsigned Integer  value = " + primitiveToWrapperInteger.compareUnsignedValueBetweenTwoNumber());
        System.out.println("Decoding the Integer value to String value = " + primitiveToWrapperInteger.decodeTheString());
        System.out.println(" The Divide_Unsigned method returns the division between two number= " + primitiveToWrapperInteger.divideUnsignedValue());
        System.out.println(" Getnumber method between String value and integer value= " + primitiveToWrapperInteger.getIntegerValueBetweenStringValueAndIntegerValue());
        System.out.println(" Getnumber method between String value = " + primitiveToWrapperInteger. getIntegerValueStringValue());





    }

}