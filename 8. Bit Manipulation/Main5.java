//BitManipulation Quetions
//Que 2.1 : Get i th bit 


public class Main5{
    public static void main(String[] args) {
        
        System.out.println(GetIthBit(4, 1));
        
    }


    public static int GetIthBit(int bit , int i ) {

        int bitMask= 1<<i;

        return bit | bitMask;


        
    }
}