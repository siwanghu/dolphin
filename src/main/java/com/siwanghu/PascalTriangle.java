package com.siwanghu;

import java.util.ArrayList;

public class PascalTriangle {
    /*
    * 给定numRows，生成numRows帕斯卡三角形
    * */
    public ArrayList<int[]> pascalTriangle(int numRows){
        ArrayList<int[]> pascal=new ArrayList<int[]>();
        if(numRows<1)
            return pascal;
        else{
            for(int numRow=1;numRow<=numRows;numRow++){
                int[] row=new int[numRow];
                if(numRow==1){
                    row[0]=1;
                    pascal.add(row);
                }else if(numRow==2){
                    row[0]=1;
                    row[1]=1;
                    pascal.add(row);
                }else{
                    row[0]=1;
                    row[numRow-1]=1;
                    for(int i=1;i<numRow-1;i++){
                        row[i]=pascal.get(numRow-2)[i-1]+pascal.get(numRow-2)[i];
                    }
                    pascal.add(row);
                }
            }
            return pascal;
        }
    }
}
