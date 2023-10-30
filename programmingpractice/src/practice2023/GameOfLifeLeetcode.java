package programmingpractice.src.practice2023;

public class GameOfLifeLeetcode {

    public void gameOfLife(int[][] board) {
      int row = board.length;
      int column = board[0].length;
int [][]temp = new int[row][column];
      for(int i = 0;i<row;i++){
          for(int j=0; j< column;j++){
              int neighbourSum = neighbour(board , i-1 , j-1) + neighbour(board , i-1 , j) + neighbour(board , i-1 , j+1)
              + neighbour(board , i , j+1) + neighbour(board , i+1 , j+1) + neighbour(board , i+1 , j) + neighbour(board , i+1 , j-1)
              + neighbour(board , i , j-1);
              if(board[i][j] == 1){
                  temp[i][j] = (neighbourSum < 2 || neighbourSum >3) ?0 : 1;
              }else{
                  temp[i][j] = (neighbourSum == 3) ?1 : 0;
              }
          }


      }

        for(int i = 0 ;i< row ;i++){
            board[i] = temp[i].clone();
        }


    }

    private int neighbour(int[][] board, int i, int j) {
     if(i < 0 || i>= board.length || j<0 || j >=board[0].length || board[i][j] == 0){
         return 0;
     }
   return 1;
    }


    public static void main(String[] args) {
       GameOfLifeLeetcode gl = new GameOfLifeLeetcode();
        int [][]board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gl.gameOfLife(board);
    }
}
