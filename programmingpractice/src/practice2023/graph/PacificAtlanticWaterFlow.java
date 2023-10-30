package programmingpractice.src.practice2023.graph;

import programmingpractice.src.practice2023.linkedList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {


    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int rowHeight = heights.length;
        int columnHeight = heights[0].length;
        boolean [][]pac = new boolean[rowHeight][columnHeight];
        boolean [][]atl = new boolean[rowHeight][columnHeight];

        for (int col=0;col<columnHeight;col++){
            dfs(0 , col ,rowHeight , columnHeight , pac , heights[0][col] , heights);
            dfs(rowHeight-1 , col , rowHeight , columnHeight , atl  ,heights[rowHeight-1][col] , heights);
        }

        for (int row = 0; row <rowHeight;row++){
            dfs(row , 0 , rowHeight , columnHeight , pac, heights[row][0] , heights );
            dfs(row , columnHeight-1 , rowHeight , columnHeight , atl, heights[row][columnHeight-1] , heights );
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i=0;i<rowHeight ;i++){
            for (int j=0;j<columnHeight;j++){
                if (pac[i][j] && atl[i][j]){
                    list.add(Arrays.asList(i , j));
                }
            }
        }
        return  list;
    }

    private void dfs(int row, int col, int rowHeight, int columnHeight, boolean[][] visited, int prevHeight, int[][] heights) {

   if(row < 0 || row >=rowHeight || col < 0 || col >=columnHeight || visited[row][col] || prevHeight > heights[row][col]){
       return;
   }

   visited[row][col] = true;

        dfs(row+1 , col , rowHeight , columnHeight , visited, heights[row][col] , heights );
        dfs(row-1 , col , rowHeight , columnHeight , visited, heights[row][col] , heights );
        dfs(row , col+1 , rowHeight , columnHeight , visited, heights[row][col] , heights );
        dfs(row , col-1 , rowHeight , columnHeight , visited, heights[row][col] , heights );

    }

    public static void main(String[] args) {
       int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},
               {2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
       PacificAtlanticWaterFlow pacificAtlanticWaterFlow = new PacificAtlanticWaterFlow();
       pacificAtlanticWaterFlow.pacificAtlantic(heights);
    }
}
