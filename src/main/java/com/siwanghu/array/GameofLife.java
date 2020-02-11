package com.siwanghu.array;

public class GameofLife {
    public int[][] gameofLife(int[][] board){
        if(board==null || board.length==0)
            return board;
        int[][] result=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int life=0;
                for(int m=i-1;m<=i+1;m++){
                    for(int n=j-1;n<=j+1;n++){
                        if(m>=0 && m<board.length && n>=0 && n<board[0].length){
                            if(m!=i || n!=j)
                                if(board[m][n]==1)
                                    life++;
                        }
                    }
                }
                if(life<2)
                    result[i][j]=0;
                else if(life>3)
                    result[i][j]=0;
                else if(life==2){
                    if(board[i][j]==1)
                        result[i][j]=1;
                    else
                        result[i][j]=0;
                }else{
                    result[i][j]=1;
                }
            }
        }
        return result;
    }
}
