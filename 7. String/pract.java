public class pract{


    public static void main(String[] args) {



        String name = "nojoshdbhn";

        System.out.println(IsPalindrome(name));

        


     




        
    }


    public static boolean IsPalindrome(String name) {


        for(int i =0; i < name.length()/2;i++){

           if(name.charAt(i)!=name.charAt(name.length()-1-i)){

            return false;

           }
        }



        return true;


        
    }
}