//Bubble sort: Optimized 


public class Main5{

    public static void main(String[] args) {
        int arr[] = {5,2,9,3,4};

        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]) {

        int swap=0;

        for(int i = 0; i< arr.length -1; i++){

            for(int j = 0; j<arr.length-i-1; j++){

                if(arr[j]>arr[j+1]){

                    swap=1;

                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;


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
