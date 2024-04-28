public class Main8 {

    public static void main(String[] args) {

        String fruits[]= {"apple", "mango", "banana"};
        largestString(fruits);
        
    }

    
    public static void largestString(String[] fruits) {

        String largeststr = fruits[0];

        for(int i = 1; i < fruits.length; i++){ // Start from index 1 since we already have fruits[0]

            if(largeststr.compareTo(fruits[i]) < 0){

                largeststr = fruits[i]; // Update largeststr with the current largest string

            }
        }

        System.out.print("Largest string: " + largeststr);
        
    }
    
}
