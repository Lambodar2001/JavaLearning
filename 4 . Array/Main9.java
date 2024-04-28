//Possibles pairs in array 

/*
 
 1 2 3 4 

 (1 2 ) ( 1 3 ) (1 4)

 likewise


 */

 public class Main9 {

    public static void main(String[] args) {

        int arr[]={40,62,47,94,57};
        pairs(arr);
        
    }

    public static void pairs(int arr[]){
        int tp = 0;

        for(int i = 0; i < arr.length ; i ++ ){

            int curr= arr[i];
            for(int j = i+1 ; j < arr.length ; j++){

                System.out.print("arr [" + curr+ "," +arr[j] + "] ");

               tp++;


            }
            System.out.println();

        }

        System.out.println("Total pairs are :" + tp);
        

    }
    
}



