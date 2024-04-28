
import java.util.*;
public class Main6 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


       do{

        System.out.println("Enter  starting index");
        int si= sc.nextInt();

        System.out.println("Enter  ending index");
        int ei= sc.nextInt();


        String  name = "HelloWorld";

        System.out.println(subString(name, si, ei));

       }while(true);



        

        
        
    }
    

    public static String subString(String name, int si , int  ei) {

        String substr= "";


        for(int i = si; i < ei ; i++){


            substr+= name.charAt(i);

            
        }
        

        return substr;
    }
}
