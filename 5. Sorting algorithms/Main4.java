//Bubble sort2 : J loop start from 1


public class Main4{

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]) {

        for(int i = 0; i< arr.length -1; i++){

            for(int j = 1; j<arr.length-i; j++){

                if(arr[j-1]>arr[j]){

                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array is :");
        for(int i =0;i< arr.length; i++){

            System.out.print(arr[i] + " ");
            
        }
        
    }


    
}
