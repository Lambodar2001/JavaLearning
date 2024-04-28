
//Combination of 10 and 11


 public class Main12 {

    public static void main(String[] args) {

        int arr[]={0,1,2,3,4};
        subarray(arr);
        
    }

    public static void subarray(int arr[]){

        int currSum= 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length ; i ++ ){

            int curr= i;
            for(int j = i ; j < arr.length ; j++){
                currSum=0;

                int end = j;

                for(int k=i; k <= j; k++){
                    System.out.print(arr[k] + " ");

                    currSum+=arr[k];

                }
                System.out.println();
                // System.out.println("currSum :" + currSum );

                if(maxSum< currSum){
                    maxSum= currSum;
                }
              


                



            

            }

            
            
           
        }
        
        System.err.println("Max Sum is :"+ maxSum);
        

    }
    
}




