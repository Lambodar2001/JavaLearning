//String Operations: 1.Palindrome

import  java.util.*;
public class Main3 {


    public static void main(String[] args) {

        
        
        String name="madam";
        String name1="noon";
        String name2="racecar";

        System.out.println(isPalendrome(name2));


       
         
    }

    public static Boolean isPalendrome(String name){

        for(int i = 0; i < name.length(); i++){
            
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){

                return false;
            

            }
        }


        return true;
    }
    
}


