//find factorial 

public class Main{
    public static void main(String[] args) {

        System.out.println(findFactorial(3));

        
    }
    
    public static int findFactorial(int num){


        int fact=1;

        for(int i=1; i<=num;i++){

            fact = i* fact ;

           
           
        }
        return fact ;

    }

}



