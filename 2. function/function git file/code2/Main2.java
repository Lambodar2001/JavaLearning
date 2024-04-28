//method of multiplay two number where argument is
//given by user 

import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A ");
        int a=sc.nextInt();

        System.out.println("Enter A ");
        int b=sc.nextInt();

        System.out.println(multiplayIs(a, b));


        
    }

    public static int  multiplayIs(int a , int b){
        return a* b;
    }

}