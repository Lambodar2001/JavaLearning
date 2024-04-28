// Optimized way for input and output in array



public class Main3 {

   

 public static void main(String[] args) {
    
            int[] myArray = new int[5]; // declare and initialize an integer array of size 5
     



            for(int i=0 ; i < myArray.length ; i ++){

                myArray[i] = i + 1;
                System.out.println("Index at " + i + " is "+   myArray[i]);


            }

            /*
            for  "myArray[i] = i + 1; "  this condtions

            myArray[i]= i+1
            --->
            for 0 
            
            myArray[0]= 0+1;
            myArray[1]= 1+1;
            myArray[2]= 2+1;

/////////////////////////////////////////////////////////////////////

            for  "myArray[i] = myArray[i] + 1; " 
            
           * case1: when PreArray not declared with elements

            at 0 index no elements declare so

            myArray[0] = myArray[0] + 1
            myArray[0] = 0+1

            at index 1

            myArray[1] = myArray[1] + 1
            myArray[i] = 0+1

            at index 2 

            myArray[2] = myArray[2] + 1
            myArray[2] = 0+1

            
            for  "myArray[i] = myArray[i] + 1; " 
            
            case1: when PreArray  declared with elements
            
            int marksArray[] = { 98, 99 ,97};

            at 0 index 98 elements declare so

            myArray[0] = myArray[0] + 1
            myArray[0] = 98+1

            at index 1 

            myArray[1] = myArray[1] + 1
            myArray[1] = 99+1

            at index 2

            myArray[1] = myArray[2] + 1
            myArray[1] = 97+1






            
             


             */

         









    


    
    
        }
}
