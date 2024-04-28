 /*
  Continue Number half pyramid

  1
  12
  123
  1234

  */
 
 public class code4{

    public static void main(String args[]){

        int n= 4;
        int s= 1;


        for(int i =1; i <= n ; i ++){

            

            for(int j = 1; j <=i ; j ++){

                System.out.print(s);

                s++;
            }

            System.out.println();

        }


    



    }

 }

