public class PrimitiveToWrapperInteger {
    public Integer xValue = 227882;
    public Integer yValue = 27283;
    public Integer number1Value =150;
    public  Integer number2Value= 30;

    public Integer pIntegerValue = 10;
    public String dualStringValue ="tejswini0" + "wannewar";
    public String sIntegerValue = "74839929";


    public Integer getIntegerWrapperFromPrimitive(){
        return Integer.valueOf(pIntegerValue);
    }
    public Integer getIntegerFromStringValue(){
        return Integer.valueOf(sIntegerValue);
    }
    /*This method returns the count of the number of one-bits in the two's complement
    binary representation of an int value.*/
    public Integer getIntegerBitFromIntegerValue(){
        return Integer.bitCount(pIntegerValue);

    }
    /*Java Integer compareUnsigned() method
        lang package compares two integer values (x, y) given as a parameter, treating the values as unsigned and returns the value zero if (x==y),
        if (x < y) then it returns a value less than zero, and if (x > y) then it returns a value greater than zero.*/
    public Integer compareTwoValue(){
        return Integer.compare(xValue,yValue);
    }
    public Integer compareUnsignedValueBetweenTwoNumber(){
        return Integer.compareUnsigned(xValue,yValue);
    }
    public Integer decodeTheString(){
        return Integer.decode(sIntegerValue);
    }
    public Integer divideUnsignedValue(){
        return Integer.divideUnsigned(number1Value,number2Value);
    }
    public Integer getIntegerValueBetweenStringValueAndIntegerValue(){
        return Integer.getInteger(dualStringValue,xValue);
    }
    public Integer getIntegerValueStringValue(){
        return Integer.getInteger(sIntegerValue);
    }
}
