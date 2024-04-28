import java.util.*;

public class pract {


    

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int arr[][] = new int[3][3];

        int row= arr.length;
        int col = arr[3].length;



        

        


        System.out.println("fill the 2D array");


        for(int i=0; i<row ; i ++){
            for(int j =0; j<col; j++){

               arr[i][j]= sc.nextInt();

            }
            System.out.println();
        }






        for(int i=0; i<row ; i ++){
            for(int j =0; j<col; j++){

                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
    }
    
}
