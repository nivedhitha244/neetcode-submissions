class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                    if(check(board,word,0,i,j)){
                        return true;
                    }
                }
            }
            return false;
    }
    public boolean check(char[][] board,String word,int i,int row,int col){
            if(i==word.length()) return true;
            if(row<0 || row>=board.length || col<0 || col>=board[0].length){
                return false;
            }
            if(board[row][col]!=word.charAt(i) || board[row][col]=='#'){
                return false;
            }
            char ch=board[row][col];
            board[row][col]='#';
            
            boolean found=check(board,word,i+1,row+1,col) ||
            check(board,word,i+1,row-1,col) ||
            check(board,word,i+1,row,col+1) ||
            check(board,word,i+1,row,col-1); 
            board[row][col]=ch;
            return found;
        }
    }
