//binary to decimal 

// formmula dec = dec + LastDigi * 2^0 to n

import java.util.*;

public class Main{
    public static void main(String[] args) {
        binToDec(101);

        
    }

    public static void binToDec(int binNum) {

        int myNo= binNum;

        int pow = 0;
        int decNum = 0;

        while(binNum>0){

            int lastDig = binNum % 10;

            decNum= decNum + (lastDig * (int)Math.pow(2, pow));

            pow++;
            binNum=binNum/10;
        }

        System.err.println("The decimal Number of the binary number "+ myNo + " is "+ decNum);
        
    }
}