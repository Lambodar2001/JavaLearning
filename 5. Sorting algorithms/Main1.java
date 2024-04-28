// write the code for make array from user inpiut elements and N is this size of array also get input from the user
import java.util.*;
public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array Sizde");
        int arraySize =sc.nextInt();



        int arr[]= new int[arraySize];


        System.out.println("Enter the elements of array");
        for(int i =0; i < arr.length;i++){

            arr[i] = sc.nextInt();
        }
        
        System.out.println("Your array is : ");
        for(int j = 0; j< arr.length; j++){
            System.out.print(arr[j]+ " ");
        }


        
    }

    // public static void makeArray(int arr[]){




    // }
}