package com.siwanghu;

public class RemoveElement {
    /*
    * 从数组中删除给定的数，并返回结果数组的长度
    * */
    public int removeElement(int[] array,int target){
        if(array==null || array.length==0)
            return 0;
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=target){
                array[index]=array[i];
                index++;
            }
        }
        return index;
    }
}
