/*
 



1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910



 */





public class Main{
    
    public static void main(String[] args) {

        pyraMid(10);
        
    }


    public static void pyraMid(int row){

        for(int i =1 ; i <= row; i++ ){

            for(int j = 1; j<=i; j ++){
                System.out.print(j);

            }
            System.out.println();
        }



    }

 }

