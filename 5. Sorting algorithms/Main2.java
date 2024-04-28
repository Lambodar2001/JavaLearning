//function making array  of user input elements

import java.util.*;
public class Main2{
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter size of an array");
        int sizOfArray = sc.nextInt();
        int arr[] = new int[sizOfArray];

        getarray(arr);

        
        
    }

    public static void getarray(int arr[] ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements in array");

        for(int i =0; i<arr.length ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("You array with user input element is : ");

        for(int i =0; i<arr.length ; i++){

            System.out.print( arr[i] + " ");
        }

        




    }
}