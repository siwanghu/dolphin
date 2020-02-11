package com.siwanghu.array;

public class ProductofArrayExceptSelf {
    public int[] productofArrayExceptSelf(int[] array){
        if(array==null || array.length==0)
            return array;
        int[] left=new int[array.length];
        int[] right=new int[array.length];
        int mul=1;
        for(int i=0;i<array.length;i++){
            left[i]=mul;
            mul*=array[i];
        }
        mul=1;
        for(int i=array.length-1;i>=0;i--){
            right[i]=mul;
            mul*=array[i];
        }
        for(int i=0;i<array.length;i++){
            array[i]=left[i]*right[i];
        }
        return array;
    }
}
