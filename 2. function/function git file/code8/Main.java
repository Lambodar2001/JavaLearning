//find all prime number given range 

import java.lang.Math;
import java.util.*;

 public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the lower lim");
        int lowerRange = sc.nextInt();

        System.out.println("Enter highr lim");
        int higherRange = sc.nextInt();
        
        findAllPrimeFromRange(lowerRange, higherRange);

         

     } //main method



 
    public static boolean isPrime(int num) {

         
          for (int i = 2; i < Math.sqrt(num); i++) {
             if (num % i == 0) {
                 return false;
             }

         }

         return true;

         
       
     } // prime number finding method



     public static void  findAllPrimeFromRange( int lowerRange , int higherRange){

        

        for(int i= lowerRange ; i <= higherRange; i++){

          
            if(isPrime(i)){

               
              
                System.out.print(i);
                System.out.print(" ");

            }
        }
        
       
 

     }


 }
 