/*
 



A
BC
DEF
GHIJ
KLMNO


 */










    // public static void test(){
    //     char ch = 'A';
    //     for(int i = 1; i<=30;i++){
    //         System.out.print(ch);
    //         ch++;
    //     }
    // }
    
    
public class Main{
    public static void main(String[] args) {
        charPyramid(5);
        
    }

    public static void charPyramid(int totalRow){

        char ch= 'A';

        for(int i = 1; i<=totalRow; i++){
            for(int j = 1 ; j<=i;j++){
                System.out.print(ch);
                ch++;
            }

            System.err.println();

        }

      
    }
}