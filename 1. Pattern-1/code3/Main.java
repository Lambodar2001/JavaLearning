/*
 
Inverted Half pyramid 


******
*****
***
**
*

 */

 public class Main{
    public static void main(String[] args) {

        pyraMid(10);
        
    }


    public static void pyraMid(int row){

        for(int i =1 ; i <= row; i++ ){

            for(int j = 1; j<=(row-i+1); j ++){
                System.out.print("*");

            }
            System.out.println();
        }



    }

 }

