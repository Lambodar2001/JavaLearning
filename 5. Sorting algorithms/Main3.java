//Bubble sort2 : J loop start from 0


public class Main3{

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]) {

        for(int i = 0; i< arr.length -1; i++){

            for(int j = 0; j<arr.length-i-1; j++){

                if(arr[j]>arr[j+1]){

                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted array is :");
        for(int i =0;i< arr.length; i++){

            System.out.print(arr[i] + " ");
            
        }
        
    }


    
}
