package com.siwanghu.array;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] array,int plus){
        if(array==null || array.length==0)
            return array;
        int digit=0;
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                if(array[i]+digit<=9){
                    array[i]=array[i]+digit;
                    return array;
                }else{
                    int[] result=new int[array.length+1];
                    digit=(array[i]+digit)/10;
                    array[i]=(array[i]+digit)%10;
                    System.arraycopy(array,0,result,0,array.length);
                    result[result.length-1]=digit;
                    return result;
                }
            }else if(i==0){
                if(array[i]+plus<=9){
                    array[i]=array[i]+plus;
                    return array;
                }else{
                    digit=(array[i]+plus)/10;
                    array[i]=(array[i]+plus)%10;
                }
            }
            else{
                if(array[i]+digit<=9){
                    array[i]=array[i]+digit;
                    return array;
                }else{
                    digit=(array[i]+digit)/10;
                    array[i]=(array[i]+digit)%10;
                }
            }
        }
        throw new RuntimeException("error!");
    }
}
