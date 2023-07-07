public class TwoDimensionalArrayPatternTwo {
    public static void main(String args[]){
        char [][] array = new char[5][5];
        int middle=5/2;
        for( int outerloop=0; outerloop<array.length;outerloop++){
            for(int innerloop=0;innerloop<5;innerloop++){
                if(outerloop==0)
                    array[0][2] = '*';
                    array[1][1] = '*';
                array[1][3] = '*';
                array[2][0] = '*';
                array[2][4] = '*';
                array[3][1] = '*';
                array[3][3] = '*';
                array[4][2] = '*';
                System.out.print(array[outerloop][innerloop] + " ");
            }
            System.out.println();
        }

    }
}



