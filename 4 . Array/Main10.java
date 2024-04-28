
//Possibles subarray  

/*
 
 1 2 3 4 

  subarrya  for 1 

  1 
  12 
  123
  1234

  for 2


  2
  23
  234


 likewise


 */

 public class Main10 {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        subarray(arr);
        
    }

    public static void subarray(int arr[]){

        for(int i = 0; i < arr.length ; i ++ ){

            int curr= i;
            for(int j = i ; j < arr.length ; j++){

                int end = j;

                for(int k=i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();

            }
            
           
        }

    }
    
}




