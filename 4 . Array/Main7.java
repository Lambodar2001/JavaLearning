//Binary serach algorithm 
//finding the index of the number present in the array 

public class Main7{
    public static void main(String[] args) {

        int arr[]={10,20, 30 ,40 , 50 , 60 , 70 , 80 , 90 , 100};
        //sorted array 

        int key = 30;

       System.out.println( binarySearch(arr, key));
}

public static int binarySearch(int arr[] , int key ) {

    int start =0;
   
    int end = arr.length-1; //is same as i< arr.length 
    

    while(start<=end){
        int mid = ((start+end)/2);
        

        //compare the value of index mid with key 

        if(arr[mid]==key){
            return mid;
        }

        else if(arr[mid]>key ){
            end=mid-1;
        }
        else{
            start=mid+1;
        }



    }


return -1;
    
}

}