//Bubble sort: Decending order 9,5,4,3,2 

//change if condition and swap condition


public class Main6{

    public static void main(String[] args) {
        int arr[] = {5,2,9,3,4};

        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]) {

        int swap=0;

        for(int i = 0; i< arr.length -1; i++){

            for(int j = 0; j<arr.length-i-1; j++){

                if(arr[j]<arr[j+1]){

                    swap=1;

                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;


                }
            }

            if(swap==0){
                break;
            }
        }
        
        System.out.println("Sorted array is :");
        for(int i =0;i< arr.length; i++){

            System.out.print(arr[i] + " ");
            
        }
        
    }


    
}
