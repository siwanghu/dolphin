package com.siwanghu;

public class MajorityElement {
    public int majorityElement(int[] array){
        if(array==null || array.length==0)
            throw new RuntimeException("input error!");
        int majority=0,count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==majority)
                count++;
            else
                count--;
            if(count==0){
                majority=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==array[majority])
                count++;
        }
        return count>=array.length/2?array[majority]:-1;
    }
}
