

// 3 . Kadans algorithm

// time complexity  o(n)

public class Main14{

   public static void main(String[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    KadansAlgo(arr);

   }
    
    
    public static void KadansAlgo(int arr[]) {

        int cs = 0;
        //int ms = Integer.MIN_VALU`1oE;

         for (int i = 0 ; i < arr.length; i++){

            cs= cs+ arr[i];

            if(cs<0){
                cs=0;
            }

            ms= Math.max(ms, cs);

            
         }

         System.err.println(ms);
    
    
    
    
    }
}
    

