//Intro to nested loops (loops under loops - for , while , do while) 

/*

 *Strategy

 1.Outerloop= depends on number of lines 
 2. Inner loops = depends on how much and which style star printed in that line 
 3. what to print . ex: star "*"


 print : 

 * 
 **
 ***
 ****

 */

 public class code1{

    public static void main(String args[]){


        for(int i = 1; i <=4; i++){

            for(int j = 1; j <=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }


    }

 }


