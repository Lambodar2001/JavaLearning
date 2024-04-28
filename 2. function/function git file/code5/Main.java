/*
 * Function overloading 
 * we can write same name mwthod
 * but have to change to two attributes 
 * 1. change data types of parameter 
 * 2. change the number of parameter( if you dont  want same data types )
 */




//overloading of method using data types
public class Main {


    public static void main(String[] args) {

       System.out.println("Ths sum of two parameters with int  data type of method name sumIs: "+sumIs(10,5));
       System.out.println("Ths sum of two parameters with float data type of method name sumIs: "+sumIs(10,5.5f));
       System.out.println("Ths sum of three parameters with int  data type of method name sumIs: "+sumIs(10,5,85));
    }

    public static int sumIs(int a, int b){
        return a+ b;
    }

    public static float sumIs(float  a, float b){
        return a+b;

    }

        // overloading using no of parameters of same data types of another method

    public static int sumIs(int a , int  b , int c){
        return a+ b +c;
    }
        

    }


    //overloading of method using data types


    



