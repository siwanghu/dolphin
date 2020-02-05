package com.siwanghu;

import java.util.Arrays;

public class SetMatrixZeroes {
    public int[][] setMatrixZeroes(int[][] matrix){
        if(matrix==null || matrix.length==0)
            return matrix;
        boolean[] row=new boolean[matrix.length];
        boolean[] col=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]){
                Arrays.fill(matrix[i],0);
            }
        }
        for(int j=0;j<col.length;j++){
            if(col[j]){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
}
