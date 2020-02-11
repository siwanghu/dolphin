package com.siwanghu.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NextPermutation {
    /*
    * 求下一个字典序排列
    * */
    public int[] nextPermutation(int[] array){
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(array==null || array.length<2)
            return array;
        for(int i=array.length-1;i>=0;i--){
            if(i==0){
                Arrays.sort(array);
                return array;
            }else if(array[i]>array[i-1]){
                int start=i-1;
                for(int j=array.length-1;j>start;j--){
                    if(array[j]>array[start]){
                        int temp=array[j];
                        array[j]=array[start];
                        array[start]=temp;
                        break;
                    }
                }
                Arrays.sort(array,start+1,array.length);
                break;
            }
        }
        return array;
    }
}
