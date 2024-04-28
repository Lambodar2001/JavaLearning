//2D array Defination , Declaration and Print


public class Main1{

    public static void main(String[] args) {


        int arr[][] = {

            {1,2,3,8},
            {4,5,6,0},
            {7,8,9,9}

        };


        int row=3 , col =4;

        for(int i = 0 ; i<row ; i++){

            for(int j = 0; j< col; j++){

                System.out.print(arr[i][j]  + " ");
            }

            System.out.println();
        }



        System.out.println("lenghth is :");

        System.out.println(arr[0].length);
 

        
    }
}