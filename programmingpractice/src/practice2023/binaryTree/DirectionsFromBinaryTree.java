package programmingpractice.src.practice2023.binaryTree;

public class DirectionsFromBinaryTree {

    public String getDirections(TreeNode root, int startValue, int destValue) {

        StringBuilder sr = new StringBuilder();
        StringBuilder er = new StringBuilder();

        getDirectionsUtil(root , startValue , sr);
        getDirectionsUtil(root , destValue , er);

        int i= sr.length();
        int j= er.length();

        int cnt =0;
        while (i>0 && j>0 && sr.charAt(i-1) == er.charAt(j-1)){
            cnt++;
            i--;
            j--;
        }

        String sPath = "U".repeat(sr.length()-cnt);
        String ePath = er.reverse().toString().substring(cnt , er.length());

return  sPath + ePath;
    }

    private boolean getDirectionsUtil(TreeNode root, int value, StringBuilder sr) {
    if(root == null){
        return  false;
    }
    if(root.val == value){
        return  true;
    }
    if(getDirectionsUtil(root.left , value,sr))
         sr.append("L");
    else if(getDirectionsUtil(root.right , value,sr))
              sr.append("R");
     return sr.length()>0;
    }

    public static void main(String[] args) {

    }
}
