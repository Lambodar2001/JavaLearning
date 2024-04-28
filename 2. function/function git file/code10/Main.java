//method scope and block scope

public class Main {

    public static void main(String[] args) {

        
    }

    public static void methodScope(int n) {

        int a=100;

        {
            System.out.println(a);


            {
                System.out.println(a);
            }
        }
        
    }

    public static int blockScope() {

    
        {
            int  s= 10;

            System.out.println(s);
        }

        System.out.println(s);




        
    }




    
}
