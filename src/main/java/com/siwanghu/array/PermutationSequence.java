package com.siwanghu.array;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationSequence {
    public int[] permutationSequence(int n,int k){
        if(n<1 || n>9)
            return null;
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=i+1 ;
        }
        if(k>factorial(n) || k==1)
            return array;
        for(int sequence=1;sequence<k;sequence++){
            boolean flag=true;
            for(int i=array.length-1;i>=0 && flag;i--){
                if(array[i]>array[i-1]){
                    int start=i-1;
                    for(int j=array.length-1;j>=i;j--){
                        if(array[j]>array[start]){
                            int temp=array[j];
                            array[j]=array[start];
                            array[start]=temp;
                            Arrays.sort(array,start+1,array.length);
                            flag=false;
                            break;
                        }
                    }
                }
            }
        }
        return array;
    }

    public ArrayList<Integer> permutationSequenceV2(int n, int k){
        ArrayList<Integer> result=new ArrayList<Integer>();
        ArrayList<Integer> nums=new ArrayList<Integer>();
        if(n<1 || n>9)
            return result;
        int fact=1;
        for(int i=1;i<n;i++){
            fact=fact*i;
        }
        for(int i=0;i<n;i++){
            nums.add(i+1);
        }
        if(k>fact*n || k==1)
            return nums;
        int rank=k-1;
        for(int i=n-1;i>=1;i--){
            int index=rank/fact;
            result.add(nums.remove(index));
            rank%=fact;
            fact/=i;
        }
        result.add(nums.remove(0));
        return result;
    }

    private int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

}
