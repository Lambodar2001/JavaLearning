// trappin rain water


public class Main15 {
    

    public static void main(String[] args) {

        int height[] = { 4 ,2, 0 ,6, 3, 2, 5};
        
    }
    
    public static void trappedRainwater(int height[]) {

        //calculate right max boundary array 

        int rightMax[] ={height.length};

        rightMax[0]= height[0];
         
        for(int i = 1 ; i < height.length; i ++){

            rightMax[i]= Math.max(height[i], height[i-1]);

        }


        //calculate left max boundary array
        int leftmax[] ={height.length};
        leftmax[height.length-1] = height[height.length-1];

        int n= height.length;

        for(int i = n-2 ; i >=0 ; i -- ){

            leftmax[i] = Math.max(height[i],)


        }





        
    }

}
