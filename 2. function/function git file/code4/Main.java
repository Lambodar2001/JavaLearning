//code for binomial Distribution 
//nCr = n!/r!(n-r)!

public class Main{
    public static void main(String[] args) {

        System.out.println(binoDist(10, 5));
        


    }


    public static int binoDist(int n , int r){
        int bd=  (fact(n)/(fact(r)*fact(n-r)));

        return bd;

    }


    public static int fact(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact= i* fact;
        }

        return fact;
    }
}