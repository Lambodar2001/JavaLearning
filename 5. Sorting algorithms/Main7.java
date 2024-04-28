//Bubble sort: count total round/turn done by outer loop


public class Main7{

    public static void main(String[] args) {
        int arr[] = {5,2,9,3,4};

        System.out.println(bubbleSort(arr));
    }

    public static int bubbleSort(int arr[]) {
        int totalRoundsDoneByOuterLoop = 0;
        int n = arr.length;
    
        for (int i = 0; i < n - 1; i++) {
            int swap = 0;
    
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    ar r[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = 1;
                }
            }
    
            totalRoundsDoneByOuterLoop++;
    
            if (swap == 0) {
                break;
            }
        }
    
        return totalRoundsDoneByOuterLoop;
    }
    

    
}
