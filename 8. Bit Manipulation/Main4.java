//BitManipulation Quetions
//Que 2.1 : Get i th bit 


public class Main4{
    public static void main(String[] args) {
        
        System.out.println(GetIthBit(4, 2));
        
    }


    public static int GetIthBit(int bit , int i ) {

        int bitMask= 1<<i;

        if((bit & bitMask)==0){

            return 0;


        }
        else{
            return 1;
        }

        
    }
}