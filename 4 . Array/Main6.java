//Find largest and smallest from the array 
import java.util.*;

public class Main6 {

    public static void main(String[] args) {
        
        int arr[]= {10, 30 ,85 , 93 , 75 , 52 , 74 ,23};

        
        System.out.println( findLargest(arr));
        System.out.println( findSmallest(arr));
    }
    
    public static int findLargest(int arr[] ){
        int largest = Integer.MIN_VALUE;

        for(int i =0 ; i < arr.length; i++){

            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.print("Largest number from array is :");
        return largest;

        
    }

     
    public static int findSmallest(int arr[] ){
        int smallest = Integer.MAX_VALUE;

        for(int i =0 ; i < arr.length; i++){

            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        System.out.print("smallest number from array is :");
        return smallest;

        
    }


}
