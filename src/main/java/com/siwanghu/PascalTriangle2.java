package com.siwanghu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PascalTriangle2 {
    /*
    * 给定一个index，返回Pascal三角形的第index行
    * index从0开始
    * */
    public ArrayList<Integer> pascalTriangle2(int index){
        ArrayList<Integer> row=new ArrayList<Integer>(index+1);
        ArrayList<Integer> temp=new ArrayList<Integer>(index+1);
        if(index<0)
            return row;
        else if(index==0){
            row.add(1);
            return row;
        }else{
            for(int i=1;i<=index;i++){
                row.clear();
                row.add(1);
                for(int j=1;j<i;j++){
                    row.add(temp.get(j-1)+temp.get(j));
                }
                row.add(1);
                Collections.addAll(temp,new Integer[row.size()]);
                Collections.copy(temp,row);
            }
            return row;
        }
    }
}
