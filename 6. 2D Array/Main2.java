//Learn to declaration of 2D array by user input and optimization of loop

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int arr[][] = new int[3][4];


        //row col claculated


        int row = arr.length;
        int col = arr[1].length;

        System.out.println(row + ", "+ col);



        for(int i = 0; i < row; i++){

            for(int j = 0; j< col;j++){

                arr[i][j] = sc.nextInt();
            }
        }



        

        for(int i = 0; i < row; i++){

            for(int j = 0; j< col;j++){

                System.out.print(arr[i][j]+ " ");



            }

            System.out.println();
        }


        
        
    }
    
}
