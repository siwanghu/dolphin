package com.siwanghu.array;

public class RemoveDuplicates {
    /*
    * 给定一个已排序的数组，删除重复项，以使每个元素仅出现一次并返回新的长度
    * 不能使用额外分配的空间
    * */
    public int removeDuplicates(int[] array){
        if(array==null || array.length==0)
            return 0;
        else if(array.length==1)
            return array.length;
        else{
            int length=array.length,start=0;
            for(int i=1;i<length;i++){
                if(array[i]==array[start]){
                    for(int j=i;j<array.length;j++){
                        array[j-1]=array[j];
                    }
                    length--;
                }
                start++;
            }
            return length;
        }
    }
}
