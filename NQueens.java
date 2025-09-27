import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
class NQueens {

    static boolean isSafe(char[][] board, int row,int col){
        //for same row
        for(int i=0;i<board[0].length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }

        //for same column
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //upper left
        for(int r=row,c=col; r>=0 && c>=0;r--, c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //upper right
        for(int r=row,c=col; r>=0 && c<board[0].length;r--, c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower left
        for(int r=row,c=col; r<board.length && c>=0;r++, c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower right
        for(int r=row,c=col; r<board.length && c<board[0].length;r++, c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;
    }

    static void saveBoard(List<List<String>> allboards, char[][] board){

        List<String> newBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row="";
            for(int j=0;j<board[0].length;j++){
               if(board[i][j]=='Q'){
                   row+='Q';
               }
               else {
                   row+='.';
               }
            }
            newBoard.add(row);
        }
        allboards.add(newBoard);
    }

    static void helper(List<List<String>> allboards, char[][] board, int col) {

        if (col == board[0].length) {
            saveBoard(allboards, board);
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (isSafe(board,row,col)) {
                board[row][col] = 'Q';
                helper(allboards, board, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static void main(String args[]) {
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[4][4];
        helper(allboards,board, 0 );
        System.out.println(allboards);

    }
}