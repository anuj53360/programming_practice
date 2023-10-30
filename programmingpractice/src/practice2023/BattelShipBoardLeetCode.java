package programmingpractice.src.practice2023;

public class BattelShipBoardLeetCode {


    public int countBattleships(char[][] board) {

        if (board == null || board.length == 0 || board[0].length == 0){
            return 0;
        }

        int rows = board.length;
        int column = board[0].length;
        int count =0;

        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                if (board[i][j] == 'X' && (j == column-1 || board[i][j+1] == '.') &&
                        (j == column-1 || board[i][j+1] == '.')
                ){
                    count++;
                }
            }
        }

        return  count;
    }

    public static void main(String[] args) {
    BattelShipBoardLeetCode bs = new BattelShipBoardLeetCode();
      char [][]charArray = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
      bs.countBattleships(charArray);
    }
}
