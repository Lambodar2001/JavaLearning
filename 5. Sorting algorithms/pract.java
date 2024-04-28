public class pract{
   
   public static void main(String[] args) {



      int arr[] = {12,34,33,56,75,84,97};

      bs(arr);

      
      for(int i= 0; i< arr.length; i++){

         System.out.print(arr[i] + " ");
      }
      
   }

   public static void bs(int arr[]) {


      for(int i = 0; i < arr.length-1; i ++){

         for(int j =i+1; j<arr.length-1; j++){


            if(arr[j]<arr[j+1]){


               int temp=arr[j+1];

               arr[j+1]= arr[j];

               arr[j]=temp;




            }
         }
      }
      
   }


}


