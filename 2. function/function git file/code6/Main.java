//finding prime number
//concept is prime is that no only dived by 1 and itself

// boolean , track isPrime  , change t/f is condition get satisfy and return variable not 


/*

The boolean variable isPrime is initialized to false, which means that it will always be false regardless of the input number. The for loop checks if the input number is divisible by any number within the range from 2 to num-1 and sets the isPrime variable to false if the condition is met, otherwise it sets it to true. However, the isPrime variable should be initialized to true before the for loop starts, and the loop should break out as soon as the input number is found to be divisible by any number within the range.

To fix your code, you need to make the following changes:

Initialize the isPrime variable to true.
Add a break statement in the if block that sets isPrime to false.
Move the else block outside of the loop since it's unnecessary to check it for each iteration.

 */



 public class Main {
     public static void main(String[] args) {
         isPrime(10);
     }
 
     public static void isPrime(int num) {
         boolean isPrime = true;
 
         for (int i = 2; i < num; i++) {
             if (num % i == 0) {
                 isPrime = false;
                 break;
             }
         }
         
         if (isPrime) {
             System.out.println(num + " is prime");
         } else {
             System.out.println(num + " is not prime");
         }
     }
 }



 /*
  
 class Solution{
    static int isPrime(int N){
        // code here
        
        if(N<=1){
            
            return 0;
        }
        
        if(N==2){
            return 1;
        }
        
        for(int i = 2; i <= Math.sqrt(N) ; i++){
            
            if(N%i==0){
                return 0;
            }
        }
        
        return 1;
    }
}
  */
 