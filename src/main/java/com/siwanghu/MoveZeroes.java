package com.siwanghu;

public class MoveZeroes {
    public int[] moveZeroes(int[] array){
        if(array==null || array.length==0)
            return array;
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[index]=array[i];
                index++;
            }
        }
        while(index<array.length){
            array[index]=0;
            index++;
        }
        return array;
    }
}
