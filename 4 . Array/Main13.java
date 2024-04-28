//Max Sum subarray

// 2. prefix method 

// Time complexity is o(n^2)







public class Main13{
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};
        // int arr[] = {2, 4, -5, 6, -6, 10};
        MaxSumsubarray(arr);


    }

    public static void MaxSumsubarray(int arr[]) {


        int currSum= 0;
        int maxsum= 0;

        // calculating prefix array 

        int prefixArr[] = new int[arr.length];

        prefixArr[0] = arr[0];

        for(int i = 1; i < arr.length ; i ++){

            prefixArr[i] = arr[i] + prefixArr[i-1];
        }

        //calculating start  &  end of prefix array 

        for(int i = 0 ; i < prefixArr.length; i++){

            int start = i;


            for(int j =i ; j < prefixArr.length ; j++){

                int end = j;

                //calculating prefix sum using formula 
                currSum = start ==0? currSum= prefixArr[end] : prefixArr[end] - prefixArr[start-1];

                System.out.println("currSUm is "+ currSum);

                if(currSum>maxsum){
                    maxsum = currSum;
                }

            

            }

        }

        System.out.println("max Sum is : " + maxsum);




        
    }
}