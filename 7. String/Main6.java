//String Function - substring [str.substring(0,6)]



//imp points 
//1.string load, append  can be done as  substr+= name.charAt(i);
//2.method take any types of data parameters but retutn data type data of what data type method declared
//3. end index excluded in substring so keep it mind 

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


            substr+= name.charAt(i); //important

            
        }
        

        return substr;
    }


    // public static void test() {

    //     System.out.println("This is test method");

    //     String name2 = "HelloWorld";

    //     System.out.println(name2.substring(0,10));



        
    // }
}
