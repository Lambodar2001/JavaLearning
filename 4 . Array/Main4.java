// Array as function arguments 
// Array in java functions 

public class Main4 {


    public static void main(String[] args) {

        int marksArray[] = { 98, 99 ,97};

        update(marksArray);

        
    }
    
    public static void update(int marksArray[]){
        for(int i = 0; i < marksArray.length; i++){
            marksArray[i]=  marksArray[i] + 1;
            marksArray[i]=    i + 1;


            System.out.println("The updated marks for sub No: "+ i  + "is " +     marksArray[i]);
        }


    }
}
