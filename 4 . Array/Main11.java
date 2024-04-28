
// Maximum sum  subarray

// 1.Brute Force 

// Time Complexity o(n^3)
 


/*
 
 1 2 3 4 

  subarrya  for 1 

  1     =1
  12    =3
  123   =6
  1234  =10

  after all possible subarrays sum 

  largest 10 




 likewise


 */

 public class Main11 {

    public static void main(String[] args) {

        int arr[]={2,4,6,8,10};
        
        MaxSumsubarray(arr);
        
    }

    public static void MaxSumsubarray(int arr[]){

        int currSum =0;
        int maxSum=Integer.MIN_VALUE;

        for(int i = 0; i < arr.length ; i ++ ){

            
            

            int curr= i;
            
            for(int j = i ; j < arr.length ; j++){
                currSum =0;
             
               

                int end = j;

                for(int k=i; k <= j; k++){
                    
                    System.out.print(arr[k] + " ");
                    currSum =currSum+arr[k];


                   
                }  
                System.out.println();
                
                System.out.println("currSum is :"+currSum);
               

                if(maxSum< currSum){
                    maxSum=currSum;
                }

               

                



            

            }

            
           
        }
        System.out.println("max sum is :"+ maxSum);
        
        

    }
    
}




