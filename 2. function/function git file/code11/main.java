//Assignment 

//1. write method for average of three number
//2. write method to check even number


import java.util.*;


public class main {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        do{

            System.out.println("Enter the number to check even");
            int number = sc.nextInt();
            System.out.println(isEven(number));



        }while(true);


        


        

    }

    public static boolean isEven(int number){

        boolean isEven = true;

        if(number%2 ==0){
            return isEven;
        }


        return false;
    }
}
