package leetcode_mayChallenge;

public class FloodFill {

 public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
	     if(image[sr][sc]==newColor) {
	    	 return image;
	     } 
	    
	     fillimage(image,newColor,sr,sc,image[sr][sc]);
	    
	return image;
    }
 
 
    public static void fillimage(int [][]image,int newColor,int sr,int sc,int oldcolor){
    	
    	if(sr<0||sc<0|| sr>=image.length|| sc>=image[0].length 
    			|| oldcolor!=image[sr][sc] ) {
    		return;
    	}
    	image[sr][sc]=newColor;
    	fillimage(image,newColor,sr,sc-1,oldcolor);
    	fillimage(image,newColor,sr-1,sc,oldcolor);
    	fillimage(image,newColor,sr,sc+1,oldcolor);
    	fillimage(image,newColor,sr+1,sc,oldcolor);
     }
 
	public static void main(String[] args) {
		int[][] image= {{1,1,1},{1,1,0},{1,0,1}};
		int sr=1;
		int sc=1;
		int newColor=2;
		floodFill(image,sr,sc,newColor);
	}
}
