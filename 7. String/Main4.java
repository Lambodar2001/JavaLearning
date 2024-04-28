//String Operations: 1.Shortest Path


public class Main4{


    public static void main(String[] args) {
        
        String path= "SSSSSSWWWWWW";

        // String path= "WNEENESENNN";


        System.out.println(findShortestPath(path));

    }


    public static int findShortestPath(String path) {
        
        int x =0, y =0;


        for(int i =0; i < path.length(); i++){

            char dir = path.charAt(i);

            if(dir=='N'){

                y++;
            }

            else if(dir=='S'){

                y--;
            }

            else if(dir=='W'){

                x--;
            }

            else{
                x++;
            }





        }


        int x2= x*x;
        int y2 = y*y;


        int formula = (int)Math.sqrt(x2+y2);


        // return (int)Math.sqrt(x2+y2);

        // return formula;

        
        if (y < 0 || x < 0) {
            return -formula; // If x,y is negative, return negative distance
        } else {
            return formula;
        }


    }
}