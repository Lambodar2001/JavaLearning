// Linear serach in array 
//finding index of entered the key 
import java.util.*;


public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int Arr[] = { 3, 5, 1, 4, 5, 0, 7, 8, 9, 17};
      
        for(int  i = 0; i< Arr.length; i++){

            System.out.print(Arr[i]+ " ");


        }
        System.out.println(" ");


        //above for the user display 

        System.out.println("Enter the key to findout index of that key in above Displayed array");
        int key = sc.nextInt();

        //user to enter the key value

        int result =linearSearch(Arr, key);

        //calling function 

        if(result==-1){
            System.out.println("Key not found.. Enter Valid one!!!");
        }
        else{
            System.out.println("Index of key is :"+ result);
        }

        //condtions for result 
    }


    // Main code block end 





    public static int linearSearch(int arr[] , int key){

        for(int i =0 ; i < arr.length; i++){

            if(arr[i]==key){
                return i;
            }
        }
        //checking and comparing the every index of array with  the key

        return -1;
    }

    //Linear serach function block end 
    
}

