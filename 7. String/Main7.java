
//String Functions

//1.equals 
//2.compareTo
//3.compareToIgnoreCase

public class Main7 {


    public static void main(String[] args) {

        testCompareTo();

        System.out.println();

        testCompareTo();

        System.out.println();

        testCompareToIgnoreCase();




     
        
    }



    public static void testEquals() {

        System.out.println("This is for equal function ");

        String s = "ram";
        String s2= "Ram";
        String s3 = "ram";

        String s4 = new String("ram");



        System.out.println(s.equals(s2));
        System.out.println(s.equals(s4));
        
    }


    
    public static void testCompareTo() {

        System.out.println("This is for compare to function ");

        String s = "ram";
        String s2= "Ram";
        String s3 = "ram";

        String s4 = new String("Ram");

        System.out.println(s.compareTo(s2));
        System.out.println(s.compareTo(s3));
        System.out.println(s.compareTo(s4));



        
    }
    

      
    public static void testCompareToIgnoreCase() {

        System.out.println("This is for Compare To Ignore Case function ");

        String s = "ram";
        String s2= "Ram";
        String s3 = "ram";

        String s4 = new String("Ram");



        System.out.println(s.compareToIgnoreCase(s2));
        System.out.println(s.compareToIgnoreCase(s4));



     
        
    }
}
