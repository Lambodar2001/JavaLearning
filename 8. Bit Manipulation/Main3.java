//BitManipulation Quetions
//Que 1 : Find Even/odd number

import java.util.*;
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number in decimal");
        int n = sc.nextInt();

        checkEvenOdd(n);
        
    }

    public static void checkEvenOdd(int n) {

        int bitMask= 1; //000001 in binary

        if((n & bitMask)==0){

            String s = Integer.toBinaryString(n);
            System.out.println("Number is \"Even\" " + '\n' + "The decimal number " + n + " in binary is :"+ s);

        }

        else{
            System.out.println("Number is \"odd\" ");
        }

        
    }
    
}
