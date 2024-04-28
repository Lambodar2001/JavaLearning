//String basics 

/*
 
1. Stirng defination/Declaration
2. I/O in string
3. Stirng length
4. String concanation

 */


import java.util.*;

public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1. Stirng defination/Declaration

        
        String name = "Ram";
        String name2 = new String("Krishna");


        // 2. I/O in string


        System.out.println("input for a");
        String a = sc.next();
        System.out.println("input for a is : "+a);
        

        sc.nextLine();
        System.out.println();
        
        System.out.println("input for b");
        String b = sc.nextLine();
        System.out.println("input for b is : "+ b);

        System.out.println();


        // 3. Stirng length


        System.err.println("String length of string "+ a + " is "+ a.length());
        System.out.println();




        // 4. String concanation

    
        System.out.println("The value of  string in name is " + "*"+ name +  "*"+ " ane the String in name2 is "+  "*"+ name2 + "*");










        









        
    }


    
}