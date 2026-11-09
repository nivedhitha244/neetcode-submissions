class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] mat=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]='.';
            }
        }
        go(mat,0,res);
        return res;
    }
    public void go(char[][] mat,int row,List<List<String>> res){
        if(row==mat.length){
            List<String> list=new ArrayList<>();
            for(int i=0;i<mat.length;i++){
                list.add(new String(mat[i]));
            }
            res.add(list);
        }
        for(int i=0;i<mat[0].length;i++){
            if(check(mat,row,i)){
                mat[row][i]='Q';
                go(mat,row+1,res);
                mat[row][i]='.';
            }
        }
    }
    public boolean check(char[][] mat,int r,int c){
        for(int i=0;i<r;i++){
            if(mat[i][c]=='Q'){
                return false;
            }
        }
        for(int i=1;i<=r;i++){
            if(r-i>=0 && c-i>=0){
                if(mat[r-i][c-i]=='Q'){
                    return false;
                }
            }
        }
        for(int i=1;i<=r;i++){
            if(r-i>=0 && c+i<mat[0].length){
                if(mat[r-i][c+i]=='Q'){
                    return false;
                }
            }
        }
        return true;
    }
}
