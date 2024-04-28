// 1.INPUT in array 
// 2. Arithmetic operations on Array 
import java.util.*;
public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sub[] = new int[3];    

        System.out.println("Enter marks of Physics");
        sub[0]= sc.nextInt();
        
        System.out.println("Enter marks of Chemistry");
        sub[1]= sc.nextInt();

        System.out.println("Enter marks of Maths");
        sub[2]= sc.nextInt();

        int Avg = (sub[0]+ sub[1]+ sub[2]) / 3;

        System.out.println("marks of Phy : "+ sub[0]);
        System.out.println("marks of Chem : "+ sub[1]);
        System.out.println("marks of MAth : "+ sub[2]);

        System.out.println("Average is: "+ Avg);

        System.out.println("The length of array is : "+ sub.length);


    }

    
}
