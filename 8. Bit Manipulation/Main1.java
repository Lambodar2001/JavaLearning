//Binary AND 
//Binary OR 
//Binary XOR 
//1's compliment
//Integer.toBinaryString();
//binary left shift
//binary right shift

public class Main1{

    public static void main(String[] args) {
        
        System.out.println("This is binary AND");
        System.out.println(5&6);

        System.out.println("This is binary OR");
        System.out.println(5|6);

        System.out.println("This is binary XOR");
        System.out.println(5^6);

        System.out.println("This is 1's Compliment or Not of 5");
        System.out.println(~5);

        System.out.println("This is binary Left shift");
        System.out.println(5<<2);

        System.out.println("This is binary Right shift");
        System.out.println(6>>1);


        System.out.println();

        ClassForCheck obj = new ClassForCheck();
        obj.number=5;
        obj.check();

        obj.number=6;
        obj.check();
       
        
        
    }
}


class ClassForCheck{


    int number ;

    public void check(){

        String s1 = Integer.toBinaryString(number);
        System.out.println(s1);
    }
}