package com.siwanghu;

public class RotateArray {
    public int[] rotateArray(int n,int k){
        if(n<1 || k>n)
            throw new RuntimeException("input error!");
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        if(k==n)
            return array;
        reverse(array,0,n-k-1);
        reverse(array,n-k,n-1);
        reverse(array,0,n-1);
        return array;
    }

    private void reverse(int[] array,int start,int end){
        for(int i=start,j=end;j>i;i++,j--){
            int temp=array[j];
            array[j]=array[i];
            array[i]=temp;
        }
    }
}
