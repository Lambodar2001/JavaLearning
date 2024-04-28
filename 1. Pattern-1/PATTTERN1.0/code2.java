//Iverted trangle star patter

/*

 ****
 ***
 **
 *

 */


public class code2 {
    
    public static void main(String[] args) {

        int n =4;

        //logic 1

        // for(int i =1; i<= 4; i ++){

        //     for(int j =1; j <=n-i+1;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        //logic 2

         for(int i =4; i>=1; i --){

            for(int j =1; j <=i ;j++){
                System.out.print("*");
            }

            System.out.println();
        }




    }
}
