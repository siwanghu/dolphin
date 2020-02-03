package com.siwanghu;

public class RemoveDuplicates2 {
    /*
    * 给定一个已排序的数组，删除重复项，以使每个元素最多出现2次，返回新的长度
    * 不能使用额外分配的空间
    * */
    public int removeDuplicates2(int[] array){
        if(array==null)
            return 0;
        else if(array.length<2)
            return array.length;
        else{
            int length=array.length,start=0,count=1;
            for(int i=1;i<length;i++){
                if(array[i]==array[start]){
                    count++;
                    if(count>2){
                        for(int j=i-1;j<array.length;j++){
                            array[j-1]=array[j];
                        }
                        length--;
                        count--;
                        i--;
                    }
                }else {
                    start = i;
                    count = 1;
                }
            }
            return length;
        }

    }
}
