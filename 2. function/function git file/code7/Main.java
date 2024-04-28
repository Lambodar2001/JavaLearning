/*
 
Optimized  code for find prime number 
to reduce the repeated i number 
Put End condition is find divisible(i) upto square root of num--- Math.sqrt(num);

 */


import java.lang.Math;

 public class Main {
     public static void main(String[] args) {
         System.out.println(isPrime(10));
     }
 
     public static boolean isPrime(int num) {

         
          for (int i = 2; i < Math.sqrt(num); i++) {
             if (num % i == 0) {
                 return false;
             }

         }

         return true;
         
       
     }
 }
 